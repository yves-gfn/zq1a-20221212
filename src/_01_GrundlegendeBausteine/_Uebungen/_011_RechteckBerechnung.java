package _01_GrundlegendeBausteine._Uebungen;

import javax.swing.JOptionPane;

public class _011_RechteckBerechnung {

	public static void main(String[] args) {
		double laenge = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Laenge ein: "));
		double breite = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Breite ein: "));
		String masseinheit = JOptionPane.showInputDialog("Bitte Masseinheit uebergeben: ");
		
		double flaeche = laenge * breite;
		double umfang = (2 * laenge + 2 * breite);
		
		JOptionPane.showMessageDialog(null, "Die eingebene Laenge betraegt: " + laenge + masseinheit + "\n"
										 + "Die eingebene Breite betraegt:  " + breite + masseinheit + "\n\n"
										 + "Der Umfang des Rechtecks betraegt: " + umfang + masseinheit + "\n"
										 + "Die Flaeche des Rechtecks betraegt: " + flaeche + masseinheit);
	}
}
