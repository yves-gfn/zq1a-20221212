package _04_OOP_Einfuehrung._07;

public class Rechteck {
	double laenge;
	double breite;
	
	Rechteck() {
		laenge = 0;
		breite = 0;
	}
	
	Rechteck(double laenge, double breite) {
		this.laenge = laenge;
		this.breite = breite;
	}
	
	void setLaenge(double laenge) {
		this.laenge = laenge;
	}
	
	void setBreite(double breite) {
		this.breite = breite;
	}
	
	void setSeiten(double laenge, double breite) {
		this.laenge = laenge;
		this.breite = breite;
	}
	
	double getLaenge() {
		return this.laenge;
	}
	
	double getBreite() {
		return this.breite;
	}
	
	//virtuellesAttribut LangeSeite
	double getLangeSeite() {
		if(laenge > breite) return laenge;
		else return breite; 
	}
	//virtuellesAttribut KurzeSeite
	double getKurzeSeite() {
		if(laenge > breite) return breite;
		else return laenge;
	}
	
	//virtuellesAttribut DiagonaleSeite
	double getDiagonale() {
		return Math.sqrt(this.laenge * this.laenge + this.breite * this.breite);
	}
	
	//virtuellesAttribut Flaeche
	double getFlaeche() {
		return this.laenge * this.breite;
	}
	
	//virtuellesAttribut Umfang
	double getUmfang() {
		return 2 * this.laenge + 2 * this.breite;
	}
	
	void laengeAusgeben() {
		var laenge = 5.4;
		System.out.println("Laenge: " + laenge);
	}
	
	void laengeVergroessern(double laenge) {
		this.laenge += laenge;
	}
	
	void breiteVergroessern(double breite) {
		this.breite += breite;
	}
	
	void laengeVerkleinern(double laenge) {
		this.laenge -= laenge;
	}
	
	void breiteVerkleinern(double breite) {
		this.breite -= breite;
	}
	
	
	
	
}
