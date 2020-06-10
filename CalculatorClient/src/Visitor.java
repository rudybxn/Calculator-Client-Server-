
public interface Visitor {
	public void visitOperator(Operation operation);
	public void visitNumber(Operation num);
	public void visitOperation(Operation oper);
}