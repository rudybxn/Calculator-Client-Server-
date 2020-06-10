import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;


public class Context implements ActionListener{
	private View Calcview;
	private Vector<Operation> currentset = new Vector<Operation>();
	private Vector<Operation> operationset = new Vector<Operation>();
	private Operation firstnumber = new Number();
	private Operation secondnumber= new Number();
	private Operation operator = new Operator();
	private State activeState = new StartState(this);
	
	public void actionPerformed(ActionEvent e)
	 {
	try {
		String operands = "+-*/";
		 String str = e.getActionCommand();
		 // if(str.contains("*")||str.contains("+")||str.contains("-")||str.contains("/") && checkempty(firstnumber, secondnumber,operator)) {
		  if((operands.contains(str)) && !checkempty(firstnumber, secondnumber, operator)){
			if(operationset.isEmpty()){
				Number a =  new Number(firstnumber.getVal());//create number for each operand
				Number b = new Number(secondnumber.getVal());
				Operator op = new Operator(operator.getVal());
				operationset.addElement(a); //add into equation set
				operationset.addElement(op);
				operationset.addElement(b);
	            currentset.add(firstnumber);
	            currentset.add(operator);
	            currentset.add(secondnumber);
			 }
			  else {
				  Operator op = new Operator(operator.getVal());
				  Number num =  new Number(secondnumber.getVal());
				 operationset.add(op);
				 operationset.add(num);				  
				 currentset.add(1,operator);
				 currentset.add(2, secondnumber);
				  
				  
			  }
			  firstnumber.setVal(secondnumber.getVal());
			  secondnumber.setVal("");
		  }
		  
		  this.activeState.stateChange(e);
		  if(this.activeState instanceof CalculateState) {
			  if(!operationset.isEmpty()) {
				  operationset.add(operator);
				  operationset.add(secondnumber);
				  currentset.add(operator);
				  currentset.add(secondnumber);
			  }
			  else {
				  operationset.add(firstnumber);
				  operationset.add(operator);
				  operationset.add(secondnumber);
				  currentset.add(firstnumber);
				  currentset.add(operator);
				  currentset.add(secondnumber);
			  }
			  String newnum = updatePanel();
			  Operation eq = new Operator("=");
			  Operation sum = new Number(newnum);
			  operationset.add(eq);
			  operationset.add(sum);
			  communicate();
			  
			  
			  operationset.removeAll(operationset);
			  currentset.removeAll(currentset);
			  firstnumber.setVal("");
			  secondnumber.setVal("");
			  operator.setVal(null);
			  
		  }
		  else if(this.activeState instanceof WaitOperandState) {
			  this.operator.setVal(str);
		  }
		}catch(Exception err) {
			System.out.println("Error caught in context class.");
		} 
	 }
	
	
	public String updatePanel(){
		  double answer=0; 
		  double firstnum = Double.parseDouble(currentset.get(0).getVal());
		  double secondnum = Double.parseDouble(currentset.get(2).getVal());
		  String operator = currentset.get(1).getVal(); //to receive operator sign
			
			if(operator.equals("+")){
				answer = firstnum + secondnum;
			}
			if(operator.equals("*")){
				answer = firstnum * secondnum;
			}
			if(operator.equals("-")){
				answer = firstnum - secondnum;
			}
			if(operator.equals("/")){
				answer = firstnum/secondnum;
			}
			Operation newOperation = new Number(Double.toString(answer));
			Calcview.changeResult(Double.toString(answer));
			currentset.set(0, newOperation);
			currentset.remove(1);
			currentset.remove(1);
			String finalsum = Double.toString(answer);
			Calcview.changeResult(finalsum);
			return finalsum;
	}
	
	
	public void communicate() throws Exception{
		Vector<String> fullset = new Vector<String>();
		Socket clientsocket = new Socket("127.0.0.1", 1024);
		OutputStream output = clientsocket.getOutputStream();
		ObjectOutputStream objoutput = new ObjectOutputStream(output);
		
		for(int i =0;i<operationset.size();i++) {
			String v = operationset.get(i).getVal();
			System.out.println(v);
			fullset.addElement(v);
		}
		objoutput.writeObject(fullset);
		objoutput.close();
		clientsocket.close();
	}
	
	public State getState(){
		return this.activeState;
	}
	
	public String getFirst(){ 
		return this.firstnumber.getVal();
	}
	
	public String getSecond() {
		return this.secondnumber.getVal();
	}
	public void setState(State s){
		this.activeState = s;
	}
	
	
	public View getView(){
		return this.Calcview;
	}
	
	public void setCalculator(View calc) {
		this.Calcview = calc;
		}
	
	public void setFirst(String first){ 
		this.firstnumber.setVal(first); 
	}
	
	public void setSecond(String second) { 
		this.secondnumber.setVal(second);
	}
	
	private boolean checkempty(Operation firstoperand, Operation secondoperand, Operation operand){
		if((firstoperand.getVal() == "" && secondoperand.getVal() == "" ) && operand.getVal() == null)
			return false;
		else
			return true;
	}
}