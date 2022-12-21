package _04_OOP_Einfuehrung._07;

public class Kreis {
	double radius;
	
	Kreis() {
		radius = 0;
	}
	
	Kreis(double radius) {
		this.radius = radius;
	}
	
	double getRadius() {
		return radius;
	}
	
	void setRadius(double r) {
		radius = r;
	}
	
	//Umfang ist quasi ein virtuelles Attribut
	double getUmfang() {
		return 2 * Math.PI * radius;
	}
	
	//Flaeche ist auch ein virtuelles Attribut, es existiert nicht in der Klasse, kann aber berechnet werden
	double getFlaeche() {
		return Math.PI * radius * radius;
	}
	
	void setRadiusByUmfang(double umfang) {
		this.radius = umfang / (2 * Math.PI);
	}
	
	void setRadiusByFlaeche(double flaeche) {
		this.radius = Math.sqrt(flaeche /  Math.PI);
	}
	
	
}
