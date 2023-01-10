package _05_MitKlassenArbeiten._02;

public class Girokonto extends Konto {
	private double limit;
	
	Girokonto(String kontonr, double kontostand, double limit) {
		super(kontonr, kontostand);
		setLimit(limit);
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}
	
	@Override
	public void auszahlen(double betrag) {
		if((this.getKontostand() - betrag) >= limit * -1) {
			super.auszahlen(betrag);
		} else System.out.println("Auszahlung ueberschreitet Kreditlimit");
	}
	
}
