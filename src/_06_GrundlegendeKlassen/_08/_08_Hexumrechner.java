package _06_GrundlegendeKlassen._08;

import javax.swing.JOptionPane;

public class _08_Hexumrechner {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Geben Sie bitte eine Hexadezimalzahl ein: " );
		JOptionPane.showMessageDialog(null, "Hexadezimal: " + input 
				+ "\nDezimal: " + Integer.valueOf(input, 16)
				+ "\nBinär: " + Integer.toBinaryString(Integer.valueOf(input, 16)));

	}
}
