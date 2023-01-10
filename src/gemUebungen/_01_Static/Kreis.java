package gemUebungen._01_Static;

public class Kreis {
	double radius;
	static int anzahlKreis = 0;
	
	//Standard Konstruktor (Default)
	Kreis() {
		this(0);
	}
	
	Kreis(double radius) {
		this.radius = radius;
		anzahlKreis++;
	}
	
	//Getter fuer Radius
	double getRadius() {
		return this.radius;
	}
	//Setter fuer Radius
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Umfang als virtuelles Attribut (nicht als Datenelement existent, kann aber aus vorhandenem berechnet werden)
	double getUmfang() {
		return 2 * Math.PI * this.radius;
	}
	
	//Flaeche als virtuelles Attribut
	double getFlaeche() {
		return Math.PI * Math.pow(radius, 2);
		//return Math.PI * radius * radius;
	}
	
	void setRadiusByUmfang(double umfang) {
		this.radius = umfang / (2 * Math.PI);
	}
	
	void setRadiusByFlaeche(double flaeche) {
		this.radius = Math.sqrt(flaeche / Math.PI);
	}
	
	static int getAnzahlKreise() {
		return anzahlKreis;
	}
	
	//Methoden überschreiben
	//Die toString() Methode von Object geerbt wird überschrieben
	
	@Override
	public String toString() {
		return "Kreisradius: " + this.getRadius() 
		+"\nKreisflaeche: " + String.format("%.2f", this.getFlaeche())
		+"\nKreisumfang: " + String.format("%.2f", this.getUmfang());
	}
	
	
}
