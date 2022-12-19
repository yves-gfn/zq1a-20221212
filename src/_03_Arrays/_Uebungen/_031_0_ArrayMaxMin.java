package _03_Arrays._Uebungen;

import javax.swing.JOptionPane;

public class _031_0_ArrayMaxMin {

	public static void main(String[] args) {
		int[] zahlen = {5, 2 , 10, 9, 12, 3};
		int max = 0;
		int min = 0;
		String ausgabe = "";
		
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
