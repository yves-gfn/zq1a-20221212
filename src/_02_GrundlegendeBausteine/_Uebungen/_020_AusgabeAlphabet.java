package _02_GrundlegendeBausteine._Uebungen;

import javax.swing.JOptionPane;

public class _020_AusgabeAlphabet {
	public static void main(String[] args) {
		String ausgabe = "Version1: \n";
		
		for(int i = 65; i <= 90; i++) {
			//ausgabe += (char)i + "\n";
			ausgabe = ausgabe + (char)i + "\n";
		}
		
		JOptionPane.showMessageDialog(null, ausgabe);
		
		
		String ausgabe2 = "Version2: \n";
		
		for(char c = 'A'; c <= 'Z'; c++) {
			ausgabe2 += c + "\n";
		}
		JOptionPane.showMessageDialog(null, ausgabe2);
	}
}
