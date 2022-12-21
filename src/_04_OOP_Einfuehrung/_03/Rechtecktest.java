package _04_OOP_Einfuehrung._03;

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
		
		myRechteck.laengeAusgeben();
		
	}

}
