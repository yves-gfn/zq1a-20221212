package _02_GrundlegendeBausteine._Uebungen;

import javax.swing.JOptionPane;

public class _023_DiscoEinlass {

	public static void main(String[] args) {
		String istAltGenug = JOptionPane.showInputDialog("Bist du 18 oder aelter?").toLowerCase();
		
		if(istAltGenug.equals("ja")) {
			String istVIP = JOptionPane.showInputDialog("Bist du ein VIP?").toLowerCase();
			String istFrau = JOptionPane.showInputDialog("Bist du eine Frau?").toLowerCase();
			
			if(istVIP.equals("ja") && istFrau.equals("ja")) {
				JOptionPane.showMessageDialog(null, "Herzlich Willkommen in unsere Disco - viel Spass in der VIP Lounge!"
												+  "Heute ist Ladies Night. Du bekommst 15% Rabatt auf Getraenke! :)");
			} else if (istVIP.equals("ja")) {
				JOptionPane.showMessageDialog(null, "Herzlich Willkommen in unsere Disco - viel Spass in der VIP Lounge!");
			} else if (istFrau.equals("ja")) {
				JOptionPane.showMessageDialog(null, "Herzlich Willkommen in unsere Disco. \n"
						+  "Heute ist Ladies Night. Du bekommst 15% Rabatt auf Getraenke! :)");
			} else {
				JOptionPane.showMessageDialog(null, "Herzlich Willkommen in unsere Disco! Viel Spass :)");
			}
		} else JOptionPane.showMessageDialog(null, "Du kommst hier nicht rein! :(");
	}
}
