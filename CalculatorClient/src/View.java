
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View extends JFrame{
	
	private JLabel display;
	JPanel buttons;
	JPanel panel ;

	public View(){
		super("Calculator");
		panel = new JPanel();
		add(panel, BorderLayout.PAGE_START);
		display = new JLabel(" ");
		panel.add(display);
		buttons = new JPanel();
		add(buttons, BorderLayout.CENTER);
		buttons.setLayout(new GridLayout(5,5,0,0));
		setVisible(true);
		
		buttons.add(new JButton("1"));
		buttons.add(new JButton("2"));
		buttons.add(new JButton("3"));
		buttons.add(new JButton("C"));
		buttons.add(new JButton("4"));
		buttons.add(new JButton("5"));
		buttons.add(new JButton("6"));
		buttons.add(new JButton("+"));
		buttons.add(new JButton("7"));
		buttons.add(new JButton("8"));
		buttons.add(new JButton("9"));
		buttons.add(new JButton("-"));
		buttons.add(new JButton("0"));
		buttons.add(new JButton("*"));
		buttons.add(new JButton("/"));
		buttons.add(new JButton("="));
		buttons.add(new JButton("Res"));
		buttons.add(new JButton("Disc"));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);

	}
	
	public void attach(ActionListener l) {
		for(Component comp: buttons.getComponents()) {
			 ((JButton)comp).addActionListener(l);
		}
	}
	
	public void changeResult(String val) {
		display.setText(val);
	}

}