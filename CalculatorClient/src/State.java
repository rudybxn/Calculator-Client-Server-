import java.awt.event.*;

public abstract class State {
	public Context ctx;
	
	public State(Context c) {
		this.ctx=c;
	}
	public State() {
		
	}
	public void stateChange(ActionEvent e) {}
	
	public void setContext(Context c) {
		this.ctx = c;
	}
	
	public Context getContext() {
		return this.ctx;
	}
	
}
