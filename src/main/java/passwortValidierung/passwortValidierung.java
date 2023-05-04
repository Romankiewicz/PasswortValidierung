package passwortValidierung;

public class PasswortValidierung {

	public static boolean hasMoreThanSevenCharacters(String password) {
		return password.length() >= 8;
	}


	public static boolean containsNumbers(String password) {
		return password.matches(".*[0-9].*");
	}

	public static void main(String[] args) {
		
	}


	public static boolean containsLetters(String password) {
		return password.matches(".*[a-z][A-Z].*");
	}


	public static boolean containsStandard(String password) {
		return password.matches("(Passwort)|(123456)|(qwertz)");
	}
	
	
}
