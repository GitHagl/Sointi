import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KosketinKuulija implements ActionListener {
	int i;
    Kosketin kosk;
    Kosketin koskTaulu;
    JButton nappi1;
    JButton nappi2;
    JButton nappiVari;
    Kosketin[] koskettimisto;
    JFrame fraami2;
    FinalVarjaaja varjaaja;
    
    Color valkoVari = new Color (130, 180, 175);
    Color mustaVari = new Color (110, 170, 160);
   
    public KosketinKuulija(Kosketin but, Kosketin[] pianosto, JFrame fram, FinalVarjaaja vari){
        kosk = but;
        nappi1 = kosk.getNappi1();
        nappi2 = kosk.getNappi2();
        koskettimisto = pianosto;
        fraami2 = fram;
        varjaaja = vari;
    }
   
    public void actionPerformed(ActionEvent e) {

    	//aiempien varjayksien tyhjennys
    	
    	for (i = 0; i < 36; i++){
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
    	
    	//uuden valinnan varjays
        if ((e.getSource() == nappi1) || (e.getSource() == nappi2)){
           
        	if (kosk.getPainettu() == false){
        		if (kosk.getVari() == false){
            		nappi1.setBackground(mustaVari);
            		nappi2.setBackground(mustaVari);
            	} else {
            		nappi1.setBackground(valkoVari);
                    nappi2.setBackground(valkoVari);
            		}
            	for (i = 0; i < 36; i++){
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
            		nappi1.setBackground(Color.BLACK);
            		nappi2.setBackground(Color.BLACK);
            	} else {
            		nappi1.setBackground(Color.WHITE);
                    nappi2.setBackground(Color.WHITE);
            		}
        		for (i = 0; i < 36; i++){
            		koskTaulu = koskettimisto[i];
            		koskTaulu.setPainettu(false);
            		i++;
            	}            	
            	varjaaja.resetKosketin();
            	varjaaja.tyhjenna();
        	}              
        }     
        fraami2.requestFocus();
    }   
}