package _06_GrundlegendeKlassen._07;

import javax.swing.JOptionPane;

public class _07_Zahlensystem {

	public static void main(String[] args) {
		int input = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie eine ganze Zahl ein: "));
		JOptionPane.showMessageDialog(null, "Dezimal: " + input 
				+ "\nDual: " + Integer.toBinaryString(input) 
				+ "\nHex: " + Integer.toHexString(input).toUpperCase());
	}
}
