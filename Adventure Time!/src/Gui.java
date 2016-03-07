import java.awt.*;


import javax.swing.*;

public class Gui extends JFrame{
	
	private static final long serialVersionUID = 1L;
	static JLabel outdisplay = new JLabel();
	JButton button = new JButton("Enter");
	static JTextArea input = new JTextArea("Welcome! Just Find THe Door.");
	
	buttonHandler continueButton = new buttonHandler();
	public Gui() {
		button.addActionListener(continueButton);
		JFrame frame = new JFrame();
		frame.setSize(600,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setTitle("Get to the Door");
		
		Container pane = frame.getContentPane();
		pane.setLayout(new GridLayout(3,1));
		
		
		pane.add(outdisplay);
		pane.add(input);
		pane.add(button);
		
		
		

		
	}
	
public static void main(String[] args) {

	Map.create();
	
	Gui start = new Gui();
	Adventures.gamerun(Gui.input.getText());
	input.setText("where would you like to go");
	
	

}
	
}

