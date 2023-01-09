package gemUebungen._01_Static;

public class Kreistest {

	public static void main(String[] args) {
		Kreis kreis = new Kreis();
		Kreis kreis2 = new Kreis(5);
		Kreis kreis3 = new Kreis(2.3);
		
		System.out.println("Anzahl ersteller Kreise: " + Kreis.getAnzahlKreise());

	}

}
