package _03_Arrays._Uebungen;

import javax.swing.JOptionPane;

public class _033_0_ArrayGroesseAendern {
	
	public static void main(String[] args) {
		String[] arr = {"Hans", "Christian", "Lisa"};
		final int USR_AMOUNT = Integer.parseInt(
				JOptionPane.showInputDialog("Please enter the amount by which the array should be increased: "));
		
		String outputString = "New Array: ";
		
		String[] tmpArr = new String[arr.length + USR_AMOUNT];
		
		for(int i = 0; i < arr.length; i++) {
			tmpArr[i] = arr[i];
		}
		
		arr = tmpArr;
		
		
//		int i = 0;
//		for(String j : arr) {
//			outputString += j;
//			if(i != arr.length - 1) {
//				outputString += ", ";
//			}
//			i++;
//		}
		
		//Schönere Variante
		String SEPARATOR = "";
		for(String j : arr) {
			outputString += SEPARATOR + " "  + j;
			SEPARATOR = ", ";
		}
		
		JOptionPane.showMessageDialog(null, outputString);
	}
}
