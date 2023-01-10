package _05_MitKlassenArbeiten._01;

public class Kontotest {

	public static void main(String[] args) {
		Konto meinKonto = new Konto("0000000001", 1000);
		System.out.println("Kontonr: " + meinKonto.getKontonr());
		System.out.println("Kontostand: " + meinKonto.getKontostand());
		
		meinKonto.einzahlen(500);
		System.out.println("Kontostand nach dem Einzahlen: " + meinKonto.getKontostand());
		
		meinKonto.auszahlen(750.50);
		System.out.println("Kontostand nach dem Auszahlen: " + meinKonto.getKontostand());

	}
}
