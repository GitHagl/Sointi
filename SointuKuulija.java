import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SointuKuulija implements ActionListener{
	int i;
	JButton[] soinnusto;
	JFrame fraami3;
	SointuNappi sointuNappi;
	SointuNappi sointuNappiTaulu;
	SointuNappi[] sointuNapisto;
	int sointuTaulu;
	JButton nappiVari;
	JButton nappi;
	FinalVarjaaja varjaaja;
	Color valkoVari = new Color (130, 180, 175);
	
	public SointuKuulija(JButton nappi2, SointuNappi[] sointu, JFrame fram, FinalVarjaaja vari) {
		nappi = nappi2;
		sointuNapisto = sointu;
		fraami3 = fram;
		varjaaja = vari;	
	}
	
	public void actionPerformed(ActionEvent e) {
		
		//tyhjennet‰‰n aiemmat sointujen v‰rj‰ykset

		if (e.getSource() == nappi){
			//etsit‰‰n painettu sointunappi
			for (i = 0; i < 66; i++){
				sointuNappi = sointuNapisto[i];
				if (nappi == sointuNappi.getButton()){
					i = 66;
				}
			}	
			
			//v‰rj‰t‰‰n painamaton nappi tai palautetaan painettu nappi l‰htˆtilaan
			if (sointuNappi.getPainettu()) {
				sointuNappi.setPainettu(false);
				varjaaja.setSointu(null);
				sointuNappi.setBGDef();
				varjaaja.tyhjenna();
				
			} else {
				for (i = 0; i < 66; i++){
					sointuNappiTaulu = sointuNapisto[i];
					sointuNappiTaulu.setBGDef();
					sointuNappiTaulu.setPainettu(false);
				}
				sointuNappi.setPainettu(true);
				sointuNappi.setBGVari();
				varjaaja.setSointu(sointuNappi);
				varjaaja.tyhjenna();
				varjaaja.varjaa();
			}

		//palautetaan focus framelle
		fraami3.requestFocus();
		}
	}
}