package _03_Arrays;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class _030_ArraysTheorie {
	public static int myValue;				//Klassenvariable			 - nicht lokal!
	public String name;						//Instanz / Objektvariable    - nicht lokal!
	
	
	public static void main(String[] args) {								 
		//int a = 0;						   //lokale Variable
		
		//Deklaration und Initialisierung in mehr als einer Zeile
		int[] values1;					   //lokale Array Variable
		values1 = new int[3];
		
		//Deklaration und Initialisierung in einer Zeile
		int[] values2 = new int[3];
		
		//Weniger verbreitet
		int values3[] = new int[3];
		
		//ArrayLiteral /Array-Konstante
		float[] values4 = {2.1f, 5.5f, 3.0f};
		
		//ArrayLiteral /Array-Konstante lange Variante
		double[] values5 = new double[] {2.1, 5.5, 3.0};
		
		
		//Schreiben von Array Elemente über den Index
		values1[0] = 20;
		values1[1] = 11;
		values1[2] = 3;
//		values1[3] = 5;  //Achtung! Funktioniert nicht. Letzte Position des Array (values1.length -1) 
		
		//Lesen von Array Elementen über den Index
		System.out.println("values1[0]: " + values1[0]);
		System.out.println("values1[1]: " + values1[1]);
		System.out.println("values1[2]: " + values1[2]);
		
		//Laenge des Arrays ausgeben
		System.out.println(values1.length);
		
		System.out.println(); //einfach nur ein Absatz um die Konsolenausgabe zu trennen!
		
		//Standardausgabe Array
		for(int i = 0; i < values1.length; i++) {
			System.out.println("values1[" + i + "]: " + values1[i]);		
		}
		
		
		//Array eines Arrays mit enhanced-for Loop
		for(int i : values1) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		String[] nameArray = {"Hans", "Lisa", "Herbert"};
		
		//Enhanced for-loop mit String
		for(String s : nameArray) {
			System.out.print(s + " ");
		}
		
		double[][] multiArr = new double[3][3];
		//Schreiben von Elementen eines 2 dimensionalen Arrays
		multiArr[0][0] = 3.1;
		multiArr[0][1] = 5.5;
		multiArr[0][2] = 7.9;
		multiArr[1][0] = 1.1;
		multiArr[1][1] = 4.9;
		multiArr[1][2] = 3.0;
		//.... und so weiter!
		
		System.out.println();
		
		//Standard Ausgabe eines multidimensionalen Arrays (2D)
		for(int i = 0; i < multiArr.length; i++) {
			for(int j = 0; j < multiArr[i].length; j++) {
				System.out.print(multiArr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		//Ausgabe eines Arrays mit enhanced for Loop (2D)
		for(double[] i : multiArr) {
			for(double j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		String[][] sArr = new String[3][2];
		for(int i = 0; i < sArr.length; i++) {
			for(int j = 0; j < sArr[i].length; j++) {
				sArr[i][j] = JOptionPane.showInputDialog("Name eingeben!");
			}
			System.out.println();
		}
		
		//Standard eindimensionales Array ausgeben (schnell, debug)
		System.out.println(Arrays.toString(values1));
		
		
		// Multidimensionale - Arrays auszugeben (schnell, debug)
		System.out.println(Arrays.deepToString(sArr));
	}

}
