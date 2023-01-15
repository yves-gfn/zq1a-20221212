package _06_GrundlegendeKlassen._03;

import javax.swing.JOptionPane;

public class _03_Stringrueckwaerts {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Bitte geben Sie eine Wort, dass rueckwaerts ausgegeben werden soll: ");
		
		//Variante 1
		String tmpInput = "";
		for(int i = input.length() - 1; i >= 0; i--) {
			tmpInput += input.charAt(i);
		}
		
		System.out.println("Variante 1: " + tmpInput);
		
		//Variante 2
		StringBuilder sb = new StringBuilder(input);
		System.out.println("Variante 2: " + sb.reverse());
		
		
		//Variante 3
		System.out.println(new StringBuilder(JOptionPane.showInputDialog("Eingabe für umzudrehenden Text: ")).reverse());


	}

}
