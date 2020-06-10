import java.awt.event.*;

public class CalculateState extends State{

	public CalculateState(Context context) {
		super(context);
	}

	@Override
	public void stateChange(ActionEvent e) {
		try {
		String str = e.getActionCommand();//store the current event press in string 
		
		/*if(str.equals("0")){
		this.context.getView().updateResult(context.getSecond() + str);
		this.context.setSecond(context.getSecond() + str);
		this.context.setState(new SecondOperandState(this.context));
	*/
		
		
		switch(str) { //check every possible button
		
		case "0":
			this.ctx.setFirst(str);
			this.ctx.setSecond("");
			this.ctx.setState(new FirstOperandState(this.ctx)); //change state to first number accept state
			this.ctx.getView().changeResult(str); //change calc view
			break;
		case "1":
			this.ctx.setFirst(str);
			this.ctx.setSecond("");
			this.ctx.setState(new FirstOperandState(this.ctx));
			this.ctx.getView().changeResult(str);
			break;
		case "2":
			this.ctx.setFirst(str);
			this.ctx.setSecond("");
			this.ctx.setState(new FirstOperandState(this.ctx));
			this.ctx.getView().changeResult(str);
			break;
		case "3":
			this.ctx.setFirst(str);
			this.ctx.setSecond("");
			this.ctx.setState(new FirstOperandState(this.ctx));
			this.ctx.getView().changeResult(str);
			break;
		case "4":
			this.ctx.setFirst(str);
			this.ctx.setSecond("");
			this.ctx.setState(new FirstOperandState(this.ctx));
			this.ctx.getView().changeResult(str);
			break;
		case "5":
			this.ctx.setFirst(str);
			this.ctx.setSecond("");
			this.ctx.setState(new FirstOperandState(this.ctx));
			this.ctx.getView().changeResult(str);
			break;
		case "6":
			this.ctx.setFirst(str);
			this.ctx.setSecond("");
			this.ctx.setState(new FirstOperandState(this.ctx));
			this.ctx.getView().changeResult(str);
			break;
		case "7":
			this.ctx.setFirst(str);
			this.ctx.setSecond("");
			this.ctx.setState(new FirstOperandState(this.ctx));
			this.ctx.getView().changeResult(str);
			break;
		case "8":
			this.ctx.setFirst(str);
			this.ctx.setSecond("");
			this.ctx.setState(new FirstOperandState(this.ctx));
			this.ctx.getView().changeResult(str);
			break;
		case "9":
			this.ctx.setFirst(str);
			this.ctx.setSecond("");
			this.ctx.setState(new FirstOperandState(this.ctx));
			this.ctx.getView().changeResult(str);
			break;
		case "+":
			this.ctx.setFirst("");
			this.ctx.setSecond("");
			this.ctx.getView().changeResult(" ");
			this.ctx.setState(new StartState(this.ctx));
			break;
		case "-":
			this.ctx.setFirst("");
			this.ctx.setSecond("");
			this.ctx.getView().changeResult(" ");
			this.ctx.setState(new StartState(this.ctx));
			break;
		case "/":
			this.ctx.setFirst("");
			this.ctx.setSecond("");
			this.ctx.getView().changeResult(" ");
			this.ctx.setState(new StartState(this.ctx));
			break;
		case "*":
			this.ctx.setFirst("");
			this.ctx.setSecond("");
			this.ctx.getView().changeResult(" ");
			this.ctx.setState(new StartState(this.ctx));
			break;
		case "C":
			this.ctx.setFirst("");
			this.ctx.setSecond("");
			this.ctx.getView().changeResult(" ");
			this.ctx.setState(new StartState(this.ctx)); //clean slate for calculator
			break;
			
		default: //for Reset and Discard
			this.ctx.setState(new ErrorState(this.ctx));
			this.ctx.getView().changeResult("ERROR");
			//this.context.getView().add();
			break;
		
		}
	}catch(Exception exc) {
		exc.printStackTrace();
	}
	}
}