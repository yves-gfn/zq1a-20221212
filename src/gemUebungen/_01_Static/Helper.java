package gemUebungen._01_Static;

public class Helper {
	
	public static boolean isNumeric(String s) {
		//Blank or null string?
		if(s == null || s.isBlank()) return false;
		
		//Check if digit is not number
		for(int i = 0; i < s.length(); i++) {
			if(!Character.isDigit((int)s.charAt(i))) {
				return false;
			}
		}
		
		//String is not null, not empty, no whitespace and only digits
		return true;
	}

}
