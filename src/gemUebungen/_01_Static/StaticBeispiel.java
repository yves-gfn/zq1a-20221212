package gemUebungen._01_Static;

public class StaticBeispiel {
	static String beispielText;
	String beispielText2;
	
	
	public static void main(String[] args) {
		beispielText = "Hallo"; //Vers 1
		StaticBeispiel.beispielText = "Hallo2"; //Vers2 über statischen Aufruf der Klasse
		
		StaticBeispiel sb = new StaticBeispiel();
		sb.beispielText2 = "InstanzHallo";

	}
	
	//Instanzmethode eines Objektes KENNT alle Attribute und Methoden, auch statische
	public void setBeispielText() {
		beispielText = "Hallo";
	}
	
	public static void setBeispielText2() {
		// beispielText2 = "Hallo2";  funktioniert nicht aus einer statischen Methode heraus!
		// this.beispieltText2 = "Hallo2"; this ist in statischen Methoden unbekannt, da nicht über ein Objekt aufgerufen
	}

}
