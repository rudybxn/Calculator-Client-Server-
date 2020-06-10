import java.awt.event.ActionEvent;

public class ErrorState extends State{

	public ErrorState(Context context) {
		super(context);
	}

	@Override
	public void stateChange(ActionEvent e) {
		try {
		String str = e.getActionCommand();
		switch(str) {
		case "C": //only one button changes this state
			this.ctx.setFirst("");
			this.ctx.setSecond("");
			this.ctx.getView().changeResult("");
			this.ctx.setState(new StartState(this.ctx)); //clean slate for calculator
			break;
			
		default: //for Res and Disc
			this.ctx.setState(new ErrorState(this.ctx));
			this.ctx.getView().changeResult("ERROR");
			break;
		
		}
		
	}catch(Exception exc) {
		exc.printStackTrace();
	}
		
	}
}