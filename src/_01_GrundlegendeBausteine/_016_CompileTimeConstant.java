package _01_GrundlegendeBausteine;

import javax.swing.JOptionPane;

public class _016_CompileTimeConstant {

	public static void main(String[] args) {
		//Normales Switch
		//erlaubt Datentypen für Ausdrücke und Case - Konstanten: byte, short, char, int, String und ENUM
		int zahl = 2;
		
		switch(zahl) {
		case 1: System.out.println("Es wurde 1 gewaehlt");
        			break;
		case 2: System.out.println("Es wurde 2 gewaehlt");
		        break;
		// default ist Optional und muss nicht unten stehen!
		// tut es das nicht, 
		default: System.out.println("Es wurde nichts gewaehlt");
		}
		
		//Switch Beispiel mit String
		String meinText = "Mutter";
		
		switch(meinText) {
		case "Mutter": System.out.println("Mutter bekommt Tee");
        			break;
		case "Vater": System.out.println("Vater bekommt Tee");
		        break;
		case "Kind": System.out.println("Kind bekommt Tee");
				break;
		default: System.out.println("Es wurde nichts gewaehlt");
		}
		
		//Switch mit User-Eingabe
		String meinText2 = JOptionPane.showInputDialog("Bitte waehle, wer Tee bekommt: Mutter, Vater, Kind");
		
		switch(meinText2) {
		case "Mutter": System.out.println("Mutter bekommt Tee");
        			break;
		case "Vater": System.out.println("Vater bekommt Tee");
		        break;
		case "Kind": System.out.println("Kind bekommt Tee");
				break;
		default: System.out.println("Keiner bekommt Tee");
		}
		
		
		int ausdruckZahl = 1;
		
		final int zahl1 = 3; // <--- compile-time-constant, da in EINER Zeile deklariert und intialisiert
		
		final int zahl2; // <--- KEINE compile-time-constant, da in mehr als EINER Zeile deklariert und intialisiert
		zahl2 = 1;
		
		final int zahl3 = Integer.parseInt(JOptionPane.showInputDialog("Bitte Case Ausdruck eingeben: "));
		// KEINE  compile-time-constant, da vom User initialisiert (und damit zur Compile - Zeit unbekannt)
		
		switch(ausdruckZahl) {
		case zahl1: System.out.println("Es wurde 1 gewaehlt");
		 			break;
//		case zahl2: System.out.println("Es wurde 2 gewaehlt"); <--- funktioniert nicht, da nicht compile time constant
//	  		        break;
//		case zahl3: System.out.println("Es wurde 2 gewaehlt"); <--- funktioniert nicht, da nicht compile time constant
//					break;
		}
	}

}
