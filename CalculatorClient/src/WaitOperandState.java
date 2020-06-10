
import java.awt.event.*;

public class WaitOperandState extends State{

	public WaitOperandState(Context context) {
		super(context);
	}

	@Override
	public void stateChange(ActionEvent e) {
		String s= e.getActionCommand();
	/*	if(value.equals("0")){
			this.ctx.getView().updateResult(context.getSecond() + s);
			this.ctx.setSecond(context.getSecond() + s);
			this.ctx.setState(new SecondOperandState(this.ctx));
		*/

		switch(s) {
		
		case "0":
			this.ctx.getView().changeResult(ctx.getSecond() + s); //change calc view
			this.ctx.setSecond(ctx.getSecond() + s);
			this.ctx.setState(new SecondOperandState(this.ctx)); //move over to second number input state
			break;
		case "1":
			this.ctx.getView().changeResult(ctx.getSecond() + s);
			this.ctx.setSecond(ctx.getSecond() + s);
			this.ctx.setState(new SecondOperandState(this.ctx));
			break;
		case "2":
			this.ctx.getView().changeResult(ctx.getSecond() + s);
			this.ctx.setSecond(ctx.getSecond() + s);
			this.ctx.setState(new SecondOperandState(this.ctx));
			break;
		case "3":
			this.ctx.getView().changeResult(ctx.getSecond() + s);
			this.ctx.setSecond(ctx.getSecond() + s);
			this.ctx.setState(new SecondOperandState(this.ctx));
			break;
		case "4":
			this.ctx.getView().changeResult(ctx.getSecond() + s);
			this.ctx.setSecond(ctx.getSecond() + s);
			this.ctx.setState(new SecondOperandState(this.ctx));
			break;
		case "5":
			this.ctx.getView().changeResult(ctx.getSecond() + s);
			this.ctx.setSecond(ctx.getSecond() + s);
			this.ctx.setState(new SecondOperandState(this.ctx));
			break;
		case "6":
			this.ctx.getView().changeResult(ctx.getSecond() + s);
			this.ctx.setSecond(ctx.getSecond() + s);
			this.ctx.setState(new SecondOperandState(this.ctx));
			break;
		case "7":
			this.ctx.getView().changeResult(ctx.getSecond() + s);
			this.ctx.setSecond(ctx.getSecond() + s);
			this.ctx.setState(new SecondOperandState(this.ctx));
			break;
		case "8":
			this.ctx.getView().changeResult(ctx.getSecond() + s);
			this.ctx.setSecond(ctx.getSecond() + s);
			this.ctx.setState(new SecondOperandState(this.ctx));
			break;
		case "9":
			this.ctx.getView().changeResult(ctx.getSecond() + s);
			this.ctx.setSecond(ctx.getSecond() + s);
			this.ctx.setState(new SecondOperandState(this.ctx));
			break;
		case "C":
			this.ctx.setState(new StartState(this.ctx));
			break;
		default: //for Res and Disc
			this.ctx.setState(new ErrorState(this.ctx));
			this.ctx.getView().changeResult("ERROR");
			break;
		
		}
	}


}
