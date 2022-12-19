package _03_Arrays._Uebungen;

import javax.swing.JOptionPane;

public class _034_ZweidimensionalePersonen {

	public static void main(String[] args) {
		String[] categories = {"Vorname", "Nachname", "Alter", "Familienstand", "Beruf"};
		
		String[][] persons = 
				{
					{"Hans", "Werner", "48", "ledig", "Handwerker"},
					{"Christian", "Herrero" , "30", "verheiratet", "Bankaufmann"},	
					{"Elif", "Yamaz", "8", "ledig", "Schuelerin"},
					{null, null, null, null, null}				
				};
		
		final int AMOUNT_NULLS_NEEDED = categories.length; //MAGIC NUMBER VERMEIDUNG
		
		int includeIndex = -1; //-1 für Index nicht gefunden
		int amountNull = 0;
		
		//Schleife sucht null index solange Includeindex seinen Wert von -1 nicht verändert
		for(int i = 0; i < persons.length && includeIndex == -1; i++) {
			for(int j = 0; j < persons[i].length && includeIndex == -1; j++) {
				if(persons[i][j] == null) amountNull++;
				if(amountNull == AMOUNT_NULLS_NEEDED) includeIndex = i;
			}
			amountNull = 0;
		}
		
		//Schreibe an Stelle includeIndex den neuen Datensatz
		String input = " ";
		if(includeIndex >= 0) {
			for(int i = 0; i < categories.length; i++) {
				input = JOptionPane.showInputDialog(categories[i] + ":");
				
				if(input.equals("")) { //input.isEmpty()
					input = null;
				}
				persons[includeIndex][i] = input;
			}
		}
		
		String output = "";
		//Bastle Ausgabestring mit Kategorien als Ueberschrift
		for(int i = 0; i < categories.length; i++) {
			output += categories[i] + " ";
		}
		output += "\n";
		
		//Bastle Ausgabestring
		for(int i = 0; i < persons.length; i++) {
			for(int j = 0; j < persons[i].length; j++) {
				output += persons[i][j] + " ";
			}
			output += "\n";
		}
		JOptionPane.showMessageDialog(null, output);
	}
}
