package gemUebungen._01_Static;

import javax.swing.JOptionPane;

public class Kreistest {

	public static void main(String[] args) {
		Kreis kreis = new Kreis();
		Kreis kreis2 = new Kreis(5);
		Kreis kreis3 = new Kreis(2.3);
		
		System.out.println("Anzahl ersteller Kreise: " + Kreis.getAnzahlKreise());
		
		System.out.println(kreis3.toString());
		
//		String usrInput = null;
//		Kreis kreis4 = null;
		
//		while(!Helper.isNumeric(usrInput)) {
//			usrInput = JOptionPane.showInputDialog("Bitte Radius des Kreises eingeben: ");
//			if(Helper.isNumeric(usrInput)) {
//				System.out.println("is numeric");
//				kreis4 = new Kreis(Double.parseDouble(usrInput));
//			} else {
//				JOptionPane.showMessageDialog(null, "Bitte eine Zahl eingeben!");
//			}
//		}
//		
//		System.out.println("Ihr erzeugter Kreis hat folgenden Radius: " + kreis4.getRadius());
	}

}
