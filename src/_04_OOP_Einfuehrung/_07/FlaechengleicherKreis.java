package _04_OOP_Einfuehrung._07;

import javax.swing.JOptionPane;

public class FlaechengleicherKreis {

	public static void main(String[] args) {
		double rLaenge = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Laenge des Rechtecks ein: "));
		double rBreite = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Breite des Rechtecks ein: "));
		
		Rechteck myRectangle = new Rechteck(rLaenge, rBreite);
		
		Kreis myCircle = new Kreis();
		myCircle.setRadiusByFlaeche(myRectangle.getFlaeche());
		
		System.out.println("Rechtecklaenge: " + myRectangle.getLaenge() 
						+ " Rechteckbreite: " + myRectangle.getBreite()
						+ " Rechteckflaeche: " + String.format("%.2f", myRectangle.getFlaeche())
						+ "\nKreisradius: " + String.format("%.2f", myCircle.getRadius())
						+ " Kreiflaeche: " + String.format("%.2f", myCircle.getFlaeche()));
	}
}
