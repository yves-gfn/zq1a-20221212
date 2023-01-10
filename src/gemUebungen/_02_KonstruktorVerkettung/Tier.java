package gemUebungen._02_KonstruktorVerkettung;

public class Tier {
	double gewicht;
	
//	Tier() {
//		this(0);
//	}
	
	Tier(double gewicht) {
		//impliziter super() Call auf Konstruktor von Objekt
		this.gewicht = gewicht;
	}
	
	@Override
	public String toString() {
		return "Ein Tier mit folgenden Gewicht: " + this.gewicht;
	}
}

