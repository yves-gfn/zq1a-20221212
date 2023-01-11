package _05_MitKlassenArbeiten._04;

public class BruchMitSeriennummer extends Bruch {
	public static int seriennummer = 0;
	private final int eigeneSeriennummer;
	
	BruchMitSeriennummer(int zaehler, int nenner) {
		super(zaehler, nenner);
		eigeneSeriennummer = ++seriennummer;
	}

	public int getEigeneSeriennummer() {
		return eigeneSeriennummer;
	}
	
	@Override
	public void ausgeben() {
		System.out.println("Bruch: " + this.getZaehler() + "/" + this.getNenner()
					+ "\nSeriennummer: " + this.getEigeneSeriennummer());
	}
}
