package gemUebungen._02_KonstruktorVerkettung;

public class Vogel extends Tier {
	String federFarbBezeichnung;
	
	//default Konstrukto, Standard Konstruktor, wird automatisch 
	//angelegt, wenn nicht vom Programmier geschrieben
	Vogel() { 
		this(0.0, "unbekannt");
	}
	
	Vogel(double gewicht) {
		this(gewicht, "unbekannt");
	}
	
	Vogel(double gewicht, String federFarbBezeichnung) {
		super(gewicht);
		this.federFarbBezeichnung = federFarbBezeichnung;
	}
	
	@Override
	public String toString() {
		return "Ein Vogel, Gewicht: " + this.gewicht 
				+"\n Federfarbe: " + this.federFarbBezeichnung;
	}
}
