import java.awt.event.*;

public class StartState extends State{

	public StartState(Context context) {
		super(context);
	}

	@Override
	public void stateChange(ActionEvent e) {
		try {
		String str = e.getActionCommand();

		switch(str) {
		
		case "0":
			this.ctx.setFirst(str);
			this.ctx.getView().changeResult(str);
			this.ctx.setState(new FirstOperandState(this.ctx));
			break;
		case "1":
			this.ctx.setFirst(str);
			this.ctx.getView().changeResult(str);
			this.ctx.setState(new FirstOperandState(this.ctx));
			break;
		case "2":
			this.ctx.setFirst(str);
			this.ctx.getView().changeResult(str);
			this.ctx.setState(new FirstOperandState(this.ctx));
			break;
		case "3":
			this.ctx.setFirst(str);
			this.ctx.getView().changeResult(str);
			this.ctx.setState(new FirstOperandState(this.ctx));
			break;
		case "4":
			this.ctx.setFirst(str);
			this.ctx.getView().changeResult(str);
			this.ctx.setState(new FirstOperandState(this.ctx));
			break;
		case "5":
			this.ctx.setFirst(str);
			this.ctx.getView().changeResult(str);
			this.ctx.setState(new FirstOperandState(this.ctx));
			break;
		case "6":
			this.ctx.setFirst(str);
			this.ctx.getView().changeResult(str);
			this.ctx.setState(new FirstOperandState(this.ctx));
			break;
		case "7":
			this.ctx.setFirst(str);
			this.ctx.getView().changeResult(str);
			this.ctx.setState(new FirstOperandState(this.ctx));
			break;
		case "8":
			this.ctx.setFirst(str);
			this.ctx.getView().changeResult(str);
			this.ctx.setState(new FirstOperandState(this.ctx));
			break;
		case "9":
			this.ctx.setFirst(str);
			this.ctx.getView().changeResult(str);
			this.ctx.setState(new FirstOperandState(this.ctx));
			break;
		default:
			this.ctx.setState(new StartState(this.ctx));
			this.ctx.getView().changeResult("");
			break;
		
		}
		
	}catch(Exception exc) {
		exc.printStackTrace();
	}
	}
}