import java.awt.Color;

import javax.swing.JButton;

public class SointuNappi {
	JButton nappi;
	JButton defBut;
	Color varjays = new Color (130, 180, 175);
    boolean painettu;
    int i;
    int lista[];
    int osoitin[] = {0,0,0,0,0};
    SointuNappi pohjoinen;
    SointuNappi ita;
    SointuNappi etela;
    SointuNappi lansi;
   
    public SointuNappi(JButton sointu, boolean pain){
    	nappi = sointu;
    	painettu = pain;
    	defBut = new JButton();
    	
    }
    
    //setterit
    
    public void setPainettu(boolean bol){
    	painettu = bol;
    }
    
    public void setOsoitin(int[] oso){
    	lista = oso;
    	
    	for (i = 0; i < 5; i++){
    		osoitin[i] = lista[i];
    	}
    	
    }
    
    public void setPohjoinen(SointuNappi poh){
    	pohjoinen = poh;
    }
    
    public void setIta(SointuNappi ita2){
    	ita = ita2;
    }
    
    public void setEtela(SointuNappi ete){
    	etela = ete;
    }
    
    public void setLansi(SointuNappi lan){
    	lansi = lan;
    }
    
    public void setBGVari(){
    	nappi.setBackground(varjays);
    }
    
    public void setBGDef(){
    	nappi.setBackground(defBut.getBackground());
    } 
    
    //getterit
    
    public boolean getPainettu(){
    	return painettu;
    }

    public JButton getButton(){
    	return nappi;
    }
    
    public int[] getOsoitin(){
    	return osoitin;
    }
    
    public SointuNappi getPohjoinen(){
    	return pohjoinen;
    }
    
    public SointuNappi getIta(){
    	return ita;
    }
    
    public SointuNappi getEtela(){
    	return etela;
    }
    
    public SointuNappi getLansi(){
    	return lansi;
    }  
}