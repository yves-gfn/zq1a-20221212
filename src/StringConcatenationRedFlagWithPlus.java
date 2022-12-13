
public class StringConcatenationRedFlagWithPlus {

	public static void main(String[] args) {
		String str1 = "Hallo";
		String str2 = " World";
		
		//String Konkatenation nur mit Strings = KEIN PROBLEM
		System.out.println(str1 + str2);
		
		//Problem "kann" enstehen, wenn die normale Addition in einer Konkatenation (String-Verkettung) vorkommt
		//Wenn "Additions-Operator" vor der Verkettung auftritt wird "normal" wie erwartet erst addiert, sobald ein 
		//String verketten werden soll, wird alles darauf folgend als String-Verkettungsoperator interpretiert 
		//zu sehen an Zeile 15 und 17.
		System.out.println(5 + 10 + str1 + str2);
		
		System.out.println(str1 + str2 + 5 + 10);
		
		//Mit Klammern kann die Auswertunsgreihenfolge wie in der Mathematik beeinflusst werden
		System.out.println(str1 + str2 + (5 + 10) + 5 + 10);
		
		System.out.println(5 + 10 + (str1 + str2) + 5 + 10); //weiteres Beispiel... 
	}

}
