import java.awt.Color;

import javax.swing.JButton;

public class FinalVarjaaja {
	int i;
	SointuNappi sointuNap;
	int pianoCoord;
	Kosketin kosketin;
	Kosketin koskTaulu;
	Kosketin[] pianosto;
	SointuNappi[] soinnusto;
	JButton nappiVari;
	int osoitin[] = {0, 0, 0, 0, 0};
	
	Color baseValkoVari = new Color (130, 180, 175);
    Color baseMustaVari = new Color (110, 170, 160);
	
	Color valkoVari = new Color (150, 165, 165);
    Color mustaVari = new Color (120, 140, 140);
	
	public FinalVarjaaja(Kosketin[] piano, SointuNappi[] sointu){
		pianosto = piano;
		soinnusto = sointu;
		sointuNap = null;
		kosketin = null;
	}
	
	//setterit
	
	public void setSointu(SointuNappi nap){
		sointuNap = nap;
	}
	

	public void setKosketin(Kosketin kosk){
		kosketin = kosk;
		
		i = 0;
    	while (i < 36) {
    		if (kosketin == pianosto[i]){
    			pianoCoord = i;
    		}
            i++;
    	}
	}

	public void resetKosketin(){
		kosketin = null;
	}
	
	public void tyhjenna(){
		
	//tyhjennetään aiemmat sointuvärjäykset
		for (i = 0; i < 36; i++) {
		    koskTaulu = pianosto[i];
		    if (koskTaulu != kosketin) {
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
		
	}
	
	public void varjaa(){

		if((kosketin != null) && (sointuNap != null)){

	    	//määritetään koskettimien siirtymät sointutaulukosta
			osoitin = sointuNap.getOsoitin();

			//värjätään muut koskettimet valitusta eteenpäin

	    	i = 0;
	    	for (i = 0; i < 5; i++) {
	    	    koskTaulu = pianosto[kosketin.getSijainti() + osoitin[i]];
	    	    if (koskTaulu.getVari() == false){
	    			nappiVari = koskTaulu.getNappi1();
	        		nappiVari.setBackground(mustaVari);
	        		nappiVari = koskTaulu.getNappi2();
	        		nappiVari.setBackground(mustaVari);
	        	} else {
	        		nappiVari = koskTaulu.getNappi1();
	        		nappiVari.setBackground(valkoVari);
	        		nappiVari = koskTaulu.getNappi2();
	        		nappiVari.setBackground(valkoVari);
	        	}
	    	}
	    	koskTaulu = pianosto[kosketin.getSijainti()];
	    	if (koskTaulu.getVari() == false){
    			nappiVari = koskTaulu.getNappi1();
        		nappiVari.setBackground(baseMustaVari);
        		nappiVari = koskTaulu.getNappi2();
        		nappiVari.setBackground(baseMustaVari);
        	} else {
        		nappiVari = koskTaulu.getNappi1();
        		nappiVari.setBackground(baseValkoVari);
        		nappiVari = koskTaulu.getNappi2();
        		nappiVari.setBackground(baseValkoVari);
        	}	
		}
	}
}