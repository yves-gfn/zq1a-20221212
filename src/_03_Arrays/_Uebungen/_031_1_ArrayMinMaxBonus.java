package _03_Arrays._Uebungen;

import javax.swing.JOptionPane;

public class _031_1_ArrayMinMaxBonus {

	public static void main(String[] args) {
		int[] zahlen;// {5, 2 , 10, 9, 12, 3};
		int max = 0;
		int min = 0;
		String ausgabe = "";
		
		zahlen = new int[Integer.parseInt(JOptionPane.showInputDialog("Wie groß soll das Such-Array werden?"))];
		
		for(int i = 0; i < zahlen.length; i++) {
			zahlen[i] = Integer.parseInt(JOptionPane.showInputDialog("Welche Zahl möchtest du eingeben? "));
		}
		
		
		//Max herausfinden
		for(int i = 0; i < zahlen.length; i++) {
			if(zahlen[i] > max) max = zahlen[i];
		}
		
		
		//max in min schreiben, um gegen den hoechsten Wert zu pruefen
		min = max;
		//Min herausfinden
		for(int i = 0; i < zahlen.length; i++) {
			if(zahlen[i] < min) min = zahlen[i];
		}
		
		for(int i : zahlen) {
			ausgabe += i + " ";
		}
		
		JOptionPane.showMessageDialog(null, "Der Such - Array beträgt: " + ausgabe
										+ "\n\nDer Max - Wert beträgt: " + max 
										+ "\nDer Min - Wert beträgt: " + min);

	}

}
