package _04_OOP_Einfuehrung._03;

public class Rechteck {
	double laenge;
	double breite;
	
	Rechteck() {
		this.laenge = 0;
		this.breite = 0;
	}
	
	Rechteck(double laenge, double breite) {
		this.laenge = laenge;
		this.breite = breite;
	}
	
	public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }
    
    public void setSeiten(double breite, double laenge) {
        this.breite = breite;
        this.laenge = laenge;
    }

	public double getLaenge() {
		return laenge;
	}

	public double getBreite() {
		return breite;
	}
    
	//Virtuelles Attribut "LangeSeite"
    double getLangeSeite() {
    		if(this.laenge > breite) return laenge;
    		else return breite;
    }
    
    //Virtuelles Attribut "KurzeSeite"
    double getKurzeSeite() {
    		if(this.laenge > breite) return breite;
    		else return laenge;
    		
    		//Alternative mit ternärer Operator
    		//return this.laenge > this.breite ? this.breite : this.laenge;
    }
    
    double getDiagonale() {
    		return Math.sqrt(this.laenge * this.laenge + this.breite * this.breite);
    }
    
    //Virtuelles Attribut "Flaeche"
    double getFlaeche() {
    		return this.laenge * this.breite;
    }
    
    //Virtuelles Attribut "Umfang"
    double getUmfang() {
    		return 2 * this.laenge + 2 * this.breite;
    }
    
    void laengeAusgeben() {
	    	double laenge = 5.4;
	    	System.out.println("Laenge: " + laenge);
    }
}
