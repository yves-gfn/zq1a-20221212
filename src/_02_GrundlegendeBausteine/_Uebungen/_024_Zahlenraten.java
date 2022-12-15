package _02_GrundlegendeBausteine._Uebungen;

import javax.swing.JOptionPane;

public class _024_Zahlenraten {
	

	
	public static void main(String[] args) {
		int zahl = 0;
		String ratezahl = "";
		
		//Zustaende (beschreiben den aktuellen Zustand (State) des Programms
		int versuche = 0;
		boolean hatGewonnen = false;
		boolean hatAbgebrochen = false;
		
		final int MIN_RATEWERT = 1;
		final int MAX_RATEWERT = 30;
		
		final int ANZAHL_TIPP = 5;
		final int ANZAHL_ABBRUCHFRAGE = 10;
		final int ANZAHL_ABBRUCH = 30;
		
		JOptionPane.showMessageDialog(null, "Herzliche Willkommen zum Zahlenrate - Spiel. Viel Glueck beim Raten!");
		
		do {
			if(versuche > 0) {
				JOptionPane.showMessageDialog(null, "Ihre Zahl liegt nicht in den Gewinnparametern. Versuchen Sie es erneut");
			}
			ratezahl = JOptionPane.showInputDialog("Bitte gebene Sie eine Zahl ein: ");
			if(ratezahl.isBlank()) {
				JOptionPane.showMessageDialog(null, "Bitte gibt doch eine Zahl ein!!!");
				System.out.println("Die Ratezahl leer ist");
			} else {
				zahl = Integer.parseInt(ratezahl);
				versuche ++;
				
				if(zahl >= MIN_RATEWERT && zahl <= MAX_RATEWERT && zahl % 5 == 0) hatGewonnen = true;
				
				if(!hatGewonnen) {
					switch(versuche) {
					case ANZAHL_TIPP: JOptionPane.showMessageDialog(null, "Ein kleiner Tipp: Die Zahl muss zwischen 1 und 30 liegen.");
									  break;
					case ANZAHL_ABBRUCHFRAGE: String abfrage = JOptionPane.showInputDialog("Ohjeee... das wird wohl nix mehr!" 
												+ "Wollen Sie es trotzdem weiter probieren?"
												+ "Antworten Sie mit ja oder nein".toLowerCase().trim());
											  if(abfrage.equals("nein")) {
												 hatAbgebrochen = true;
											  }
											  break;
					case ANZAHL_ABBRUCH: JOptionPane.showMessageDialog(null, "Fuer Ihre Gesundheit wird das Spiel beendet."
										+ "Starten Sie es erneut, wenn Sie es noch mal spielen wollen!");
										  hatAbgebrochen = true;
					}
				}
			}
		} while (!hatGewonnen && !hatAbgebrochen);
		
		if(hatGewonnen) {
			JOptionPane.showMessageDialog(null, "Erfolgreich erraten! Bis zum naechsten mal.");
		} else {
			JOptionPane.showMessageDialog(null, "Bis zum naechsten mal.");
		}

	}

}
