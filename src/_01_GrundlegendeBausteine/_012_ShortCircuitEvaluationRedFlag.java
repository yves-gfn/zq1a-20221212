package _01_GrundlegendeBausteine;

public class _012_ShortCircuitEvaluationRedFlag {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		
		while(i < 10 || j++ < 6) {
			System.out.println("i = " + i);
			i++;
			System.out.println("j = " + j);
		}
	}
}
