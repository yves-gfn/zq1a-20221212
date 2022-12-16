package _03_Arrays._Uebungen;

public class _030_1_ArrayRechnen {

	public static void main(String[] args) {
		int arrayEins[]= new int [5];
		arrayEins[0]=22;
		arrayEins[1]=2;
		arrayEins[2]=21;
		arrayEins[3]=18;
		arrayEins[4]=7;

		//1)
		for(int i : arrayEins) {
			System.out.print(i + " ");
		}
		
		//2)
		arrayEins[2] = arrayEins[2] * arrayEins[1];
		
		//3
		arrayEins[0] /= arrayEins[3];	//Schnellschreibweise mit kombiniertem Zuweisungsoperator /=
		
		System.out.println();
		//4) Falls das fünfte Element ein Teiler des dritten Elementes ist,
		//dann soll die Konsolenausgabe „5. Element ist Teiler vom 3. Element“ erscheinen.
		if(arrayEins[2] % arrayEins[4] == 0) {
			System.out.println("5. Element ist Teiler vom 3. Element");
		} else System.out.println("5. Element ist nicht Teiler vom 3. Element");
		
		//5)
		for(int i : arrayEins) {
			System.out.print(i + " ");
		}
		
		
	}

}
