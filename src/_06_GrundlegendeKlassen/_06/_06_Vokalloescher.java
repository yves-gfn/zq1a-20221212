package _06_GrundlegendeKlassen._06;

import javax.swing.JOptionPane;

public class _06_Vokalloescher {

	public static void main(String[] args) {
		StringBuilder sbInput = new StringBuilder(JOptionPane.showInputDialog("Bitte geben Sie einen Text ein  " 
				+ ", indem die Vokale geloescht werden: "));
		
		char[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
		
		for(int i = 0; i < sbInput.length(); i++) {
			for(int j = 0; j < vowels.length && i < sbInput.length(); j++) {
				if(vowels[j] == sbInput.charAt(i)) {
					sbInput.deleteCharAt(i);
				}
			}
		}
		
		System.out.println("Eingabe ohne Vokale: " + sbInput);

	}

}
