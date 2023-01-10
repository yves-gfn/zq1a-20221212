package _05_MitKlassenArbeiten._02;

public class Girokontotest {

	public static void main(String[] args) {
		Girokonto meinGirokonto = new Girokonto("0000000001", 10000, 1000);
		meinGirokonto.auszahlen(11000);
		
		System.out.println("Kontostand: " + meinGirokonto.getKontostand() + " Euro");
		
		meinGirokonto.einzahlen(11000);
		meinGirokonto.auszahlen(11001);
		System.out.println("Kontostand: " + meinGirokonto.getKontostand() + " Euro");
	}

}
