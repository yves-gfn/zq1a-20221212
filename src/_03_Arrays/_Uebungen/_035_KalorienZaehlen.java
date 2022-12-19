package _03_Arrays._Uebungen;

public class _035_KalorienZaehlen {

	public static void main(String[] args) {
		int[][] kalorientasche = 
			{
				{1000, 2000, 3000},
				{4000},
				{5000, 6000},
				{7000, 8000, 9000},
				{10000}
			};
		
		int tmpKalorie = 0;
		int meisteKalorie = 0;
		int personMeisteKalorie = 0;
		
		for(int i = 0; i < kalorientasche.length; i++) {
			for(int j = 0; j < kalorientasche[i].length; j++) {
				tmpKalorie += kalorientasche[i][j];
			}
			if(tmpKalorie > meisteKalorie) {
				meisteKalorie = tmpKalorie;
				personMeisteKalorie = i + 1;
			}
			tmpKalorie = 0;
		}
		
		System.out.println("Der Expeditionsteilnehmer " + personMeisteKalorie 
				+ " hat mit " + meisteKalorie + "kcal die meisten Kalorien.");

	}

}
