import javax.swing.JButton;

public class Kosketin {
    JButton nappi1;
    JButton nappi2;
    boolean painettu;
    boolean vari;
    int sijainti;
   
    public Kosketin(JButton but, JButton but2, boolean bolle, boolean bolle2, int sija){
        nappi1 = but;
        nappi2 = but2;
        painettu = bolle;
        vari = bolle2;
        sijainti = sija;
    }
    
    //setterit
    public void setPainettu(boolean bol){
    	painettu = bol;
    }
    
    //getterit
    public JButton getNappi1(){
    	return nappi1;
    }
    public JButton getNappi2(){
    	return nappi2;
    }
    public boolean getVari(){
    	return vari;
    }
    public boolean getPainettu(){
    	return painettu;
    }
    public int getSijainti(){
    	return sijainti;
    }
   
}