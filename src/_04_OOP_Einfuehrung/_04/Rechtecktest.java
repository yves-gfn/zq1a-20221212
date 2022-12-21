package _04_OOP_Einfuehrung._04;

import javax.swing.JOptionPane;

public class Rechtecktest {

	public static void main(String[] args) {
		Rechteck myRechteck = new Rechteck(Double.parseDouble(JOptionPane.showInputDialog("Bitte Laenge eingeben: ")), 
						Double.parseDouble(JOptionPane.showInputDialog("Bitte Breite eingeben: ")));
		
		System.out.println("Lange Seite: " + String.format("%,.2f", myRechteck.getLangeSeite()) + 
							"\nKurze Seite: " + String.format("%,.2f",myRechteck.getKurzeSeite()) + 
							"\nFlaeche: " + String.format("%,.2f", myRechteck.getFlaeche()) + 
							"\nUmfang: " + String.format("%,.2f", myRechteck.getUmfang()) + 
							"\nDiagonale: " + String.format("%,.2f", myRechteck.getDiagonale()));
		
		myRechteck.laengeVergroessern(20.8);
		System.out.println("Neue Laenge nach Vergroesserung: " + myRechteck.getLaenge());
		
		myRechteck.laengeVerkleinern(8.2);
		System.out.println("Neue Laenge nach Verkleinerung: " + myRechteck.getLaenge());
		
		myRechteck.breiteVergroessern(3.0);
		System.out.println("Neue Breite nach Vergroesserung: " + myRechteck.getBreite());
		
		myRechteck.breiteVerkleinern(2.0);
		System.out.println("Neue Breite nach der Verkleinerung: " + myRechteck.getBreite());
		
	}

}
