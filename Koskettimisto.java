import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

public class Koskettimisto {

	//värimuuttujat
	Color tausta = new Color (88, 117, 148);
	
	//fonttimuuttuja
	Font kosketinFontti = new Font("Arial", Font.BOLD, 12);
	Font helpNappiFontti = new Font("Arial", Font.BOLD, 25);
	Font ohjeetFontti = new Font("Arial", Font.BOLD, 13);
	
    //kokomuuttujat
    Dimension alaKoko = new Dimension(45, 100);
    Dimension ylaisoKoko = new Dimension(30, 150);
    Dimension ylapienKoko = new Dimension(15, 150);
    Dimension mustaKoko = new Dimension(15, 150);
    Dimension sointuKoko = new Dimension(111, 26);
    Dimension helpKoko = new Dimension(50, 50);
  
    
    //paneelien luonti
    JPanel pianoPanel = new JPanel(new GridBagLayout());
    JPanel gridPanel = new JPanel(new GridBagLayout());
    JPanel sointuPanel1 = new JPanel(new GridBagLayout());
    JPanel sointuPanel2 = new JPanel(new GridBagLayout());
    JPanel sointuPanel3 = new JPanel(new GridBagLayout());
    JPanel sointuPanel4 = new JPanel(new GridBagLayout());
    JPanel sointuPanel5 = new JPanel(new GridBagLayout());
    JPanel sointuPanel6 = new JPanel(new GridBagLayout());
    JPanel helpPanel = new JPanel(new BorderLayout());
    JPanel tyhjaPanel = new JPanel();
    
    JPanel superPanel = new JPanel(new BorderLayout());
    JPanel hyperPanel = new JPanel(new BorderLayout(0, 30));
    
	//ohjeistuksen sisällön luonti
	JButton help = new JButton("?");
	
	JLabel ohjeet1 = new JLabel("<html><br>"
								+ "&#8203 &#8203 Choose the root by either"
								+ "<br>&#8203 &#8203 &#8203 &#8203  - clicking the marked keys (C-B) on the virtual piano keyboard with mouse, or"
								+ "<br>&#8203 &#8203 &#8203 &#8203  - using keys A, S, D, F, G, H, J for white keys and W, E, T, Y, U for black keys."
								+ "<br><br>&#8203 &#8203 Cancel the selection by either clicking the same key with mouse or pressing "
								+ "<br>&#8203 &#8203 the respective key on keyboard."
								+ "<br><br><br>"
								+ "&#8203 &#8203 Choose the chord by either"
								+ "<br>&#8203 &#8203 &#8203 &#8203  - clicking the chord button with mouse, or"
								+ "<br>&#8203 &#8203 &#8203 &#8203  - navigating in the chord table with arrow keys."
								+ "<br><br>&#8203 &#8203 Cancel the selection by either clicking the same button with mouse or "
								+ "<br>&#8203 &#8203 pressing ESC."
								+ "<br><br>&#8203 &#8203 Close this window by pressing ALT + F4.</html>");
	
	JPanel ohjeetPaneeli = new JPanel(new BorderLayout());
	JFrame ohjeetFraami = new JFrame("Instructions");
    
    //koskettimien alanappien luonti
    JButton alaNapC = new JButton("C");
    JButton alaNapD = new JButton("D");
    JButton alaNapE = new JButton("E");
    JButton alaNapF = new JButton("F");
    JButton alaNapG = new JButton("G");
    JButton alaNapA = new JButton("A");
    JButton alaNapB = new JButton("B");
    
    JButton alaNapC2 = new JButton();
    JButton alaNapD2 = new JButton();
    JButton alaNapE2 = new JButton();
    JButton alaNapF2 = new JButton();
    JButton alaNapG2 = new JButton();
    JButton alaNapA2 = new JButton();
    JButton alaNapB2 = new JButton();
 
    JButton alaNapC3 = new JButton();
    JButton alaNapD3 = new JButton();
    JButton alaNapE3 = new JButton();
    JButton alaNapF3 = new JButton();
    JButton alaNapG3 = new JButton();
    JButton alaNapA3 = new JButton();
    JButton alaNapB3 = new JButton();

  
    //koskettimien valkoisten ylanappien luonti
  
    JButton ylaNapC = new JButton();
    JButton ylaNapD = new JButton();
    JButton ylaNapE = new JButton();
    JButton ylaNapF = new JButton();
    JButton ylaNapG = new JButton();
    JButton ylaNapA = new JButton();
    JButton ylaNapB = new JButton();
 
    JButton ylaNapC2 = new JButton();
    JButton ylaNapD2 = new JButton();
    JButton ylaNapE2 = new JButton();
    JButton ylaNapF2 = new JButton();
    JButton ylaNapG2 = new JButton();
    JButton ylaNapA2 = new JButton();
    JButton ylaNapB2 = new JButton();
 
    JButton ylaNapC3 = new JButton();
    JButton ylaNapD3 = new JButton();
    JButton ylaNapE3 = new JButton();
    JButton ylaNapF3 = new JButton();
    JButton ylaNapG3 = new JButton();
    JButton ylaNapA3 = new JButton();
    JButton ylaNapB3 = new JButton();
  
    //koskettimien mustien ylänappien luonti

    JButton mustaCr1_1 = new JButton();
    JButton mustaDr1_1 = new JButton();
    JButton mustaFr1_1 = new JButton();
    JButton mustaGr1_1 = new JButton();
    JButton mustaAr1_1 = new JButton();
   
    JButton mustaCr2_1 = new JButton();
    JButton mustaDr2_1 = new JButton();
    JButton mustaFr2_1 = new JButton();
    JButton mustaGr2_1 = new JButton();
    JButton mustaAr2_1 = new JButton();
 
    JButton mustaCr1_2 = new JButton();
    JButton mustaDr1_2 = new JButton();
    JButton mustaFr1_2 = new JButton();
    JButton mustaGr1_2 = new JButton();
    JButton mustaAr1_2 = new JButton();
   
    JButton mustaCr2_2 = new JButton();
    JButton mustaDr2_2 = new JButton();
    JButton mustaFr2_2 = new JButton();
    JButton mustaGr2_2 = new JButton();
    JButton mustaAr2_2 = new JButton();
   
    JButton mustaCr1_3 = new JButton();
    JButton mustaDr1_3 = new JButton();
    JButton mustaFr1_3 = new JButton();
    JButton mustaGr1_3 = new JButton();
    JButton mustaAr1_3 = new JButton();
   
    JButton mustaCr2_3 = new JButton();
    JButton mustaDr2_3 = new JButton();
    JButton mustaFr2_3 = new JButton();
    JButton mustaGr2_3 = new JButton();
    JButton mustaAr2_3 = new JButton();
 
    //yhdistettyjen koskettimien luonti (ylakomponentti, alakomponentti, painettulippu, musta-valkolippu, järjestysluku)
    
    Kosketin koskC1 = new Kosketin(ylaNapC, alaNapC, false, true, 0);
    Kosketin koskD1 = new Kosketin(ylaNapD, alaNapD, false, true, 2);
    Kosketin koskE1 = new Kosketin(ylaNapE, alaNapE, false, true, 4);
    Kosketin koskF1 = new Kosketin(ylaNapF, alaNapF, false, true, 5);
    Kosketin koskG1 = new Kosketin(ylaNapG, alaNapG, false, true, 7);
    Kosketin koskA1 = new Kosketin(ylaNapA, alaNapA, false, true, 9);
    Kosketin koskB1 = new Kosketin(ylaNapB, alaNapB, false, true, 11);

    Kosketin koskC2 = new Kosketin(ylaNapC2, alaNapC2, false, true, 12);
    Kosketin koskD2 = new Kosketin(ylaNapD2, alaNapD2, false, true, 14);
    Kosketin koskE2 = new Kosketin(ylaNapE2, alaNapE2, false, true, 16);
    Kosketin koskF2 = new Kosketin(ylaNapF2, alaNapF2, false, true, 17);
    Kosketin koskG2 = new Kosketin(ylaNapG2, alaNapG2, false, true, 19);
    Kosketin koskA2 = new Kosketin(ylaNapA2, alaNapA2, false, true, 21);
    Kosketin koskB2 = new Kosketin(ylaNapB2, alaNapB2, false, true, 23);
       
    Kosketin koskC3 = new Kosketin(ylaNapC3, alaNapC3, false, true, 24);
    Kosketin koskD3 = new Kosketin(ylaNapD3, alaNapD3, false, true, 26);
    Kosketin koskE3 = new Kosketin(ylaNapE3, alaNapE3, false, true, 28);
    Kosketin koskF3 = new Kosketin(ylaNapF3, alaNapF3, false, true, 29);
    Kosketin koskG3 = new Kosketin(ylaNapG3, alaNapG3, false, true, 31);
    Kosketin koskA3 = new Kosketin(ylaNapA3, alaNapA3, false, true, 33);
    Kosketin koskB3 = new Kosketin(ylaNapB3, alaNapB3, false, true, 35);
   
    Kosketin koskMustaC1 = new Kosketin(mustaCr1_1, mustaCr2_1, false, false, 1);
    Kosketin koskMustaD1 = new Kosketin(mustaDr1_1, mustaDr2_1, false, false, 3);
    Kosketin koskMustaF1 = new Kosketin(mustaFr1_1, mustaFr2_1, false, false, 6);
    Kosketin koskMustaG1 = new Kosketin(mustaGr1_1, mustaGr2_1, false, false, 8);
    Kosketin koskMustaA1 = new Kosketin(mustaAr1_1, mustaAr2_1, false, false, 10);
   
    Kosketin koskMustaC2 = new Kosketin(mustaCr1_2, mustaCr2_2, false, false, 13);
    Kosketin koskMustaD2 = new Kosketin(mustaDr1_2, mustaDr2_2, false, false, 15);
    Kosketin koskMustaF2 = new Kosketin(mustaFr1_2, mustaFr2_2, false, false, 18);
    Kosketin koskMustaG2 = new Kosketin(mustaGr1_2, mustaGr2_2, false, false, 20);
    Kosketin koskMustaA2 = new Kosketin(mustaAr1_2, mustaAr2_2, false, false, 22);
   
    Kosketin koskMustaC3 = new Kosketin(mustaCr1_3, mustaCr2_3, false, false, 25);
    Kosketin koskMustaD3 = new Kosketin(mustaDr1_3, mustaDr2_3, false, false, 27);
    Kosketin koskMustaF3 = new Kosketin(mustaFr1_3, mustaFr2_3, false, false, 30);
    Kosketin koskMustaG3 = new Kosketin(mustaGr1_3, mustaGr2_3, false, false, 32);
    Kosketin koskMustaA3 = new Kosketin(mustaAr1_3, mustaAr2_3, false, false, 34);
   
    // koskettimet taulukkoon
    Kosketin[] pianosto = {
    		koskC1, koskMustaC1, koskD1, koskMustaD1, koskE1, koskF1, koskMustaF1, koskG1, koskMustaG1, koskA1, koskMustaA1, koskB1, 
    		koskC2, koskMustaC2, koskD2, koskMustaD2, koskE2, koskF2, koskMustaF2, koskG2, koskMustaG2, koskA2, koskMustaA2, koskB2,
    		koskC3, koskMustaC3, koskD3, koskMustaD3, koskE3, koskF3, koskMustaF3, koskG3, koskMustaG3, koskA3, koskMustaA3, koskB3
    		}; 
     
    //sointunappien luonti
    
    JButton sointuMajor = new JButton("Major");
    JButton sointusus2 = new JButton("sus2");
    JButton sointusus4 = new JButton("sus4");
    JButton sointuMajb5 = new JButton("Majb5");
    JButton sointuminor = new JButton("minor");
    JButton sointumb5 = new JButton("mb5");
    JButton sointuaug = new JButton("aug");
    JButton sointuaugsus4 = new JButton("augsus4");
    JButton sointutri = new JButton("tri");
    JButton sointu6 = new JButton("6");
    
    JButton sointu6sus4 = new JButton("6sus4");
    JButton sointu6add9 = new JButton("6add9");
    JButton sointum6 = new JButton("m6");
    JButton sointum6add9 = new JButton("m6add9");
    JButton sointu7 = new JButton("7");
    JButton sointu7sus4 = new JButton("7sus4");
    JButton sointu7r5 = new JButton("7#5");
    JButton sointu7b5 = new JButton("7b5");
    JButton sointu7r9 = new JButton("7#9");
    JButton sointu7b9 = new JButton("7b9");
    
    JButton sointu7r5r9 = new JButton("7#5#9");
    JButton sointu7r5b9 = new JButton("7#5b9");
    JButton sointu7b5b9 = new JButton("7b5b9");
    JButton sointu7add11 = new JButton("7add11");
    JButton sointu7add13 = new JButton("7add13");
    JButton sointu7r11 = new JButton("7#11");
    JButton sointuMaj7 = new JButton("Maj7");
    JButton sointuMaj7b5 = new JButton("Maj7b5");
    JButton sointuMaj7r5 = new JButton("Maj7#5");
    JButton sointuMaj7r11 = new JButton("Maj7#11");
    
    JButton sointuMaj7add13 = new JButton("Maj7add13");
    JButton sointum7 = new JButton("m7");
    JButton sointum7b5 = new JButton("m7b5");
    JButton sointum7b9 = new JButton("m7b9");
    JButton sointum7add11 = new JButton("m7add11");
    JButton sointum7add13 = new JButton("m7add13");
    JButton sointumMaj7 = new JButton("m-Maj7");
    JButton sointumMaj7add11 = new JButton("m-Maj7add11");
    JButton sointumMaj7add13 = new JButton("m-Maj7add13");
    JButton sointu9 = new JButton("9");
    
    JButton sointu9sus4 = new JButton("9sus4");
    JButton sointuadd9 = new JButton("add9");
    JButton sointu9r5 = new JButton("9#5");
    JButton sointu9b5 = new JButton("9b5");
    JButton sointu9r11 = new JButton("9#11");
    JButton sointu9b13 = new JButton("9b13");
    JButton sointuMaj9 = new JButton("Maj9");
    JButton sointuMaj9sus4 = new JButton("Maj9sus4");
    JButton sointuMaj9r5 = new JButton("Maj9#5");
    JButton sointuMaj9r11 = new JButton("Maj9#11");
    
    JButton sointum9 = new JButton("m9");
    JButton sointumadd9 = new JButton("madd9");
    JButton sointum9b5 = new JButton("m9b5");
    JButton sointum9Maj7 = new JButton("m9-Maj7");
    JButton sointu11 = new JButton("11");
    JButton sointu11b9 = new JButton("11b9");
    JButton sointuMaj11 = new JButton("Maj11");
    JButton sointum11 = new JButton("m11");
    JButton sointumMaj11 = new JButton("m-Maj11");
    JButton sointu13 = new JButton("13");
    
    JButton sointu13r9 = new JButton("13#9");
    JButton sointu13b9 = new JButton("13b9");
    JButton sointu13b5b9 = new JButton("13b5b9");
    JButton sointuMaj13 = new JButton("Maj13");
    JButton sointum13 = new JButton("m13");
    JButton sointumMaj13 = new JButton("m-Maj13"); 
    
    //sointuolioiden luonti (sointunappi, painettu-lippu)
    
    SointuNappi sointuNapMajor = new SointuNappi(sointuMajor, false);
	SointuNappi sointuNapsus2 = new SointuNappi(sointusus2, false);
	SointuNappi sointuNapsus4 = new SointuNappi(sointusus4, false);
	SointuNappi sointuNapMajb5 = new SointuNappi(sointuMajb5, false);
	SointuNappi sointuNapminor = new SointuNappi(sointuminor, false);
	SointuNappi sointuNapmb5 = new SointuNappi(sointumb5, false);
	SointuNappi sointuNapaug = new SointuNappi(sointuaug, false);
	SointuNappi sointuNapaugsus4 = new SointuNappi(sointuaugsus4, false);
	SointuNappi sointuNaptri = new SointuNappi(sointutri, false);
	SointuNappi sointuNap6 = new SointuNappi(sointu6, false);
	SointuNappi sointuNap6sus4 = new SointuNappi(sointu6sus4, false);
	SointuNappi sointuNap6add9 = new SointuNappi(sointu6add9, false);
	SointuNappi sointuNapm6 = new SointuNappi(sointum6, false);
	SointuNappi sointuNapm6add9 = new SointuNappi(sointum6add9, false);
	SointuNappi sointuNap7 = new SointuNappi(sointu7, false);
	SointuNappi sointuNap7sus4 = new SointuNappi(sointu7sus4, false);
	SointuNappi sointuNap7r5 = new SointuNappi(sointu7r5, false);
	SointuNappi sointuNap7b5 = new SointuNappi(sointu7b5, false);
	SointuNappi sointuNap7r9 = new SointuNappi(sointu7r9, false);
	SointuNappi sointuNap7b9 = new SointuNappi(sointu7b9, false);
	SointuNappi sointuNap7r5r9 = new SointuNappi(sointu7r5r9, false);
	SointuNappi sointuNap7r5b9 = new SointuNappi(sointu7r5b9, false);
	SointuNappi sointuNap7b5b9 = new SointuNappi(sointu7b5b9, false);
	SointuNappi sointuNap7add11 = new SointuNappi(sointu7add11, false);
	SointuNappi sointuNap7add13 = new SointuNappi(sointu7add13, false);
	SointuNappi sointuNap7r11 = new SointuNappi(sointu7r11, false);
	SointuNappi sointuNapMaj7 = new SointuNappi(sointuMaj7, false);
	SointuNappi sointuNapMaj7b5 = new SointuNappi(sointuMaj7b5, false);
	SointuNappi sointuNapMaj7r5 = new SointuNappi(sointuMaj7r5, false);
	SointuNappi sointuNapMaj7r11 = new SointuNappi(sointuMaj7r11, false);
	SointuNappi sointuNapMaj7add13 = new SointuNappi(sointuMaj7add13, false);
	SointuNappi sointuNapm7 = new SointuNappi(sointum7, false);
	SointuNappi sointuNapm7b5 = new SointuNappi(sointum7b5, false);
	SointuNappi sointuNapm7b9 = new SointuNappi(sointum7b9, false);
	SointuNappi sointuNapm7add11 = new SointuNappi(sointum7add11, false);
	SointuNappi sointuNapm7add13 = new SointuNappi(sointum7add13, false);
	SointuNappi sointuNapmMaj7 = new SointuNappi(sointumMaj7, false);
	SointuNappi sointuNapmMaj7add11 = new SointuNappi(sointumMaj7add11, false);
	SointuNappi sointuNapmMaj7add13 = new SointuNappi(sointumMaj7add13, false);
	SointuNappi sointuNap9 = new SointuNappi(sointu9, false);
	SointuNappi sointuNap9sus4 = new SointuNappi(sointu9sus4, false);
	SointuNappi sointuNapadd9 = new SointuNappi(sointuadd9, false);
	SointuNappi sointuNap9r5 = new SointuNappi(sointu9r5, false);
	SointuNappi sointuNap9b5 = new SointuNappi(sointu9b5, false);
	SointuNappi sointuNap9r11 = new SointuNappi(sointu9r11, false);
	SointuNappi sointuNap9b13 = new SointuNappi(sointu9b13, false);
	SointuNappi sointuNapMaj9 = new SointuNappi(sointuMaj9, false);
	SointuNappi sointuNapMaj9sus4 = new SointuNappi(sointuMaj9sus4, false);
	SointuNappi sointuNapMaj9r5 = new SointuNappi(sointuMaj9r5, false);
	SointuNappi sointuNapMaj9r11 = new SointuNappi(sointuMaj9r11, false);
	SointuNappi sointuNapm9 = new SointuNappi(sointum9, false);
	SointuNappi sointuNapmadd9 = new SointuNappi(sointumadd9, false);
	SointuNappi sointuNapm9b5 = new SointuNappi(sointum9b5, false);
	SointuNappi sointuNapm9Maj7 = new SointuNappi(sointum9Maj7, false);
	SointuNappi sointuNap11 = new SointuNappi(sointu11, false);
	SointuNappi sointuNap11b9 = new SointuNappi(sointu11b9, false);
	SointuNappi sointuNapMaj11 = new SointuNappi(sointuMaj11, false);
	SointuNappi sointuNapm11 = new SointuNappi(sointum11, false);
	SointuNappi sointuNapmMaj11 = new SointuNappi(sointumMaj11, false);
	SointuNappi sointuNap13 = new SointuNappi(sointu13, false);
	SointuNappi sointuNap13r9 = new SointuNappi(sointu13r9, false);
	SointuNappi sointuNap13b9 = new SointuNappi(sointu13b9, false);
	SointuNappi sointuNap13b5b9 = new SointuNappi(sointu13b5b9, false);
	SointuNappi sointuNapMaj13 = new SointuNappi(sointuMaj13, false);
	SointuNappi sointuNapm13 = new SointuNappi(sointum13, false);
	SointuNappi sointuNapmMaj13 = new SointuNappi(sointumMaj13, false);
    
    //sointuoliot taulukkoon
    SointuNappi[] sointuNapisto = {sointuNapMajor, sointuNapsus2, sointuNapsus4, sointuNapMajb5, sointuNapminor, sointuNapmb5, sointuNapaug, sointuNapaugsus4, sointuNaptri, 
    							   sointuNap6, sointuNap6sus4, sointuNap6add9, sointuNapm6, sointuNapm6add9, 
    							   sointuNap7, sointuNap7sus4, sointuNap7r5, sointuNap7b5, sointuNap7r9, sointuNap7b9, sointuNap7r5r9, sointuNap7r5b9, sointuNap7b5b9, 
			   					   sointuNap7add11, sointuNap7add13, sointuNap7r11, sointuNapMaj7, sointuNapMaj7b5, sointuNapMaj7r5, sointuNapMaj7r11, sointuNapMaj7add13, sointuNapm7, 
			   					   sointuNapm7b5, sointuNapm7b9, sointuNapm7add11, sointuNapm7add13, sointuNapmMaj7, sointuNapmMaj7add11, sointuNapmMaj7add13, 
			   					   sointuNap9, sointuNap9sus4, sointuNapadd9, sointuNap9r5, sointuNap9b5, sointuNap9r11, sointuNap9b13, sointuNapMaj9, sointuNapMaj9sus4, 
			   					   sointuNapMaj9r5, sointuNapMaj9r11, sointuNapm9, sointuNapmadd9, sointuNapm9b5, sointuNapm9Maj7, 
			   					   sointuNap11, sointuNap11b9, sointuNapMaj11, sointuNapm11, sointuNapmMaj11, 
			   					   sointuNap13, sointuNap13r9, sointuNap13b9, sointuNap13b5b9, sointuNapMaj13, sointuNapm13, sointuNapmMaj13};
    
    //sointuvärjääjän luonti
    FinalVarjaaja varjaaja = new FinalVarjaaja(pianosto, sointuNapisto);
    
    //framen luonti ja otsikko
    JFrame fraami = new JFrame("Fractal Mandala version 1.0");

    public Koskettimisto(){
    	
    	//pääframen muotoilut
    	
    	fraami.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fraami.setSize(1200, 700);
        fraami.setMinimumSize(new Dimension(1200, 700));
        fraami.setVisible(true);
        fraami.setLocationRelativeTo(null);  

        //ohjeet-framen muotoilut
        
        ohjeetFraami.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        ohjeetFraami.setSize(550, 320);
        ohjeetFraami.setMinimumSize(new Dimension(550, 320));
        ohjeetFraami.setVisible(false);
        ohjeetFraami.setLocationRelativeTo(null);
        
        ohjeet1.setFont(ohjeetFontti);
        ohjeet1.setForeground(Color.WHITE);
        
        ohjeetPaneeli.setBackground(tausta);
        ohjeetPaneeli.add(ohjeet1, BorderLayout.NORTH);
        ohjeetFraami.add(ohjeetPaneeli);
        
        //help-nappulan muotoilut
        
        help.setPreferredSize(helpKoko);        
        help.setBackground(tausta);
        help.setFont(helpNappiFontti);
        help.setForeground(Color.WHITE);
        
        //alanappien muotoilu
             
        alaNapC.setText("<html>C<br>&#8203</html>");
    	alaNapD.setText("<html>D<br>&#8203</html>");
    	alaNapE.setText("<html>E<br>&#8203</html>");
    	alaNapF.setText("<html>F<br>&#8203</html>");
    	alaNapG.setText("<html>G<br>&#8203</html>");
    	alaNapA.setText("<html>A<br>&#8203</html>");
    	alaNapB.setText("<html>B<br>&#8203</html>");
        
        	//disabloinnit
        
        alaNapC2.setEnabled(false);
        alaNapD2.setEnabled(false);
        alaNapE2.setEnabled(false);
        alaNapF2.setEnabled(false);
        alaNapG2.setEnabled(false);
        alaNapA2.setEnabled(false);
        alaNapB2.setEnabled(false);
        
        ylaNapC2.setEnabled(false);
        ylaNapD2.setEnabled(false);
        ylaNapE2.setEnabled(false);
        ylaNapF2.setEnabled(false);
        ylaNapG2.setEnabled(false);
        ylaNapA2.setEnabled(false);
        ylaNapB2.setEnabled(false);
        
        alaNapC3.setEnabled(false);
        alaNapD3.setEnabled(false);
        alaNapE3.setEnabled(false);
        alaNapF3.setEnabled(false);
        alaNapG3.setEnabled(false);
        alaNapA3.setEnabled(false);
        alaNapB3.setEnabled(false);
        
        ylaNapC3.setEnabled(false);
        ylaNapD3.setEnabled(false);
        ylaNapE3.setEnabled(false);
        ylaNapF3.setEnabled(false);
        ylaNapG3.setEnabled(false);
        ylaNapA3.setEnabled(false);
        ylaNapB3.setEnabled(false);
        
        mustaCr1_2.setEnabled(false);
        mustaCr2_2.setEnabled(false);
        mustaDr1_2.setEnabled(false);
        mustaDr2_2.setEnabled(false);
        mustaFr1_2.setEnabled(false);
        mustaFr2_2.setEnabled(false);
        mustaGr1_2.setEnabled(false);
        mustaGr2_2.setEnabled(false);
        mustaAr1_2.setEnabled(false);
        mustaAr2_2.setEnabled(false);
        
        mustaCr1_3.setEnabled(false);
        mustaCr2_3.setEnabled(false);
        mustaDr1_3.setEnabled(false);
        mustaDr2_3.setEnabled(false);
        mustaFr1_3.setEnabled(false);
        mustaFr2_3.setEnabled(false);
        mustaGr1_3.setEnabled(false);
        mustaGr2_3.setEnabled(false);
        mustaAr1_3.setEnabled(false);
        mustaAr2_3.setEnabled(false);      
        
        	//koot, varit
        
        alaNapC.setPreferredSize(alaKoko);
        alaNapD.setPreferredSize(alaKoko);
        alaNapE.setPreferredSize(alaKoko);
        alaNapF.setPreferredSize(alaKoko);
        alaNapG.setPreferredSize(alaKoko);
        alaNapA.setPreferredSize(alaKoko);
        alaNapB.setPreferredSize(alaKoko);
       
        alaNapC.setBackground(Color.WHITE);
        alaNapD.setBackground(Color.WHITE);
        alaNapE.setBackground(Color.WHITE);
        alaNapF.setBackground(Color.WHITE);
        alaNapG.setBackground(Color.WHITE);
        alaNapA.setBackground(Color.WHITE);
        alaNapB.setBackground(Color.WHITE);
     
        alaNapC.setBorder(BorderFactory.createMatteBorder(0, 2, 2, 2, Color.BLACK));
        alaNapD.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
        alaNapE.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
        alaNapF.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
        alaNapG.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
        alaNapA.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
        alaNapB.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));       
       
        alaNapC2.setPreferredSize(alaKoko);
        alaNapD2.setPreferredSize(alaKoko);
        alaNapE2.setPreferredSize(alaKoko);
        alaNapF2.setPreferredSize(alaKoko);
        alaNapG2.setPreferredSize(alaKoko);
        alaNapA2.setPreferredSize(alaKoko);
        alaNapB2.setPreferredSize(alaKoko);
       
        alaNapC2.setBackground(Color.WHITE);
        alaNapD2.setBackground(Color.WHITE);
        alaNapE2.setBackground(Color.WHITE);
        alaNapF2.setBackground(Color.WHITE);
        alaNapG2.setBackground(Color.WHITE);
        alaNapA2.setBackground(Color.WHITE);
        alaNapB2.setBackground(Color.WHITE);
       
        alaNapC2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
        alaNapD2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
        alaNapE2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
        alaNapF2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
        alaNapG2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
        alaNapA2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
        alaNapB2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
     
        alaNapC3.setPreferredSize(alaKoko);
        alaNapD3.setPreferredSize(alaKoko);
        alaNapE3.setPreferredSize(alaKoko);
        alaNapF3.setPreferredSize(alaKoko);
        alaNapG3.setPreferredSize(alaKoko);
        alaNapA3.setPreferredSize(alaKoko);
        alaNapB3.setPreferredSize(alaKoko);
       
        alaNapC3.setBackground(Color.WHITE);
        alaNapD3.setBackground(Color.WHITE);
        alaNapE3.setBackground(Color.WHITE);
        alaNapF3.setBackground(Color.WHITE);
        alaNapG3.setBackground(Color.WHITE);
        alaNapA3.setBackground(Color.WHITE);
        alaNapB3.setBackground(Color.WHITE);
       
        alaNapC3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
        alaNapD3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
        alaNapE3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
        alaNapF3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
        alaNapG3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
        alaNapA3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
        alaNapB3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
       
        alaNapC.setVerticalAlignment(SwingConstants.BOTTOM);
        alaNapD.setVerticalAlignment(SwingConstants.BOTTOM);
        alaNapE.setVerticalAlignment(SwingConstants.BOTTOM);
        alaNapF.setVerticalAlignment(SwingConstants.BOTTOM);
        alaNapG.setVerticalAlignment(SwingConstants.BOTTOM);
        alaNapA.setVerticalAlignment(SwingConstants.BOTTOM);
        alaNapB.setVerticalAlignment(SwingConstants.BOTTOM);
     
        //ylanappien muotoilut
      
        ylaNapC.setPreferredSize(ylaisoKoko);
        ylaNapD.setPreferredSize(ylapienKoko);
        ylaNapE.setPreferredSize(ylaisoKoko);
        ylaNapF.setPreferredSize(ylaisoKoko);
        ylaNapG.setPreferredSize(ylapienKoko);
        ylaNapA.setPreferredSize(ylapienKoko);
        ylaNapB.setPreferredSize(ylaisoKoko);
       
        ylaNapC.setBackground(Color.WHITE);
        ylaNapD.setBackground(Color.WHITE);
        ylaNapE.setBackground(Color.WHITE);
        ylaNapF.setBackground(Color.WHITE);
        ylaNapG.setBackground(Color.WHITE);
        ylaNapA.setBackground(Color.WHITE);
        ylaNapB.setBackground(Color.WHITE);
       
        ylaNapC.setBorder(BorderFactory.createMatteBorder(2, 2, 0, 0, Color.BLACK));
        ylaNapD.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, Color.BLACK));
        ylaNapE.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 2, Color.BLACK));
        ylaNapF.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, Color.BLACK));
        ylaNapG.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, Color.BLACK));
        ylaNapA.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, Color.BLACK));
        ylaNapB.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 2, Color.BLACK));
      
        ylaNapC2.setPreferredSize(ylaisoKoko);
        ylaNapD2.setPreferredSize(ylapienKoko);
        ylaNapE2.setPreferredSize(ylaisoKoko);
        ylaNapF2.setPreferredSize(ylaisoKoko);
        ylaNapG2.setPreferredSize(ylapienKoko);
        ylaNapA2.setPreferredSize(ylapienKoko);
        ylaNapB2.setPreferredSize(ylaisoKoko);
       
        ylaNapC2.setBackground(Color.WHITE);
        ylaNapD2.setBackground(Color.WHITE);
        ylaNapE2.setBackground(Color.WHITE);
        ylaNapF2.setBackground(Color.WHITE);
        ylaNapG2.setBackground(Color.WHITE);
        ylaNapA2.setBackground(Color.WHITE);
        ylaNapB2.setBackground(Color.WHITE);
       
        ylaNapC2.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, Color.BLACK));
        ylaNapD2.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, Color.BLACK));
        ylaNapE2.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 2, Color.BLACK));
        ylaNapF2.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, Color.BLACK));
        ylaNapG2.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, Color.BLACK));
        ylaNapA2.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, Color.BLACK));
        ylaNapB2.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 2, Color.BLACK));
     
        ylaNapC3.setPreferredSize(ylaisoKoko);
        ylaNapD3.setPreferredSize(ylapienKoko);
        ylaNapE3.setPreferredSize(ylaisoKoko);
        ylaNapF3.setPreferredSize(ylaisoKoko);
        ylaNapG3.setPreferredSize(ylapienKoko);
        ylaNapA3.setPreferredSize(ylapienKoko);
        ylaNapB3.setPreferredSize(ylaisoKoko);
       
        ylaNapC3.setBackground(Color.WHITE);
        ylaNapD3.setBackground(Color.WHITE);
        ylaNapE3.setBackground(Color.WHITE);
        ylaNapF3.setBackground(Color.WHITE);
        ylaNapG3.setBackground(Color.WHITE);
        ylaNapA3.setBackground(Color.WHITE);
        ylaNapB3.setBackground(Color.WHITE);
       
        ylaNapC3.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, Color.BLACK));
        ylaNapD3.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, Color.BLACK));
        ylaNapE3.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 2, Color.BLACK));
        ylaNapF3.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, Color.BLACK));
        ylaNapG3.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, Color.BLACK));
        ylaNapA3.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, Color.BLACK));
        ylaNapB3.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 2, Color.BLACK));       
      
        //mustien nappien muotoilut
        
        mustaCr1_1.setPreferredSize(mustaKoko);
        mustaDr1_1.setPreferredSize(mustaKoko);
        mustaFr1_1.setPreferredSize(mustaKoko);
        mustaGr1_1.setPreferredSize(mustaKoko);
        mustaAr1_1.setPreferredSize(mustaKoko);
       
        mustaCr1_1.setBackground(Color.BLACK);
        mustaDr1_1.setBackground(Color.BLACK);
        mustaFr1_1.setBackground(Color.BLACK);
        mustaGr1_1.setBackground(Color.BLACK);
        mustaAr1_1.setBackground(Color.BLACK);     
                
        mustaCr1_1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 0, Color.BLACK));
        mustaDr1_1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 0, Color.BLACK));
        mustaFr1_1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 0, Color.BLACK));
        mustaGr1_1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 0, Color.BLACK));
        mustaAr1_1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 0, Color.BLACK));
     
        mustaCr1_2.setPreferredSize(mustaKoko);
        mustaDr1_2.setPreferredSize(mustaKoko);
        mustaFr1_2.setPreferredSize(mustaKoko);
        mustaGr1_2.setPreferredSize(mustaKoko);
        mustaAr1_2.setPreferredSize(mustaKoko);
       
        mustaCr1_2.setBackground(Color.BLACK);
        mustaDr1_2.setBackground(Color.BLACK);
        mustaFr1_2.setBackground(Color.BLACK);
        mustaGr1_2.setBackground(Color.BLACK);
        mustaAr1_2.setBackground(Color.BLACK);
       
        mustaCr1_2.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 0, Color.BLACK));
        mustaDr1_2.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 0, Color.BLACK));
        mustaFr1_2.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 0, Color.BLACK));
        mustaGr1_2.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 0, Color.BLACK));
        mustaAr1_2.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 0, Color.BLACK));
       
        mustaCr2_1.setPreferredSize(mustaKoko);
        mustaDr2_1.setPreferredSize(mustaKoko);
        mustaFr2_1.setPreferredSize(mustaKoko);
        mustaGr2_1.setPreferredSize(mustaKoko);
        mustaAr2_1.setPreferredSize(mustaKoko);
       
        mustaCr2_1.setBackground(Color.BLACK);
        mustaDr2_1.setBackground(Color.BLACK);
        mustaFr2_1.setBackground(Color.BLACK);
        mustaGr2_1.setBackground(Color.BLACK);
        mustaAr2_1.setBackground(Color.BLACK);
       
        mustaCr2_1.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 2, Color.BLACK));
        mustaDr2_1.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 2, Color.BLACK));
        mustaFr2_1.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 2, Color.BLACK));
        mustaGr2_1.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 2, Color.BLACK));
        mustaAr2_1.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 2, Color.BLACK));
       
        mustaCr2_2.setPreferredSize(mustaKoko);
        mustaDr2_2.setPreferredSize(mustaKoko);
        mustaFr2_2.setPreferredSize(mustaKoko);
        mustaGr2_2.setPreferredSize(mustaKoko);
        mustaAr2_2.setPreferredSize(mustaKoko);
       
        mustaCr2_2.setBackground(Color.BLACK);
        mustaDr2_2.setBackground(Color.BLACK);
        mustaFr2_2.setBackground(Color.BLACK);
        mustaGr2_2.setBackground(Color.BLACK);
        mustaAr2_2.setBackground(Color.BLACK);
       
        mustaCr2_2.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 2, Color.BLACK));
        mustaDr2_2.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 2, Color.BLACK));
        mustaFr2_2.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 2, Color.BLACK));
        mustaGr2_2.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 2, Color.BLACK));
        mustaAr2_2.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 2, Color.BLACK));

        mustaCr1_3.setPreferredSize(mustaKoko);
        mustaDr1_3.setPreferredSize(mustaKoko);
        mustaFr1_3.setPreferredSize(mustaKoko);
        mustaGr1_3.setPreferredSize(mustaKoko);
        mustaAr1_3.setPreferredSize(mustaKoko);
       
        mustaCr1_3.setBackground(Color.BLACK);
        mustaDr1_3.setBackground(Color.BLACK);
        mustaFr1_3.setBackground(Color.BLACK);
        mustaGr1_3.setBackground(Color.BLACK);
        mustaAr1_3.setBackground(Color.BLACK);
       
        mustaCr1_3.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 0, Color.BLACK));
        mustaDr1_3.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 0, Color.BLACK));
        mustaFr1_3.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 0, Color.BLACK));
        mustaGr1_3.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 0, Color.BLACK));
        mustaAr1_3.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 0, Color.BLACK));
       
        mustaCr2_3.setPreferredSize(mustaKoko);
        mustaDr2_3.setPreferredSize(mustaKoko);
        mustaFr2_3.setPreferredSize(mustaKoko);
        mustaGr2_3.setPreferredSize(mustaKoko);
        mustaAr2_3.setPreferredSize(mustaKoko);
       
        mustaCr2_3.setBackground(Color.BLACK);
        mustaDr2_3.setBackground(Color.BLACK);
        mustaFr2_3.setBackground(Color.BLACK);
        mustaGr2_3.setBackground(Color.BLACK);
        mustaAr2_3.setBackground(Color.BLACK);
       
        mustaCr2_3.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 2, Color.BLACK));
        mustaDr2_3.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 2, Color.BLACK));
        mustaFr2_3.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 2, Color.BLACK));
        mustaGr2_3.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 2, Color.BLACK));
        mustaAr2_3.setBorder(BorderFactory.createMatteBorder(2, 0, 2, 2, Color.BLACK));
     
        //sointunappien muotoilut
        
        sointuMajor.setPreferredSize(sointuKoko);
        sointu6.setPreferredSize(sointuKoko);
        sointu7.setPreferredSize(sointuKoko);
        sointu7add11.setPreferredSize(sointuKoko);
        sointum7b5.setPreferredSize(sointuKoko);
        sointu9.setPreferredSize(sointuKoko);    
        sointuMaj9r5.setPreferredSize(sointuKoko);
        sointu11.setPreferredSize(sointuKoko);
        sointu13.setPreferredSize(sointuKoko);

        sointuMajor.setFont(kosketinFontti);
        sointusus2.setFont(kosketinFontti);
        sointusus4.setFont(kosketinFontti);
        sointuMajb5.setFont(kosketinFontti);
        sointuminor.setFont(kosketinFontti);
        sointumb5.setFont(kosketinFontti);
        sointuaug.setFont(kosketinFontti);
        sointuaugsus4.setFont(kosketinFontti);
        sointutri.setFont(kosketinFontti);
        
        sointu6.setFont(kosketinFontti);
        sointu6sus4.setFont(kosketinFontti);
        sointu6add9.setFont(kosketinFontti);
        sointum6.setFont(kosketinFontti);
        sointum6add9.setFont(kosketinFontti);
        
        sointu7.setFont(kosketinFontti);
        sointu7sus4.setFont(kosketinFontti);
        sointu7r5.setFont(kosketinFontti);
        sointu7b5.setFont(kosketinFontti);
        sointu7r9.setFont(kosketinFontti);
        sointu7b9.setFont(kosketinFontti);
        sointu7r5r9.setFont(kosketinFontti);
        sointu7r5b9.setFont(kosketinFontti);
        sointu7b5b9.setFont(kosketinFontti);
        
        sointu7add11.setFont(kosketinFontti);
        sointu7add13.setFont(kosketinFontti);
        sointu7r11.setFont(kosketinFontti);
        sointuMaj7.setFont(kosketinFontti);
        sointuMaj7b5.setFont(kosketinFontti);
        sointuMaj7r5.setFont(kosketinFontti);
        sointuMaj7r11.setFont(kosketinFontti);
        sointuMaj7add13.setFont(kosketinFontti);
        sointum7.setFont(kosketinFontti);
        
        sointum7b5.setFont(kosketinFontti);
        sointum7b9.setFont(kosketinFontti);
        sointum7add11.setFont(kosketinFontti);
        sointum7add13.setFont(kosketinFontti);
        sointumMaj7.setFont(kosketinFontti);
        sointumMaj7add11.setFont(kosketinFontti);
        sointumMaj7add13.setFont(kosketinFontti);
        
        sointu9.setFont(kosketinFontti);
        sointu9sus4.setFont(kosketinFontti);
        sointuadd9.setFont(kosketinFontti);
        sointu9r5.setFont(kosketinFontti);
        sointu9b5.setFont(kosketinFontti);
        sointu9r11.setFont(kosketinFontti);
        sointu9b13.setFont(kosketinFontti);
        sointuMaj9.setFont(kosketinFontti);
        sointuMaj9sus4.setFont(kosketinFontti);
        
        sointuMaj9r5.setFont(kosketinFontti);
        sointuMaj9r11.setFont(kosketinFontti);
        sointum9.setFont(kosketinFontti);
        sointumadd9.setFont(kosketinFontti);
        sointum9b5.setFont(kosketinFontti);
        sointum9Maj7.setFont(kosketinFontti);
        
        sointu11.setFont(kosketinFontti);
        sointu11b9.setFont(kosketinFontti);
        sointuMaj11.setFont(kosketinFontti);
        sointum11.setFont(kosketinFontti);
        sointumMaj11.setFont(kosketinFontti);
        
        sointu13.setFont(kosketinFontti);
        sointu13r9.setFont(kosketinFontti);
        sointu13b9.setFont(kosketinFontti);
        sointu13b5b9.setFont(kosketinFontti);
        sointuMaj13.setFont(kosketinFontti);
        sointum13.setFont(kosketinFontti);
        sointumMaj13.setFont(kosketinFontti);

        
        //asetetaan soinnunmuodostukset sointunapeille
        int[] osoit = {4,7,0,0,0};
        
        sointuNapMajor.setOsoitin(osoit);
        osoit[0] = 2;
        osoit[1] = 7;
        osoit[2] = 0;
        osoit[3] = 0;
        osoit[4] = 0;
    	sointuNapsus2.setOsoitin(osoit);
    	osoit[0] = 5;
    	osoit[1] = 7;
    	osoit[2] = 0;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNapsus4.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 6;
    	osoit[2] = 0;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNapMajb5.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 7;
    	osoit[2] = 0;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNapminor.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 6;
    	osoit[2] = 0;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNapmb5.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 8;
    	osoit[2] = 0;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNapaug.setOsoitin(osoit);
    	osoit[0] = 5;
    	osoit[1] = 8;
    	osoit[2] = 0;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNapaugsus4.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 6;
    	osoit[2] = 9;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNaptri.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 9;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNap6.setOsoitin(osoit);
    	osoit[0] = 5;
    	osoit[1] = 7;
    	osoit[2] = 9;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNap6sus4.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 9;
    	osoit[3] = 14;
    	osoit[4] = 0;
    	sointuNap6add9.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 7;
    	osoit[2] = 9;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNapm6.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 7;
    	osoit[2] = 9;
    	osoit[3] = 14;
    	osoit[4] = 0;
    	sointuNapm6add9.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNap7.setOsoitin(osoit);
    	osoit[0] = 5;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNap7sus4.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 8;
    	osoit[2] = 10;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNap7r5.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 6;
    	osoit[2] = 10;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNap7b5.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 15;
    	osoit[4] = 0;
    	sointuNap7r9.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 13;
    	osoit[4] = 0;
    	sointuNap7b9.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 8;
    	osoit[2] = 10;
    	osoit[3] = 15;
    	osoit[4] = 0;
    	sointuNap7r5r9.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 8;
    	osoit[2] = 10;
    	osoit[3] = 13;
    	osoit[4] = 0;
    	sointuNap7r5b9.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 6;
    	osoit[2] = 10;
    	osoit[3] = 13;
    	osoit[4] = 0;
    	sointuNap7b5b9.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 17;
    	osoit[4] = 0;
    	sointuNap7add11.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 21;
    	osoit[4] = 0;
    	sointuNap7add13.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 18;
    	osoit[4] = 0;
    	sointuNap7r11.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 11;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNapMaj7.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 6;
    	osoit[2] = 11;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNapMaj7b5.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 8;
    	osoit[2] = 11;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNapMaj7r5.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 11;
    	osoit[3] = 18;
    	osoit[4] = 0;
    	sointuNapMaj7r11.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 11;
    	osoit[3] = 21;
    	osoit[4] = 0;
    	sointuNapMaj7add13.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNapm7.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 6;
    	osoit[2] = 10;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNapm7b5.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 13;
    	osoit[4] = 0;
    	sointuNapm7b9.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 17;
    	osoit[4] = 0;
    	sointuNapm7add11.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 21;
    	osoit[4] = 0;
    	sointuNapm7add13.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 7;
    	osoit[2] = 11;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNapmMaj7.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 7;
    	osoit[2] = 11;
    	osoit[3] = 17;
    	osoit[4] = 0;
    	sointuNapmMaj7add11.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 7;
    	osoit[2] = 11;
    	osoit[3] = 21;
    	osoit[4] = 0;
    	sointuNapmMaj7add13.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 14;
    	osoit[4] = 0;
    	sointuNap9.setOsoitin(osoit);
    	osoit[0] = 5;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 14;
    	osoit[4] = 0;
    	sointuNap9sus4.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 14;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNapadd9.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 8;
    	osoit[2] = 10;
    	osoit[3] = 14;
    	osoit[4] = 0;
    	sointuNap9r5.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 6;
    	osoit[2] = 10;
    	osoit[3] = 14;
    	osoit[4] = 0;
    	sointuNap9b5.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 14;
    	osoit[4] = 18;
    	sointuNap9r11.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 14;
    	osoit[4] = 20;
    	sointuNap9b13.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 11;
    	osoit[3] = 14;
    	osoit[4] = 0;
    	sointuNapMaj9.setOsoitin(osoit);
    	osoit[0] = 5;
    	osoit[1] = 7;
    	osoit[2] = 11;
    	osoit[3] = 14;
    	osoit[4] = 0;
    	sointuNapMaj9sus4.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 8;
    	osoit[2] = 11;
    	osoit[3] = 14;
    	osoit[4] = 0;
    	sointuNapMaj9r5.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 11;
    	osoit[3] = 14;
    	osoit[4] = 18;
    	sointuNapMaj9r11.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 14;
    	osoit[4] = 0;
    	sointuNapm9.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 7;
    	osoit[2] = 14;
    	osoit[3] = 0;
    	osoit[4] = 0;
    	sointuNapmadd9.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 6;
    	osoit[2] = 10;
    	osoit[3] = 14;
    	osoit[4] = 0;
    	sointuNapm9b5.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 7;
    	osoit[2] = 11;
    	osoit[3] = 14;
    	osoit[4] = 0;
    	sointuNapm9Maj7.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 14;
    	osoit[4] = 17;
    	sointuNap11.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 13;
    	osoit[4] = 17;
    	sointuNap11b9.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 11;
    	osoit[3] = 14;
    	osoit[4] = 17;
    	sointuNapMaj11.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 14;
    	osoit[4] = 17;
    	sointuNapm11.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 7;
    	osoit[2] = 11;
    	osoit[3] = 14;
    	osoit[4] = 17;
    	sointuNapmMaj11.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 14;
    	osoit[4] = 21;
    	sointuNap13.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 15;
    	osoit[4] = 21;
    	sointuNap13r9.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 13;
    	osoit[4] = 21;
    	sointuNap13b9.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 6;
    	osoit[2] = 10;
    	osoit[3] = 13;
    	osoit[4] = 21;
    	sointuNap13b5b9.setOsoitin(osoit);
    	osoit[0] = 4;
    	osoit[1] = 7;
    	osoit[2] = 11;
    	osoit[3] = 14;
    	osoit[4] = 21;
    	sointuNapMaj13.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 7;
    	osoit[2] = 10;
    	osoit[3] = 14;
    	osoit[4] = 21;
    	sointuNapm13.setOsoitin(osoit);
    	osoit[0] = 3;
    	osoit[1] = 7;
    	osoit[2] = 11;
    	osoit[3] = 14;
    	osoit[4] = 21;
    	sointuNapmMaj13.setOsoitin(osoit);
    	
    	//asetetaan sointunappien suhteelliset sijainnit
    	
    	sointuNapMajor.setPohjoinen(sointuNaptri);
    	sointuNapMajor.setIta(sointuNap6);
    	sointuNapMajor.setEtela(sointuNapsus2);
    	sointuNapMajor.setLansi(sointuNap13);
    	
    	sointuNapsus2.setPohjoinen(sointuNapMajor);
    	sointuNapsus2.setIta(sointuNap6sus4);
    	sointuNapsus2.setEtela(sointuNapsus4);
    	sointuNapsus2.setLansi(sointuNap13r9);

    	sointuNapsus4.setPohjoinen(sointuNapsus2);
    	sointuNapsus4.setIta(sointuNap6add9);
    	sointuNapsus4.setEtela(sointuNapMajb5);
    	sointuNapsus4.setLansi(sointuNap13b5b9);

    	sointuNapMajb5.setPohjoinen(sointuNapsus4);
    	sointuNapMajb5.setIta(sointuNapm6);
    	sointuNapMajb5.setEtela(sointuNapminor);
    	sointuNapMajb5.setLansi(sointuNap13b5b9);

    	sointuNapminor.setPohjoinen(sointuNapMajb5);
    	sointuNapminor.setIta(sointuNapm6add9);
    	sointuNapminor.setEtela(sointuNapmb5);
    	sointuNapminor.setLansi(sointuNapMaj13);

    	sointuNapmb5.setPohjoinen(sointuNapminor);
    	sointuNapmb5.setIta(sointuNapm6add9);
    	sointuNapmb5.setEtela(sointuNapaug);
    	sointuNapmb5.setLansi(sointuNapm13);

    	sointuNapaug.setPohjoinen(sointuNapmb5);
    	sointuNapaug.setIta(sointuNapm6add9);
    	sointuNapaug.setEtela(sointuNapaugsus4);
    	sointuNapaug.setLansi(sointuNapmMaj13);

    	sointuNapaugsus4.setPohjoinen(sointuNapaug);
    	sointuNapaugsus4.setIta(sointuNapm6add9);
    	sointuNapaugsus4.setEtela(sointuNaptri);
    	sointuNapaugsus4.setLansi(sointuNapmMaj13);

    	sointuNaptri.setPohjoinen(sointuNapaugsus4);
    	sointuNaptri.setIta(sointuNapm6add9);
    	sointuNaptri.setEtela(sointuNapMajor);
    	sointuNaptri.setLansi(sointuNapmMaj13);

    	
    	
    	sointuNap6.setPohjoinen(sointuNapm6add9);
    	sointuNap6.setIta(sointuNap7);
    	sointuNap6.setEtela(sointuNap6sus4);
    	sointuNap6.setLansi(sointuNapMajor);

    	sointuNap6sus4.setPohjoinen(sointuNap6);
    	sointuNap6sus4.setIta(sointuNap7sus4);
    	sointuNap6sus4.setEtela(sointuNap6add9);
    	sointuNap6sus4.setLansi(sointuNapsus2);

    	sointuNap6add9.setPohjoinen(sointuNap6sus4);
    	sointuNap6add9.setIta(sointuNap7r5);
    	sointuNap6add9.setEtela(sointuNapm6);
    	sointuNap6add9.setLansi(sointuNapsus4);

    	sointuNapm6.setPohjoinen(sointuNap6add9);
    	sointuNapm6.setIta(sointuNap7b5);
    	sointuNapm6.setEtela(sointuNapm6add9);
    	sointuNapm6.setLansi(sointuNapMajb5);

    	sointuNapm6add9.setPohjoinen(sointuNapm6);
    	sointuNapm6add9.setIta(sointuNap7r9);
    	sointuNapm6add9.setEtela(sointuNap6);
    	sointuNapm6add9.setLansi(sointuNapminor);

    	
    	
    	sointuNap7.setPohjoinen(sointuNap7b5b9);
    	sointuNap7.setIta(sointuNap7add11);
    	sointuNap7.setEtela(sointuNap7sus4);
    	sointuNap7.setLansi(sointuNap6);

    	sointuNap7sus4.setPohjoinen(sointuNap7);
    	sointuNap7sus4.setIta(sointuNap7add13);
    	sointuNap7sus4.setEtela(sointuNap7r5);
    	sointuNap7sus4.setLansi(sointuNap6sus4);

    	sointuNap7r5.setPohjoinen(sointuNap7sus4);
    	sointuNap7r5.setIta(sointuNap7r11);
    	sointuNap7r5.setEtela(sointuNap7b5);
    	sointuNap7r5.setLansi(sointuNap6add9);

    	sointuNap7b5.setPohjoinen(sointuNap7r5);
    	sointuNap7b5.setIta(sointuNapMaj7);
    	sointuNap7b5.setEtela(sointuNap7r9);
    	sointuNap7b5.setLansi(sointuNapm6);

    	sointuNap7r9.setPohjoinen(sointuNap7b5);
    	sointuNap7r9.setIta(sointuNapMaj7b5);
    	sointuNap7r9.setEtela(sointuNap7b9);
    	sointuNap7r9.setLansi(sointuNapm6add9);

    	sointuNap7b9.setPohjoinen(sointuNap7r9);
    	sointuNap7b9.setIta(sointuNapMaj7r5);
    	sointuNap7b9.setEtela(sointuNap7r5r9);
    	sointuNap7b9.setLansi(sointuNapm6add9);

    	sointuNap7r5r9.setPohjoinen(sointuNap7b9);
    	sointuNap7r5r9.setIta(sointuNapMaj7r11);
    	sointuNap7r5r9.setEtela(sointuNap7r5b9);
    	sointuNap7r5r9.setLansi(sointuNapm6add9);

    	sointuNap7r5b9.setPohjoinen(sointuNap7r5r9);
    	sointuNap7r5b9.setIta(sointuNapMaj7add13);
    	sointuNap7r5b9.setEtela(sointuNap7b5b9);
    	sointuNap7r5b9.setLansi(sointuNapm6add9);

    	sointuNap7b5b9.setPohjoinen(sointuNap7r5b9);
    	sointuNap7b5b9.setIta(sointuNapm7);
    	sointuNap7b5b9.setEtela(sointuNap7);
    	sointuNap7b5b9.setLansi(sointuNapm6add9);

    	
    	
    	sointuNap7add11.setPohjoinen(sointuNapm7);
    	sointuNap7add11.setIta(sointuNapm7b5);
    	sointuNap7add11.setEtela(sointuNap7add13);
    	sointuNap7add11.setLansi(sointuNap7);

    	sointuNap7add13.setPohjoinen(sointuNap7add11);
    	sointuNap7add13.setIta(sointuNapm7b9);
    	sointuNap7add13.setEtela(sointuNap7r11);
    	sointuNap7add13.setLansi(sointuNap7sus4);

    	sointuNap7r11.setPohjoinen(sointuNap7add13);
    	sointuNap7r11.setIta(sointuNapm7add11);
    	sointuNap7r11.setEtela(sointuNapMaj7);
    	sointuNap7r11.setLansi(sointuNap7r5);

    	sointuNapMaj7.setPohjoinen(sointuNap7r11);
    	sointuNapMaj7.setIta(sointuNapm7add13);
    	sointuNapMaj7.setEtela(sointuNapMaj7b5);
    	sointuNapMaj7.setLansi(sointuNap7b5);

    	sointuNapMaj7b5.setPohjoinen(sointuNapMaj7);
    	sointuNapMaj7b5.setIta(sointuNapmMaj7);
    	sointuNapMaj7b5.setEtela(sointuNapMaj7r5);
    	sointuNapMaj7b5.setLansi(sointuNap7r9);

    	sointuNapMaj7r5.setPohjoinen(sointuNapMaj7b5);
    	sointuNapMaj7r5.setIta(sointuNapmMaj7add11);
    	sointuNapMaj7r5.setEtela(sointuNapMaj7r11);
    	sointuNapMaj7r5.setLansi(sointuNap7b9);

    	sointuNapMaj7r11.setPohjoinen(sointuNapMaj7r5);
    	sointuNapMaj7r11.setIta(sointuNapmMaj7add13);
    	sointuNapMaj7r11.setEtela(sointuNapMaj7add13);
    	sointuNapMaj7r11.setLansi(sointuNap7r5r9);

    	sointuNapMaj7add13.setPohjoinen(sointuNapMaj7r11);
    	sointuNapMaj7add13.setIta(sointuNapmMaj7add13);
    	sointuNapMaj7add13.setEtela(sointuNapm7);
    	sointuNapMaj7add13.setLansi(sointuNap7r5b9);

    	sointuNapm7.setPohjoinen(sointuNapMaj7add13);
    	sointuNapm7.setIta(sointuNapmMaj7add13);
    	sointuNapm7.setEtela(sointuNap7add11);
    	sointuNapm7.setLansi(sointuNap7b5b9);

    	
    	
    	sointuNapm7b5.setPohjoinen(sointuNapmMaj7add13);
    	sointuNapm7b5.setIta(sointuNap9);
    	sointuNapm7b5.setEtela(sointuNapm7b9);
    	sointuNapm7b5.setLansi(sointuNap7add11);

    	sointuNapm7b9.setPohjoinen(sointuNapm7b5);
    	sointuNapm7b9.setIta(sointuNap9sus4);
    	sointuNapm7b9.setEtela(sointuNapm7add11);
    	sointuNapm7b9.setLansi(sointuNap7add13);
    	
    	sointuNapm7add11.setPohjoinen(sointuNapm7b9);
    	sointuNapm7add11.setIta(sointuNapadd9);
    	sointuNapm7add11.setEtela(sointuNapm7add13);
    	sointuNapm7add11.setLansi(sointuNap7r11);

    	sointuNapm7add13.setPohjoinen(sointuNapm7add11);
    	sointuNapm7add13.setIta(sointuNap9r5);
    	sointuNapm7add13.setEtela(sointuNapmMaj7);
    	sointuNapm7add13.setLansi(sointuNapMaj7);
   
    	sointuNapmMaj7.setPohjoinen(sointuNapm7add13);
    	sointuNapmMaj7.setIta(sointuNap9b5);
    	sointuNapmMaj7.setEtela(sointuNapmMaj7add11);
    	sointuNapmMaj7.setLansi(sointuNapMaj7b5);

    	sointuNapmMaj7add11.setPohjoinen(sointuNapmMaj7);
    	sointuNapmMaj7add11.setIta(sointuNap9r11);
    	sointuNapmMaj7add11.setEtela(sointuNapmMaj7add13);
    	sointuNapmMaj7add11.setLansi(sointuNapMaj7r5);

    	sointuNapmMaj7add13.setPohjoinen(sointuNapmMaj7add11);
    	sointuNapmMaj7add13.setIta(sointuNap9b13);
    	sointuNapmMaj7add13.setEtela(sointuNapm7b5);
    	sointuNapmMaj7add13.setLansi(sointuNapMaj7r11);
    	
    	
    	
    	sointuNap9.setPohjoinen(sointuNapMaj9sus4);
    	sointuNap9.setIta(sointuNapMaj9r5);
    	sointuNap9.setEtela(sointuNap9sus4);
    	sointuNap9.setLansi(sointuNapm7b5);
  
    	sointuNap9sus4.setPohjoinen(sointuNap9);
    	sointuNap9sus4.setIta(sointuNapMaj9r11);
    	sointuNap9sus4.setEtela(sointuNapadd9);
    	sointuNap9sus4.setLansi(sointuNapm7b9);

    	sointuNapadd9.setPohjoinen(sointuNap9sus4);
    	sointuNapadd9.setIta(sointuNapm9);
    	sointuNapadd9.setEtela(sointuNap9r5);
    	sointuNapadd9.setLansi(sointuNapm7add11);
 
    	sointuNap9r5.setPohjoinen(sointuNapadd9);
    	sointuNap9r5.setIta(sointuNapmadd9);
    	sointuNap9r5.setEtela(sointuNap9b5);
    	sointuNap9r5.setLansi(sointuNapm7add13);
   
    	sointuNap9b5.setPohjoinen(sointuNap9r5);
    	sointuNap9b5.setIta(sointuNapm9b5);
    	sointuNap9b5.setEtela(sointuNap9r11);
    	sointuNap9b5.setLansi(sointuNapmMaj7);
   
    	sointuNap9r11.setPohjoinen(sointuNap9b5);
    	sointuNap9r11.setIta(sointuNapm9Maj7);
    	sointuNap9r11.setEtela(sointuNap9b13);
    	sointuNap9r11.setLansi(sointuNapmMaj7add11);

    	sointuNap9b13.setPohjoinen(sointuNap9r11);
    	sointuNap9b13.setIta(sointuNapm9Maj7);
    	sointuNap9b13.setEtela(sointuNapMaj9);
    	sointuNap9b13.setLansi(sointuNapmMaj7add13);

    	sointuNapMaj9.setPohjoinen(sointuNap9b13);
    	sointuNapMaj9.setIta(sointuNapm9Maj7);
    	sointuNapMaj9.setEtela(sointuNapMaj9sus4);
    	sointuNapMaj9.setLansi(sointuNapmMaj7add13);

    	sointuNapMaj9sus4.setPohjoinen(sointuNapMaj9);
    	sointuNapMaj9sus4.setIta(sointuNapm9Maj7);
    	sointuNapMaj9sus4.setEtela(sointuNap9);
    	sointuNapMaj9sus4.setLansi(sointuNapmMaj7add13);

    	
    	
    	sointuNapMaj9r5.setPohjoinen(sointuNapm9Maj7);
    	sointuNapMaj9r5.setIta(sointuNap11);
    	sointuNapMaj9r5.setEtela(sointuNapMaj9r11);
    	sointuNapMaj9r5.setLansi(sointuNap9);

    	sointuNapMaj9r11.setPohjoinen(sointuNapMaj9r5);
    	sointuNapMaj9r11.setIta(sointuNap11b9);
    	sointuNapMaj9r11.setEtela(sointuNapm9);
    	sointuNapMaj9r11.setLansi(sointuNap9);

    	sointuNapm9.setPohjoinen(sointuNapMaj9r11);
    	sointuNapm9.setIta(sointuNapMaj11);
    	sointuNapm9.setEtela(sointuNapmadd9);
    	sointuNapm9.setLansi(sointuNapadd9);
 
    	sointuNapmadd9.setPohjoinen(sointuNapm9);
    	sointuNapmadd9.setIta(sointuNapm11);
    	sointuNapmadd9.setEtela(sointuNapm9b5);
    	sointuNapmadd9.setLansi(sointuNap9r5);

    	sointuNapm9b5.setPohjoinen(sointuNapmadd9);
    	sointuNapm9b5.setIta(sointuNapmMaj11);
    	sointuNapm9b5.setEtela(sointuNapm9Maj7);
    	sointuNapm9b5.setLansi(sointuNap9b5);

    	sointuNapm9Maj7.setPohjoinen(sointuNapm9b5);
    	sointuNapm9Maj7.setIta(sointuNapmMaj11);
    	sointuNapm9Maj7.setEtela(sointuNapMaj9r5);
    	sointuNapm9Maj7.setLansi(sointuNap9r11);

    	
    	
    	sointuNap11.setPohjoinen(sointuNapmMaj11);
    	sointuNap11.setIta(sointuNap13);
    	sointuNap11.setEtela(sointuNap11b9);
    	sointuNap11.setLansi(sointuNapMaj9r5);

    	sointuNap11b9.setPohjoinen(sointuNap11);
    	sointuNap11b9.setIta(sointuNap13r9);
    	sointuNap11b9.setEtela(sointuNapMaj11);
    	sointuNap11b9.setLansi(sointuNapMaj9r11);

    	sointuNapMaj11.setPohjoinen(sointuNap11b9);
    	sointuNapMaj11.setIta(sointuNap13b9);
    	sointuNapMaj11.setEtela(sointuNapm11);
    	sointuNapMaj11.setLansi(sointuNapm9);

    	sointuNapm11.setPohjoinen(sointuNapMaj11);
    	sointuNapm11.setIta(sointuNap13b5b9);
    	sointuNapm11.setEtela(sointuNapmMaj11);
    	sointuNapm11.setLansi(sointuNapmadd9);

    	sointuNapmMaj11.setPohjoinen(sointuNapm11);
    	sointuNapmMaj11.setIta(sointuNapMaj13);
    	sointuNapmMaj11.setEtela(sointuNap11);
    	sointuNapmMaj11.setLansi(sointuNapm9b5);
    	
    	
    	
    	sointuNap13.setPohjoinen(sointuNapmMaj13);
    	sointuNap13.setIta(sointuNapMajor);
    	sointuNap13.setEtela(sointuNap13r9);
    	sointuNap13.setLansi(sointuNap11);

    	sointuNap13r9.setPohjoinen(sointuNap13);
    	sointuNap13r9.setIta(sointuNapsus2);
    	sointuNap13r9.setEtela(sointuNap13b9);
    	sointuNap13r9.setLansi(sointuNap11b9);
    	
    	sointuNap13b9.setPohjoinen(sointuNap13r9);
    	sointuNap13b9.setIta(sointuNapsus4);
    	sointuNap13b9.setEtela(sointuNap13b5b9);
    	sointuNap13b9.setLansi(sointuNapMaj11);
    	
    	sointuNap13b5b9.setPohjoinen(sointuNap13b9);
    	sointuNap13b5b9.setIta(sointuNapMajb5);
    	sointuNap13b5b9.setEtela(sointuNapMaj13);
    	sointuNap13b5b9.setLansi(sointuNapm11);
    	
    	sointuNapMaj13.setPohjoinen(sointuNap13b5b9);
    	sointuNapMaj13.setIta(sointuNapminor);
    	sointuNapMaj13.setEtela(sointuNapm13);
    	sointuNapMaj13.setLansi(sointuNapmMaj11);
    	
    	sointuNapm13.setPohjoinen(sointuNapMaj13);
    	sointuNapm13.setIta(sointuNapmb5);
    	sointuNapm13.setEtela(sointuNapmMaj13);
    	sointuNapm13.setLansi(sointuNapmMaj11);
    	
    	sointuNapmMaj13.setPohjoinen(sointuNapm13);
    	sointuNapmMaj13.setIta(sointuNapaug);
    	sointuNapmMaj13.setEtela(sointuNap13);
    	sointuNapmMaj13.setLansi(sointuNapmMaj11);

        
        //kuulijoiden asetukset      
        
    	HelpKuulija korvaHelp = new HelpKuulija(help, ohjeetFraami, fraami);
    	help.addActionListener(korvaHelp);
    	
        KosketinKuulija korvaC = new KosketinKuulija(koskC1, pianosto, fraami, varjaaja);
        KosketinKuulija korvaD = new KosketinKuulija(koskD1, pianosto, fraami, varjaaja);
        KosketinKuulija korvaE = new KosketinKuulija(koskE1, pianosto, fraami, varjaaja);
        KosketinKuulija korvaF = new KosketinKuulija(koskF1, pianosto, fraami, varjaaja);
        KosketinKuulija korvaG = new KosketinKuulija(koskG1, pianosto, fraami, varjaaja);
        KosketinKuulija korvaA = new KosketinKuulija(koskA1, pianosto, fraami, varjaaja);
        KosketinKuulija korvaB = new KosketinKuulija(koskB1, pianosto, fraami, varjaaja);
     	
        KosketinKuulija korvaCr = new KosketinKuulija(koskMustaC1, pianosto, fraami, varjaaja);
        KosketinKuulija korvaDr = new KosketinKuulija(koskMustaD1, pianosto, fraami, varjaaja);
        KosketinKuulija korvaFr = new KosketinKuulija(koskMustaF1, pianosto, fraami, varjaaja);
        KosketinKuulija korvaGr = new KosketinKuulija(koskMustaG1, pianosto, fraami, varjaaja);
        KosketinKuulija korvaAr = new KosketinKuulija(koskMustaA1, pianosto, fraami, varjaaja);
     	
        alaNapC.addActionListener(korvaC);
        ylaNapC.addActionListener(korvaC);
        alaNapD.addActionListener(korvaD);
        ylaNapD.addActionListener(korvaD);
        alaNapE.addActionListener(korvaE);
        ylaNapE.addActionListener(korvaE);
        alaNapF.addActionListener(korvaF);
        ylaNapF.addActionListener(korvaF);
        alaNapG.addActionListener(korvaG);
        ylaNapG.addActionListener(korvaG);
        alaNapA.addActionListener(korvaA);
        ylaNapA.addActionListener(korvaA);
        alaNapB.addActionListener(korvaB);
        ylaNapB.addActionListener(korvaB);
        
        mustaCr1_1.addActionListener(korvaCr);
        mustaCr2_1.addActionListener(korvaCr);
        mustaDr1_1.addActionListener(korvaDr);
        mustaDr2_1.addActionListener(korvaDr);
        mustaFr1_1.addActionListener(korvaFr);
        mustaFr2_1.addActionListener(korvaFr);
        mustaGr1_1.addActionListener(korvaGr);
        mustaGr2_1.addActionListener(korvaGr);
        mustaAr1_1.addActionListener(korvaAr);
        mustaAr2_1.addActionListener(korvaAr);
        
        KeyKuulija nappis = new KeyKuulija(pianosto, sointuNapisto, varjaaja, ohjeetFraami);
        fraami.addKeyListener(nappis);
        
        SointuKuulija korva0 = new SointuKuulija(sointuMajor, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva1 = new SointuKuulija(sointusus2, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva2 = new SointuKuulija(sointusus4, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva3 = new SointuKuulija(sointuMajb5, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva4 = new SointuKuulija(sointuminor, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva5 = new SointuKuulija(sointumb5, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva6 = new SointuKuulija(sointuaug, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva7 = new SointuKuulija(sointuaugsus4, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva8 = new SointuKuulija(sointutri, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva9 = new SointuKuulija(sointu6, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva10 = new SointuKuulija(sointu6sus4, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva11 = new SointuKuulija(sointu6add9, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva12 = new SointuKuulija(sointum6, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva13 = new SointuKuulija(sointum6add9, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva14 = new SointuKuulija(sointu7, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva15 = new SointuKuulija(sointu7sus4, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva16 = new SointuKuulija(sointu7r5, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva17 = new SointuKuulija(sointu7b5, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva18 = new SointuKuulija(sointu7r9, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva19 = new SointuKuulija(sointu7b9, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva20 = new SointuKuulija(sointu7r5r9, sointuNapisto, fraami, varjaaja);
        SointuKuulija korva21 = new SointuKuulija(sointu7r5b9, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva22 = new SointuKuulija(sointu7b5b9, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva23 = new SointuKuulija(sointu7add11, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva24 = new SointuKuulija(sointu7add13, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva25 = new SointuKuulija(sointu7r11, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva26 = new SointuKuulija(sointuMaj7, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva27 = new SointuKuulija(sointuMaj7b5, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva28 = new SointuKuulija(sointuMaj7r5, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva29 = new SointuKuulija(sointuMaj7r11, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva30 = new SointuKuulija(sointuMaj7add13, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva31 = new SointuKuulija(sointum7, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva32 = new SointuKuulija(sointum7b5, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva33 = new SointuKuulija(sointum7b9, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva34 = new SointuKuulija(sointum7add11, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva35 = new SointuKuulija(sointum7add13, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva36 = new SointuKuulija(sointumMaj7, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva37 = new SointuKuulija(sointumMaj7add11, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva38 = new SointuKuulija(sointumMaj7add13, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva39 = new SointuKuulija(sointu9, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva40 = new SointuKuulija(sointu9sus4, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva41 = new SointuKuulija(sointuadd9, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva42 = new SointuKuulija(sointu9r5, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva43 = new SointuKuulija(sointu9b5, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva44 = new SointuKuulija(sointu9r11, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva45 = new SointuKuulija(sointu9b13, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva46 = new SointuKuulija(sointuMaj9, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva47 = new SointuKuulija(sointuMaj9sus4, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva48 = new SointuKuulija(sointuMaj9r5, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva49 = new SointuKuulija(sointuMaj9r11, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva50 = new SointuKuulija(sointum9, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva51 = new SointuKuulija(sointumadd9, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva52 = new SointuKuulija(sointum9b5, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva53 = new SointuKuulija(sointum9Maj7, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva54 = new SointuKuulija(sointu11, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva55 = new SointuKuulija(sointu11b9, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva56 = new SointuKuulija(sointuMaj11, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva57 = new SointuKuulija(sointum11, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva58 = new SointuKuulija(sointumMaj11, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva59 = new SointuKuulija(sointu13, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva60 = new SointuKuulija(sointu13r9, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva61 = new SointuKuulija(sointu13b9, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva62 = new SointuKuulija(sointu13b5b9, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva63 = new SointuKuulija(sointuMaj13, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva64 = new SointuKuulija(sointum13, sointuNapisto, fraami, varjaaja);
    	SointuKuulija korva65 = new SointuKuulija(sointumMaj13, sointuNapisto, fraami, varjaaja);
        
    	sointuMajor.addActionListener(korva0);
    	sointusus2.addActionListener(korva1);
    	sointusus4.addActionListener(korva2);
    	sointuMajb5.addActionListener(korva3);
    	sointuminor.addActionListener(korva4);
    	sointumb5.addActionListener(korva5);
    	sointuaug.addActionListener(korva6);
    	sointuaugsus4.addActionListener(korva7);
    	sointutri.addActionListener(korva8);
    	sointu6.addActionListener(korva9);
    	sointu6sus4.addActionListener(korva10);
    	sointu6add9.addActionListener(korva11);
    	sointum6.addActionListener(korva12);
    	sointum6add9.addActionListener(korva13);
    	sointu7.addActionListener(korva14);
    	sointu7sus4.addActionListener(korva15);
    	sointu7r5.addActionListener(korva16);
    	sointu7b5.addActionListener(korva17);
    	sointu7r9.addActionListener(korva18);
    	sointu7b9.addActionListener(korva19);
    	sointu7r5r9.addActionListener(korva20);
    	sointu7r5b9.addActionListener(korva21);
    	sointu7b5b9.addActionListener(korva22);
    	sointu7add11.addActionListener(korva23);
    	sointu7add13.addActionListener(korva24);
    	sointu7r11.addActionListener(korva25);
    	sointuMaj7.addActionListener(korva26);
    	sointuMaj7b5.addActionListener(korva27);
    	sointuMaj7r5.addActionListener(korva28);
    	sointuMaj7r11.addActionListener(korva29);
    	sointuMaj7add13.addActionListener(korva30);
    	sointum7.addActionListener(korva31);
    	sointum7b5.addActionListener(korva32);
    	sointum7b9.addActionListener(korva33);
    	sointum7add11.addActionListener(korva34);
    	sointum7add13.addActionListener(korva35);
    	sointumMaj7.addActionListener(korva36);
    	sointumMaj7add11.addActionListener(korva37);
    	sointumMaj7add13.addActionListener(korva38);
    	sointu9.addActionListener(korva39);
    	sointu9sus4.addActionListener(korva40);
    	sointuadd9.addActionListener(korva41);
    	sointu9r5.addActionListener(korva42);
    	sointu9b5.addActionListener(korva43);
    	sointu9r11.addActionListener(korva44);
    	sointu9b13.addActionListener(korva45);
    	sointuMaj9.addActionListener(korva46);
    	sointuMaj9sus4.addActionListener(korva47);
    	sointuMaj9r5.addActionListener(korva48);
    	sointuMaj9r11.addActionListener(korva49);
    	sointum9.addActionListener(korva50);
    	sointumadd9.addActionListener(korva51);
    	sointum9b5.addActionListener(korva52);
    	sointum9Maj7.addActionListener(korva53);
    	sointu11.addActionListener(korva54);
    	sointu11b9.addActionListener(korva55);
    	sointuMaj11.addActionListener(korva56);
    	sointum11.addActionListener(korva57);
    	sointumMaj11.addActionListener(korva58);
    	sointu13.addActionListener(korva59);
    	sointu13r9.addActionListener(korva60);
    	sointu13b9.addActionListener(korva61);
    	sointu13b5b9.addActionListener(korva62);
    	sointuMaj13.addActionListener(korva63);
    	sointum13.addActionListener(korva64);
    	sointumMaj13.addActionListener(korva65);
    	
        
        //paneeleihin kiinnitys
        
        //koskettimet pianoPaneliin

        GridBagConstraints c = new GridBagConstraints();
            c.gridx = 0;
            c.gridy = 0;
            c.fill = GridBagConstraints.HORIZONTAL;
            
       
        pianoPanel.add(ylaNapC, c);
        c.gridx++;
        pianoPanel.add(mustaCr1_1, c);
        c.gridx++;
        pianoPanel.add(mustaCr2_1, c);
        c.gridx++;
        pianoPanel.add(ylaNapD, c);
        c.gridx++;
        pianoPanel.add(mustaDr1_1, c);
        c.gridx++;
        pianoPanel.add(mustaDr2_1, c);
        c.gridx++;
        pianoPanel.add(ylaNapE, c);
        c.gridx++;
        pianoPanel.add(ylaNapF, c);
        c.gridx++;
        pianoPanel.add(mustaFr1_1, c);
        c.gridx++;
        pianoPanel.add(mustaFr2_1, c);
        c.gridx++;
        pianoPanel.add(ylaNapG, c);
        c.gridx++;
        pianoPanel.add(mustaGr1_1, c);
        c.gridx++;
        pianoPanel.add(mustaGr2_1, c);
        c.gridx++;
        pianoPanel.add(ylaNapA, c);
        c.gridx++;
        pianoPanel.add(mustaAr1_1, c);
        c.gridx++;
        pianoPanel.add(mustaAr2_1, c);
        c.gridx++;
        pianoPanel.add(ylaNapB, c);
        c.gridx++;
      
        pianoPanel.add(ylaNapC2, c);
        c.gridx++;
        pianoPanel.add(mustaCr1_2, c);
        c.gridx++;
        pianoPanel.add(mustaCr2_2, c);
        c.gridx++;
        pianoPanel.add(ylaNapD2, c);
        c.gridx++;
        pianoPanel.add(mustaDr1_2, c);
        c.gridx++;
        pianoPanel.add(mustaDr2_2, c);
        c.gridx++;
        pianoPanel.add(ylaNapE2, c);
        c.gridx++;
        pianoPanel.add(ylaNapF2, c);
        c.gridx++;
        pianoPanel.add(mustaFr1_2, c);
        c.gridx++;
        pianoPanel.add(mustaFr2_2, c);
        c.gridx++;
        pianoPanel.add(ylaNapG2, c);
        c.gridx++;
        pianoPanel.add(mustaGr1_2, c);
        c.gridx++;
        pianoPanel.add(mustaGr2_2, c);
        c.gridx++;
        pianoPanel.add(ylaNapA2, c);
        c.gridx++;
        pianoPanel.add(mustaAr1_2, c);
        c.gridx++;
        pianoPanel.add(mustaAr2_2, c);
        c.gridx++;
        pianoPanel.add(ylaNapB2, c);
        c.gridx++;
      
        pianoPanel.add(ylaNapC3, c);
        c.gridx++;
        pianoPanel.add(mustaCr1_3, c);
        c.gridx++;
        pianoPanel.add(mustaCr2_3, c);
        c.gridx++;
        pianoPanel.add(ylaNapD3, c);
        c.gridx++;
        pianoPanel.add(mustaDr1_3, c);
        c.gridx++;
        pianoPanel.add(mustaDr2_3, c);
        c.gridx++;
        pianoPanel.add(ylaNapE3, c);
        c.gridx++;
        pianoPanel.add(ylaNapF3, c);
        c.gridx++;
        pianoPanel.add(mustaFr1_3, c);
        c.gridx++;
        pianoPanel.add(mustaFr2_3, c);
        c.gridx++;
        pianoPanel.add(ylaNapG3, c);
        c.gridx++;
        pianoPanel.add(mustaGr1_3, c);
        c.gridx++;
        pianoPanel.add(mustaGr2_3, c);
        c.gridx++;
        pianoPanel.add(ylaNapA3, c);
        c.gridx++;
        pianoPanel.add(mustaAr1_3, c);
        c.gridx++;
        pianoPanel.add(mustaAr2_3, c);
        c.gridx++;
        pianoPanel.add(ylaNapB3, c);
        c.gridx++;
      
        c.gridx = 0;
        c.gridy = 1;
      
        c.gridwidth = 2;
        pianoPanel.add(alaNapC, c);
        c.gridx = 2;
        c.gridwidth = 3;
        pianoPanel.add(alaNapD, c);
        c.gridx = 5;
        c.gridwidth = 2;
        pianoPanel.add(alaNapE, c);
        c.gridx = 7;
        c.gridwidth = 2;
        pianoPanel.add(alaNapF, c);
        c.gridx = 9;
        c.gridwidth = 3;
        pianoPanel.add(alaNapG, c);
        c.gridx = 12;
        c.gridwidth = 3;
        pianoPanel.add(alaNapA, c);
        c.gridx = 15;
        c.gridwidth = 2;
        pianoPanel.add(alaNapB, c);
        c.gridx = 17;
      
        c.gridwidth = 2;
        pianoPanel.add(alaNapC2, c);
        c.gridx = 19;
        c.gridwidth = 3;
        pianoPanel.add(alaNapD2, c);
        c.gridx = 22;
        c.gridwidth = 2;
        pianoPanel.add(alaNapE2, c);
        c.gridx = 24;
        c.gridwidth = 2;
        pianoPanel.add(alaNapF2, c);
        c.gridx = 26;
        c.gridwidth = 3;
        pianoPanel.add(alaNapG2, c);
        c.gridx = 29;
        c.gridwidth = 3;
        pianoPanel.add(alaNapA2, c);
        c.gridx = 32;
        c.gridwidth = 2;
        pianoPanel.add(alaNapB2, c);
        c.gridx = 34;
      
        c.gridwidth = 2;
        pianoPanel.add(alaNapC3, c);
        c.gridx = 36;
        c.gridwidth = 3;
        pianoPanel.add(alaNapD3, c);
        c.gridx = 39;
        c.gridwidth = 2;
        pianoPanel.add(alaNapE3, c);
        c.gridx = 41;
        c.gridwidth = 2;
        pianoPanel.add(alaNapF3, c);
        c.gridx = 43;
        c.gridwidth = 3;
        pianoPanel.add(alaNapG3, c);
        c.gridx = 46;
        c.gridwidth = 3;
        pianoPanel.add(alaNapA3, c);
        c.gridx = 49;
        c.gridwidth = 2;
        pianoPanel.add(alaNapB3, c);
      
        //sointunappaimet omiin sarakepaneeleihin
        
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.1;
        //c.gridheight = 9;
        
        //Major		-	Tri, 
        //6			-	m6add9, 
        //7			-	m-Maj7add13, 
        //9			-	m9-Maj7, 
        //11		-	m-Maj11, 
        //13		-	m-Maj13
        
        sointuPanel1.add(sointuMajor, c);
        c.gridy++;
        sointuPanel1.add(sointusus2, c);
        c.gridy++;
        sointuPanel1.add(sointusus4, c);
        c.gridy++;
        sointuPanel1.add(sointuMajb5, c);
        c.gridy++;
        sointuPanel1.add(sointuminor, c);
        c.gridy++;
        sointuPanel1.add(sointumb5, c);
        c.gridy++;
        sointuPanel1.add(sointuaug, c);
        c.gridy++;
        sointuPanel1.add(sointuaugsus4, c);
        c.gridy++;
        sointuPanel1.add(sointutri, c);
        
        c.gridy = 0;
        sointuPanel2.add(sointu6, c);
        c.gridy++;
        sointuPanel2.add(sointu6sus4, c);
        c.gridy++;
        sointuPanel2.add(sointu6add9, c);
        c.gridy++;
        sointuPanel2.add(sointum6, c);
        c.gridy++;
        sointuPanel2.add(sointum6add9, c);
        
        c.gridy = 0;
        sointuPanel3.add(sointu7, c);
        c.gridy++;
        sointuPanel3.add(sointu7sus4, c);
        c.gridy++;
        sointuPanel3.add(sointu7r5, c);
        c.gridy++;
        sointuPanel3.add(sointu7b5, c);
        c.gridy++;
        sointuPanel3.add(sointu7r9, c);
        c.gridy++;
        sointuPanel3.add(sointu7b9, c);
        c.gridy++;
        sointuPanel3.add(sointu7r5r9, c);
        c.gridy++;
        sointuPanel3.add(sointu7r5b9, c);
        c.gridy++;
        sointuPanel3.add(sointu7b5b9, c);

        c.gridx++;
        c.gridx++;
        c.gridy = 0;
        sointuPanel3.add(sointu7add11, c);
        c.gridy++;
        sointuPanel3.add(sointu7add13, c);
        c.gridy++;
        sointuPanel3.add(sointu7r11, c);
        c.gridy++;
        sointuPanel3.add(sointuMaj7, c);
        c.gridy ++;
        sointuPanel3.add(sointuMaj7b5, c);
        c.gridy++;
        sointuPanel3.add(sointuMaj7r5, c);
        c.gridy++;
        sointuPanel3.add(sointuMaj7r11, c);
        c.gridy++;
        sointuPanel3.add(sointuMaj7add13, c);
        c.gridy++;
        sointuPanel3.add(sointum7, c);

        c.gridx++;
        c.gridx++;
        c.gridy = 0;
        sointuPanel3.add(sointum7b5, c);
        c.gridy++;
        sointuPanel3.add(sointum7b9, c);
        c.gridy++;
        sointuPanel3.add(sointum7add11, c);
        c.gridy++;
        sointuPanel3.add(sointum7add13, c);
        c.gridy++;
        sointuPanel3.add(sointumMaj7, c);
        c.gridy++;
        sointuPanel3.add(sointumMaj7add11, c);
        c.gridy++;
        sointuPanel3.add(sointumMaj7add13, c);
        c.gridy++;
        
        c.gridy = 0;
        c.gridx = 0;
        sointuPanel4.add(sointu9, c);
        c.gridy++;
        sointuPanel4.add(sointu9sus4, c);
        c.gridy++;
        sointuPanel4.add(sointuadd9, c);
        c.gridy++;
        sointuPanel4.add(sointu9r5, c);
        c.gridy++;
        sointuPanel4.add(sointu9b5, c);
        c.gridy++;
        sointuPanel4.add(sointu9r11, c);
        c.gridy++;
        sointuPanel4.add(sointu9b13, c);
        c.gridy++;
        sointuPanel4.add(sointuMaj9, c);
        c.gridy++;
        sointuPanel4.add(sointuMaj9sus4, c);
        
        c.gridx++;
        c.gridx++;
        c.gridy = 0;
        sointuPanel4.add(sointuMaj9r5, c);
        c.gridy++;
        sointuPanel4.add(sointuMaj9r11, c);
        c.gridy++;
        sointuPanel4.add(sointum9, c);
        c.gridy++;
        sointuPanel4.add(sointumadd9, c);
        c.gridy++;
        sointuPanel4.add(sointum9b5, c);
        c.gridy++;
        sointuPanel4.add(sointum9Maj7, c);

        c.gridy = 0;
        c.gridx = 0;
        sointuPanel5.add(sointu11, c);
        c.gridy++;
        sointuPanel5.add(sointu11b9, c);
        c.gridy++;
        sointuPanel5.add(sointuMaj11, c);
        c.gridy++;
        sointuPanel5.add(sointum11, c);
        c.gridy++;
        sointuPanel5.add(sointumMaj11, c);
        
        c.gridy = 0;
        c.gridx = 0;
        sointuPanel6.add(sointu13, c);
        c.gridy++;
        sointuPanel6.add(sointu13r9, c);
        c.gridy++;
        sointuPanel6.add(sointu13b9, c);
        c.gridy++;
        sointuPanel6.add(sointu13b5b9, c);
        c.gridy++;
        sointuPanel6.add(sointuMaj13, c);
        c.gridy++;
        sointuPanel6.add(sointum13, c);
        c.gridy++;
        sointuPanel6.add(sointumMaj13, c);
        
        //sointujen sarakepaneelit gridPaneliin
        
        c.gridy = 0;
        c.gridx = 0;
        c.anchor = GridBagConstraints.PAGE_START;
        c.fill = GridBagConstraints.NONE;
        
        
        gridPanel.add(sointuPanel1, c);
        c.gridx++;
        c.gridx++;
        gridPanel.add(sointuPanel2, c);
        c.gridx++;
        c.gridx++;
        gridPanel.add(sointuPanel3, c);
        c.gridx++;
        c.gridx++;
        gridPanel.add(sointuPanel4, c);
        c.gridx++;
        c.gridx++;
        gridPanel.add(sointuPanel5, c);
        c.gridx++;
        c.gridx++;
        gridPanel.add(sointuPanel6, c);
        
        //paneelien muotoilut ja sisäkkäiset asettamiset
   
        sointuPanel1.setBackground(tausta);
        sointuPanel2.setBackground(tausta);
        sointuPanel3.setBackground(tausta);
        sointuPanel4.setBackground(tausta);
        sointuPanel5.setBackground(tausta);
        sointuPanel6.setBackground(tausta);
        
        helpPanel.setBackground(tausta);
        gridPanel.setBackground(tausta);
        pianoPanel.setBackground(tausta);
        tyhjaPanel.setBackground(tausta);
        hyperPanel.setBackground(tausta);
        
        helpPanel.add(help, BorderLayout.EAST);
        superPanel.add(helpPanel, BorderLayout.NORTH);
        superPanel.add(pianoPanel, BorderLayout.CENTER);
        superPanel.add(gridPanel, BorderLayout.SOUTH);
        hyperPanel.add(superPanel, BorderLayout.CENTER);
        hyperPanel.add(tyhjaPanel, BorderLayout.SOUTH);
        
        fraami.add(hyperPanel);
        
        //mahdollisia ilmenneitä sisällönesitysongelmia varten:
        superPanel.revalidate();
        superPanel.repaint();
        hyperPanel.revalidate();
        hyperPanel.repaint();
        fraami.requestFocus();
    	
    }
    
    public static void main(String[] args){
        
        Koskettimisto piano = new Koskettimisto();
     
    }
 
}