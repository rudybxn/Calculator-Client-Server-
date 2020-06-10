
public class Number extends Operation{

	public Number(){}
	
	public Number(String value) {
		super(value);
	}

	@Override
	public void accept(Visitor v) {
		v.visitNumber(this);
	}
	
	public void setValue(String operand){
		this.val = operand;
	}
	
	public String getVal() {
		return this.val;
	}
}