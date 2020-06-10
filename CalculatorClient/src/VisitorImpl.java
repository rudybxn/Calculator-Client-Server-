
public class VisitorImpl implements Visitor{

	@Override
	public void visitOperator(Operation operation) {
		operation.accept(this); 
	}

	@Override
	public void visitNumber(Operation operand) {
		operand.accept(this); 
	}

	@Override
	public void visitOperation(Operation oper) {
		oper.accept(this);
	}

}