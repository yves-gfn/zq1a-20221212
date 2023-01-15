package _06_GrundlegendeKlassen._04;

import javax.swing.JOptionPane;

public class _04_Stringrueckwaerts {

	public static void main(String[] args) {
		StringBuilder sbInput = new StringBuilder(JOptionPane.showInputDialog("Bitte geben Sie einen Text ein  " 
								+ ", der rueckwaerts ausgegeben werden soll: "));
		
		JOptionPane.showMessageDialog(null, "Ergebnis: " + sbInput.reverse());

	}

}
