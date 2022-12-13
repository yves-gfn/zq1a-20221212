package _01_GrundlegendeBausteine;

public class _015_IfWithoutCurlyBraces {

	public static void main(String[] args) {

		int a = 10;
		
		//Normale Schreibweise, mit allern Klammern
		if(a == 10) {
			System.out.println("a = 10"); //Ende des if
		}   else {
			System.out.println("a != 10");		
		}
		System.out.println("Hello World");
			
		
		// Wenn if, else, while und for usw. nur aus einer Anweisung bestehen, koennen 
		// die geschweiften Klammern weg gelassen werden
		// Achtung, Zeile 25 koennte Fehlinterpretiert werden = OCA RedFlag (weil Python)
		if(a == 10) 
			System.out.println("a = 10"); //Ende des if, da nur eine Anweisung erlaubt ist	
		else 
			System.out.println("a != 10");
			System.out.println("Hello World");
			
		// auch bei while möglich...
		int b = 0;
		while(b++ < 10) System.out.println(b);
		
		// häufiger Anwendungsfall: if und Anweisung direkt in einer Zeile!
		if(true) a = 20;
	}
}
