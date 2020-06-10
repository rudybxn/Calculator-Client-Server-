
public class Operator extends Operation{
	
	public Operator(){}
	
	public Operator(String value) {
		super(value);
	}
	
	public void setValue(String operand){
		this.val = operand;
	}
	
	public String getVal() {
		return this.val;
	}
	
	@Override
	public void accept(Visitor v) {
		v.visitOperator(this);
	}
}