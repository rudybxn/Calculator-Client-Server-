import java.util.*;

public abstract class Operation {
	
	protected Vector<Operation> alloperation = new Vector<Operation>();
	String val="";
	public Operation() {
		
	}
	
	public Operation(String s) {
		this.val =s;
	}
	
	public Operation(Object s) {
		// TODO Auto-generated constructor stub
	}


	public Operation getOperation() {
		return this;
	}
	
	public void add(Operation o) {
		this.alloperation.add(o);
	}
	
	public String getVal() {
		return this.val;
	}
	
	public void setVal(String v) {
		this.val=v;
	}

	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}
}
