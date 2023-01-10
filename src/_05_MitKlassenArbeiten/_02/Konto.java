package _05_MitKlassenArbeiten._02;

public class Konto {
	private String kontonr;
	private double kontostand;
	
	Konto(String kontonr, double kontostand) {
		this.kontonr = kontonr;
		this.kontostand = kontostand;
	}

	public String getKontonr() {
		return kontonr;
	}

	public double getKontostand() {
		return kontostand;
	}
	
	public void einzahlen(double betrag) {
		this.kontostand += betrag;
	}
	
	public void auszahlen(double betrag) {
		this.kontostand -= betrag;
	}
}
