package _03_Arrays._Uebungen;

import java.util.Arrays;

public class _030_0_ArraySpielereien {

	public static void main(String[] args) {
		
		//Aufgabe 1
		int[] arr1 = new int[5];
		arr1[0] = 4;
		arr1[1] = 2; 
		arr1[2] = 3;
		arr1[3] = 2;
		arr1[4] = 3;
		
		
		//Aufgabe 2
		System.out.println("arr1[2]: " + arr1[2] + ", arr1[4]: " + arr1[4]);
		
		System.out.println();
		
		//Aufgabe 3
		System.out.println("arr1[3] vor der Aenderung: " + arr1[3]);
		
		arr1[3] = 42;
		
		System.out.println("arr1[3] nach der Aenderung: " + arr1[3]);
		
		System.out.println();
		//Aufgabe 4
		int[] arr2 = {15, 25, 35, 45, 55}; 
		
		
		//Aufgabe 5
		System.out.println("Ausgabe von arr2: ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		//Aufgabe 6
		System.out.println("\n");
		System.out.println("arr2 komplett mit 0en ueberschrieben.");
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = 0;
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println("\n");
		
		//Aufgabe 7
		int arr3[] = new int[5];
		Arrays.fill(arr3, 5);
		
		System.out.println("Ausgabe von arr3 mit 5 gefuellt (und mit fill-Methode): " );
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		
		System.out.println("\n");
		
		//Aufgabe 8
		int arr4[] = {5, 16, 7, 31, 21};
		System.out.print("arr4 Literal unsortiert: " + Arrays.toString(arr4) + ", sortiert:  ");
		Arrays.sort(arr4);
		
		for(int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + " ");
		}
		
		System.out.println("\n");
		
		
		//Aufgabe 9
		System.out.println("Das Element Lisa wurde gesucht und gefunden...");
		String[] arr5 = {"Xavier", "Lisa", "Otto"};
		
		Arrays.sort(arr5);
		
		int foundIndex = Arrays.binarySearch(arr5, "Lisa");
	
		if (foundIndex >= 0) {
			System.out.println("Das Element wurde an Stelle " + foundIndex + " im Array " + Arrays.toString(arr5) + " gefunden.");
		} else System.out.println("Das Element wurde nicht gefunden.");
		
		System.out.println("\n");
		
		
		//Aufgabe 10
		String[] arr6 = {"Xavier", "Lisa", "Otto"};
		
		if(Arrays.equals(arr5, arr6)) {
			System.out.println("arr5 und arr6 sind gleich");
		} else System.out.println("arr5 und arr6 sind nicht gleich");
		
		
		Arrays.sort(arr6);
		
		System.out.println("\nNach dem sortieren von arr6 (die Arrays muessten sortiert sein fuer equals)\n");
		if(Arrays.equals(arr5, arr6)) {
			System.out.println("arr5 und arr6 sind gleich");
		} else System.out.println("arr5 und arr6 sind nicht gleich");
		
		System.out.println("\n");
		
		//Aufgabe 11
		for(int i : arr1) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(String s: arr5) {
			System.out.print(s + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
