import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HelpKuulija implements ActionListener{
	JButton helpNappi;
	JFrame helpFraami;
	JFrame paaFraami;

	
	public HelpKuulija(JButton nappi, JFrame help, JFrame paa) {
		helpNappi = nappi;
		helpFraami = help;
		paaFraami = paa;
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == helpNappi){
			helpFraami.setVisible(true);
			paaFraami.requestFocus();
		}	
	
	}
}