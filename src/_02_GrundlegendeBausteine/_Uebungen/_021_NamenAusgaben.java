package _02_GrundlegendeBausteine._Uebungen;

import javax.swing.JOptionPane;

public class _021_NamenAusgaben {

	public static void main(String[] args) {
		String username = JOptionPane.showInputDialog("Bitte gibt einen Namen ein, der wiederholt werden soll: ");
		int amount = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib die Anzahl der Wiederholungen ein: "));
		
		//Vermeidung von Magic Numbers = Bitte versucht Zahlen im Quellcode zu vermeiden, die euch bekannt sind!
		final int MENGE_OBERE_GRENZE = 30;
		final int MENGE_UNTERE_GRENZE = 0;
		
		String ausgabe = "";
		
		if(amount > MENGE_UNTERE_GRENZE && amount <= MENGE_OBERE_GRENZE) {
			int zaehler = 1;
			
			while (zaehler <= amount) {
				//Alternative: ausgabe = ausgabe + zaehler + ": " + username + "\n";
				ausgabe += zaehler + ": " + username + "\n";
				zaehler++;
			}
			JOptionPane.showMessageDialog(null, ausgabe);
		} else {
			JOptionPane.showMessageDialog(null, "Leider falsche, bzw zu große und zu kleine Anzahl eingegeben. "
											+ "Bitte max. 30 und minimal 1 eingeben.");
		}
	}
}
