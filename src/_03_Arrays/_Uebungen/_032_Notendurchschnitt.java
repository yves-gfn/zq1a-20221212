package _03_Arrays._Uebungen;

import javax.swing.JOptionPane;

public class _032_Notendurchschnitt {

	public static void main(String[] args) {
		double summe = 0;
		//Anzahl der Noten 
		int anzahlNoten = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die exakte Anzahl der Noten ein: "));
		double[] arrNoten = new double[anzahlNoten];
		String ausgabeNoten = "Ihre eingegebenen Noten betragen: ";
		
		//Nutzeingabe der Noten
		for(int i = 0; i < arrNoten.length; i++) {
			arrNoten[i] = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie Ihre " + (i + 1) + ". Note ein: "));
			summe += arrNoten[i];
		}
		
		//Kein Komma am Ende der Ausgabe!
		for(int i = 0; i < arrNoten.length; i++) {
			if(i == arrNoten.length - 1) ausgabeNoten += arrNoten[i];
			else ausgabeNoten += arrNoten[i] + ", ";
		}
		
		JOptionPane.showMessageDialog(null, ausgabeNoten + "\nIhre Notendurchschnitt beträgt: " + 
											String.format("%.2f", (summe / anzahlNoten)));
	}

}
