package _05_MitKlassenArbeiten._05;

public class Anteil extends Bruch {
	public static Bruch verteilterAnteil = new Bruch();
	
	Anteil() {
		this(0, 1);
	}
	
	Anteil(int z, int n) {
		super(z, n);
		
		verteilterAnteil = verteilterAnteil.addiere(this);
		if(verteilterAnteil.dezimalwert() > 1) System.out.println("Zuviel verteilt! Nix mehr uebrig!");
	}
	
	public double getVerteilt() {
		return verteilterAnteil.dezimalwert();
	}
	
	public Bruch getRest() {
		Bruch meinBruch = new Bruch(1);
		return meinBruch.subtrahiere(verteilterAnteil);
	}
}
