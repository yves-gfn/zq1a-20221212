package _04_OOP_Einfuehrung._05;

import javax.swing.JOptionPane;

public class Kreistest {

	public static void main(String[] args) {
		
		Kreis k1 = new Kreis(Double.parseDouble(JOptionPane.showInputDialog("Bitte gib den Radius des Kreises ein: ")));
		System.out.println("Der Radius des Kreises betraegt: " + k1.getRadius()
						+	"\nDer Umfang betraegt: " + k1.getUmfang()
						+ 	"\nDie Flaeche betraegt: " + k1.getFlaeche());

	}

}
