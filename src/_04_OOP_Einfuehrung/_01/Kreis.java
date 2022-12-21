package _04_OOP_Einfuehrung._01;

public class Kreis {
	double radius;
	
	//Standard Konstruktor (Default)
	Kreis() {
		this.radius = 0;
	}
	
	Kreis(double radius) {
		this.radius = radius;
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
	
	
}
