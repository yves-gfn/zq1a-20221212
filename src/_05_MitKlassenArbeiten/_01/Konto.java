package _05_MitKlassenArbeiten._01;

public class Konto {
	private String kontonr;
	private double kontostand;
	
	Konto() {}
	
	Konto(String kontonr, double kontostand) {
		super();
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
