package _06_GrundlegendeKlassen._02;

import javax.swing.JOptionPane;

public class _02_Vokalzaehler {

	public static void main(String[] args) {
		int aCounter = 0, eCounter = 0, iCounter = 0, oCounter = 0, uCounter = 0;
		String input = JOptionPane.showInputDialog("Bitte geben Sie eine Wort, in dem die Vokale gezaehlt werden sollen: ");
		String input2 = input.toLowerCase();
		
		for(int i = 0; i < input2.length(); i++) {
			switch(input2.charAt(i)) {
			case 'a': 
				aCounter++;
				break;
			case 'e':
				eCounter++;
				break;
			case 'i':
				iCounter++;
				break;
			case 'o':
				oCounter++;
				break;
			case 'u':
				uCounter++;
				break;
			}
		}
		
		System.out.println("Eingabetext: \'" + input + "\' hat folgende Vokale: ");
		System.out.println("a: " + aCounter);
		System.out.println("e: " + eCounter);
		System.out.println("i: " + iCounter);
		System.out.println("o: " + oCounter);
		System.out.println("u: " + uCounter);
	}
}
