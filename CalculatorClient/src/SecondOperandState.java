import java.awt.event.*;

public class SecondOperandState extends State{

	public SecondOperandState(Context context) {
		super(context);
	}

	@Override
	public void stateChange(ActionEvent e) {
		try {
		String str = e.getActionCommand();
		
		switch(str) {
		case "0":
			this.ctx.getView().changeResult(ctx.getSecond() + str);
			this.ctx.setSecond(ctx.getSecond() + str); //change state for second operand to reflect input
			break;
		case "1":
			this.ctx.getView().changeResult(ctx.getSecond() + str);
			this.ctx.setSecond(ctx.getSecond() + str);
			break;
		case "2":
			this.ctx.getView().changeResult(ctx.getSecond() + str);
			this.ctx.setSecond(ctx.getSecond() + str);
			break;
		case "3":
			this.ctx.getView().changeResult(ctx.getSecond() + str);
			this.ctx.setSecond(ctx.getSecond() + str);
			break;
		case "4":
			this.ctx.getView().changeResult(ctx.getSecond() + str);
			this.ctx.setSecond(ctx.getSecond() + str);
			break;
		case "5":
			this.ctx.getView().changeResult(ctx.getSecond() + str);
			this.ctx.setSecond(ctx.getSecond() + str);
			break;
		case "6":
			this.ctx.getView().changeResult(ctx.getSecond() + str);
			this.ctx.setSecond(ctx.getSecond() + str);
			break;
		case "7":
			this.ctx.getView().changeResult(ctx.getSecond() + str);
			this.ctx.setSecond(ctx.getSecond() + str);
			break;
		case "8":
			this.ctx.getView().changeResult(ctx.getSecond() + str);
			this.ctx.setSecond(ctx.getSecond() + str);
			break;
		case "9":
			this.ctx.getView().changeResult(ctx.getSecond() + str);
			this.ctx.setSecond(ctx.getSecond() + str);
			break;
		case "+":
			this.ctx.setState(new WaitOperandState(this.ctx));
			break;
		case "-":
			this.ctx.setState(new WaitOperandState(this.ctx));
			break;
		case "/":
			this.ctx.setState(new WaitOperandState(this.ctx));
			break;
		case "*":
			this.ctx.setState(new WaitOperandState(this.ctx));
			break;
		case "C":
			this.ctx.setFirst("");
			this.ctx.setSecond("");
			this.ctx.getView().changeResult("");
			this.ctx.setState(new StartState(this.ctx));
			break;
		case "=":
			this.ctx.setState(new CalculateState(this.ctx));
			break;
		default: //for both Reset and Discard
			this.ctx.setState(new ErrorState(this.ctx));
			this.ctx.getView().changeResult("ERROR");
			break;
		
		}
	}catch(Exception exc) {
		exc.printStackTrace();
		}
	}

}