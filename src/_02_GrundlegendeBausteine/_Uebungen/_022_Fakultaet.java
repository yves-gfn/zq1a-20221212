package _02_GrundlegendeBausteine._Uebungen;

import javax.swing.JOptionPane;

public class _022_Fakultaet {

	public static void main(String[] args) {
		int eingabeZahl = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie eine Zahl von 0 bis 10 ein: "));
		int ergebnis = 1;
		String ausgabe ="Das Ergebnis der " + eingabeZahl + "! ist: " + ergebnis;
		
		
		final int UNTERE_GRENZE = 0;
		final int OBERE_GRENZE = 10;
		
		if(eingabeZahl >= UNTERE_GRENZE && eingabeZahl <= OBERE_GRENZE) {
			if(eingabeZahl == 0 || eingabeZahl == 1) {
				JOptionPane.showMessageDialog(null, ausgabe);
			} else {
				for(int i = 1; i <= eingabeZahl; i++) {
					//Alternative: ergebnis = ergebnis * i;
					ergebnis *= i;
				}
				JOptionPane.showMessageDialog(null, "Das Ergebnis der " + eingabeZahl + "! ist: " + ergebnis);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Bitte beim naechsten mal eine Zahl zwischen 0 und 10 eingeben.");
		}
		
	}
}
