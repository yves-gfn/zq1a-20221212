package _03_Arrays._Uebungen;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class _033_1_ArrayGroesseAendern {
	public static void main(String[] args) {
		String[] arr = {"Hans", "Christian", "Lisa"};
		final int NEW_LENGTH = Integer.parseInt(
				JOptionPane.showInputDialog("Please enter the new length of the array: "));
		
		String outputString = "New Array: ";
		
		arr = Arrays.copyOf(arr, NEW_LENGTH);

		
		//Schönere Variante des Ausgabestrings
		String SEPARATOR = "";
		for(String j : arr) {
			outputString += SEPARATOR + " "  + j;
			SEPARATOR = ", ";
		}
		
		JOptionPane.showMessageDialog(null, outputString);
	}
	
}
