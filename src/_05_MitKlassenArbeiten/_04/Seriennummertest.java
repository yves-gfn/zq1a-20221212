package _05_MitKlassenArbeiten._04;

public class Seriennummertest {

	public static void main(String[] args) {
		BruchMitSeriennummer bm1 = new BruchMitSeriennummer(5,2);
		BruchMitSeriennummer bm2 = new BruchMitSeriennummer(9,8);
		BruchMitSeriennummer bm3 = new BruchMitSeriennummer(12,5);
		BruchMitSeriennummer bm4 = new BruchMitSeriennummer(21,7);
		BruchMitSeriennummer bm5= new BruchMitSeriennummer(12,6);
		
		bm1.ausgeben();
		bm2.ausgeben();
		bm3.ausgeben();
		bm4.ausgeben();
		bm5.ausgeben();

	}

}
