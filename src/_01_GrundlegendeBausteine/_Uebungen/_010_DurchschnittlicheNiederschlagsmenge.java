package _01_GrundlegendeBausteine._Uebungen;

import javax.swing.JOptionPane;

public class _010_DurchschnittlicheNiederschlagsmenge {

	public static void main(String[] args) {
		
		
		final int ANZAHL_MONATE = 3;
		
//		Friendly Reminder
//		String mai = JOptionPane.showInputDialog("Geben Sie bitte die Niederschlagsmenge fuer Main ein: ");
//		double umgMai = Double.parseDouble(mai);
		
		double april = Double.parseDouble(JOptionPane.showInputDialog
				("Geben Sie bitte die Niederschlagsmenge fuer April ein: "));
		double mai = Double.parseDouble(JOptionPane.showInputDialog
				("Geben Sie bitte die Niederschlagsmenge fuer Mai ein: "));
		double juni = Double.parseDouble(JOptionPane.showInputDialog
				("Geben Sie bitte die Niederschlagsmenge fuer Juni ein: "));
		
		double result = (april + mai + juni) / ANZAHL_MONATE;
		
		JOptionPane.showMessageDialog(null, "Die Niederschlagsmenge fuer April is: " + String.format("%.2f l/m\u00B2", april) + "\n"
									+ "Die Niederschlagsmenge fuer Mai ist: " + String.format("%.2f l/m\u00B2", mai) + "\n"
									+ "Die Niederschlagsmenge fuer Juni ist: " + String.format("%.2f l/m\u00B2", juni) + "\n\n"
									+ "Die durchschnittliche Niederschlagsmenge betraegt: " + String.format("%.2f l/m\u00B2", result));
	}
}
