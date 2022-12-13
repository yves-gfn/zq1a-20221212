package _01_GrundlegendeBausteine;

public class _011_InkrementDekrement {

	public static void main(String[] args) {
		//Präfix
		//Inkrement / Dekrement VOR der Variable bedeutet ERHÖHUNG bzw. VERRINGERUNG VOR der Zuweisung (oder weiterer Rechnung)
		int a = 8;
		int b = ++a;
		
		System.out.println(a);
		System.out.println(b);
		
		
		//Postfix
		//Inkrement / Dekrement wird erst NACH der Zuweisung (weitere Berechnung) ERHÖHT oder VERRINGERT
		int c = 8;
		int d = c++;
		
		System.out.println(c);
		System.out.println(d);
		
		a++; //kein Problem!
		c--; //kein Problem!

	}

}
