import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttonHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if (Adventures.win){
			System.exit(0);
		}
		else{
			System.out.println(Gui.input.getText());
			Adventures.gamerun(Gui.input.getText());
			Gui.outdisplay.setText(Adventures.renderDisplay());
		
		Gui.input.setText("Where would you like to go?");
		Gui.input.grabFocus();
		}
	}

}
