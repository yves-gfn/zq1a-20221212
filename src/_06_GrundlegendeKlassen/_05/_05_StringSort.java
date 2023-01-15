package _06_GrundlegendeKlassen._05;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class _05_StringSort {

	public static void main(String[] args) {
		final int AMOUNT_STRINGS = 3;
		
		String[] arr = new String[AMOUNT_STRINGS];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = JOptionPane.showInputDialog(i + 1 + ": Bitte geben Sie eine Zeichenkette ein: ");
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
