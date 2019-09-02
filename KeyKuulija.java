import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class KeyKuulija implements KeyListener {
	int i;
	int suunta;
	boolean bolle;
	Kosketin kosk;
	Kosketin koskTaulu;
	JButton nappiVari;
	JFrame inst;
	SointuNappi painettu;
	SointuNappi uusPaino;
	Kosketin[] koskettimisto;
	SointuNappi sointuNappi;
	SointuNappi[] sointuNapisto;
	FinalVarjaaja varjaaja;
	Color valkoVari = new Color (130, 180, 175);
    Color mustaVari = new Color (110, 170, 160);

	public KeyKuulija(Kosketin[] piano, SointuNappi[] sointunap, FinalVarjaaja vari, JFrame ohje){
		koskettimisto = piano;
		sointuNapisto = sointunap;
		varjaaja = vari;
		inst = ohje;
	}
	
	public void keyPressed(KeyEvent e) {
		
    	//luetaan varjayksen kohde nappaimistolta ja varjataan se
    	
		if (e.getKeyCode() == KeyEvent.VK_A){
			tyhjennaPianosto();
			varjaaKosketin(koskettimisto[0]);
		}else if (e.getKeyCode() == KeyEvent.VK_W){
			tyhjennaPianosto();
			varjaaKosketin(koskettimisto[1]);
		}else if (e.getKeyCode() == KeyEvent.VK_S){
			tyhjennaPianosto();
			varjaaKosketin(koskettimisto[2]);
		}else if (e.getKeyCode() == KeyEvent.VK_E){
			tyhjennaPianosto();
			varjaaKosketin(koskettimisto[3]);
		}else if (e.getKeyCode() == KeyEvent.VK_D){
			tyhjennaPianosto();
			varjaaKosketin(koskettimisto[4]);
		}else if (e.getKeyCode() == KeyEvent.VK_F){
			tyhjennaPianosto();
			varjaaKosketin(koskettimisto[5]);
		}else if (e.getKeyCode() == KeyEvent.VK_T){
			tyhjennaPianosto();
			varjaaKosketin(koskettimisto[6]);
		}else if (e.getKeyCode() == KeyEvent.VK_G){
			tyhjennaPianosto();
			varjaaKosketin(koskettimisto[7]);
		}else if (e.getKeyCode() == KeyEvent.VK_Y){
			tyhjennaPianosto();
			varjaaKosketin(koskettimisto[8]);
		}else if (e.getKeyCode() == KeyEvent.VK_H){
			tyhjennaPianosto();
			varjaaKosketin(koskettimisto[9]);
		}else if (e.getKeyCode() == KeyEvent.VK_U){
			tyhjennaPianosto();
			varjaaKosketin(koskettimisto[10]);
		}else if (e.getKeyCode() == KeyEvent.VK_J){
			tyhjennaPianosto();
			varjaaKosketin(koskettimisto[11]);
		
		//luetaan nuolin‰pp‰in ja siirret‰‰n valintaa sointutaulukossa
		
		}else if (e.getKeyCode() == KeyEvent.VK_UP){
			tyhjennaSointu();
			suunta = 1;
			varjaaSointu();
		}else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
			tyhjennaSointu();
			suunta = 2;
			varjaaSointu();
		}else if (e.getKeyCode() == KeyEvent.VK_DOWN){
			tyhjennaSointu();
			suunta = 3;
			varjaaSointu();
		}else if (e.getKeyCode() == KeyEvent.VK_LEFT){
			tyhjennaSointu();
			suunta = 4;
			varjaaSointu();
		
		//sointuvalinnan peruutus
			
		}else if (e.getKeyCode() == KeyEvent.VK_ESCAPE){
			tyhjennaSointu();
			varjaaja.setSointu(null);
    		varjaaja.tyhjenna();
    		
    	//instructions-ikkuna
    		
		}else if (e.getKeyCode() == KeyEvent.VK_F1){
			inst.setVisible(true);
		}
		
		
	}

	public void keyReleased(KeyEvent e) {
	
	}

	public void keyTyped(KeyEvent e) {
		
	}
	
	//aiempien kosketinvarjayksien tyhjennys
	public void tyhjennaPianosto() {
		
		for (i = 0; i < 36; i++) {
		
    		koskTaulu = koskettimisto[i];
    		if (koskTaulu.getVari() == false){
    			nappiVari = koskTaulu.getNappi1();
        		nappiVari.setBackground(Color.BLACK);
        		nappiVari = koskTaulu.getNappi2();
                nappiVari.setBackground(Color.BLACK);
    		} else {
    			nappiVari = koskTaulu.getNappi1();
        		nappiVari.setBackground(Color.WHITE);
        		nappiVari = koskTaulu.getNappi2();
                nappiVari.setBackground(Color.WHITE);
    		}           
    	}
	}
	
	//varjataan nappaimistolla valittu kosketin
	public void varjaaKosketin(Kosketin koski2){
		
		kosk = koski2;
		
		if (kosk.getPainettu() == false){
    		
    		if (kosk.getVari() == false){
    			nappiVari = kosk.getNappi1();
        		nappiVari.setBackground(mustaVari);
        		nappiVari = kosk.getNappi2();
        		nappiVari.setBackground(mustaVari);
        	} else {
        		nappiVari = kosk.getNappi1();
        		nappiVari.setBackground(valkoVari);
        		nappiVari = kosk.getNappi2();
        		nappiVari.setBackground(valkoVari);
        	}
        	
    		i = 0;
        	while (i < 36){
        		koskTaulu = koskettimisto[i];
        		koskTaulu.setPainettu(false);
        		i++;
        	}	
    		kosk.setPainettu(true);
    		varjaaja.setKosketin(kosk);
    		varjaaja.tyhjenna();
    		varjaaja.varjaa();
    		
    	} else {
    		if (kosk.getVari() == false) {
        		nappiVari = kosk.getNappi1();
        		nappiVari.setBackground(Color.BLACK);
        		nappiVari = kosk.getNappi2();
        		nappiVari.setBackground(Color.BLACK);
        	} else {
        		nappiVari = kosk.getNappi1();
        		nappiVari.setBackground(Color.WHITE);
        		nappiVari = kosk.getNappi2();
        		nappiVari.setBackground(Color.WHITE);
        		}
    		i = 0;
        	while (i < 36){
        		koskTaulu = koskettimisto[i];
        		koskTaulu.setPainettu(false);
        		i++;
        	}
        	varjaaja.resetKosketin();
        	varjaaja.tyhjenna();
        	varjaaja.varjaa();
 
    	}
	}
	
	//kysyt‰‰n onko mik‰‰n sointu painettuna
	public boolean kysySointu(){
		
		bolle = false;
		for (i = 0; i < 66; i++) {
			sointuNappi = sointuNapisto[i];
			bolle = sointuNappi.getPainettu();
			painettu = sointuNappi;
			if (bolle == true){
				i = 66;
			}
		}
		return bolle;
	}
	
	//tyhjennet‰‰n sointutaulukon aiemmat v‰rj‰ykset
	public void tyhjennaSointu(){
		
		for (i = 0; i < 66; i++){
			sointuNappi = sointuNapisto[i];
			sointuNappi.setBGDef();
		}
	}
	
	//v‰rj‰t‰‰n valittu sointu
	public void varjaaSointu(){
		
		if (kysySointu()){
			painettu.setBGDef();
			painettu.setPainettu(false);
			if (suunta == 1) {
				uusPaino = painettu.getPohjoinen();
			} else if (suunta == 2) {
				uusPaino = painettu.getIta();
			} else if (suunta == 3) {
				uusPaino = painettu.getEtela();
			} else if (suunta == 4) {
				uusPaino = painettu.getLansi();
			}
			uusPaino.setBGVari();
			uusPaino.setPainettu(true);
			varjaaja.setSointu(uusPaino);
			varjaaja.tyhjenna();
			varjaaja.varjaa();
			
		}else{
			painettu = sointuNapisto[0];
			painettu.setBGVari();
			painettu.setPainettu(true);
			varjaaja.setSointu(painettu);
			varjaaja.tyhjenna();
			varjaaja.varjaa();
		}
	}
}