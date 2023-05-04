import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import passwortValidierung.PasswortValidierung;

class PasswortValidierungTest {

	@Test
	void isLargerThanSevenCharacters_whenStringHasMoreThanSevenCharacters_thenReturnTrue() {
		// given
		String password = "hasMoreThanSeven";
		// when
		boolean result = PasswortValidierung.hasMoreThanSevenCharacters(password);
		// then
		assertTrue(result);
	}
	
	@Test
	void isSmallerThanSevenCharacters_whenStringHasMoreThanSevenCharacters_thenReturnFalse() {
		// given
		String password = "1234";
		// when
		boolean result = PasswortValidierung.hasMoreThanSevenCharacters(password);
		// then
		assertFalse(result);
	}
	@Test 
	void containsNumbers_whenStringContainsNumbers_thenReturnTrue() {
		//given
		String password = "haveMin1NumberInIt";
		//when
		boolean result = PasswortValidierung.containsNumbers(password);
		//then
		assertTrue(result);
	}
	
	@Test 
	void containsNoNumbers_whenStringContainsNoNumbers_thenReturnFalse() {
		//given
		String password = "haveNoNumberInIt";
		//when
		boolean result = PasswortValidierung.containsNumbers(password);
		//then
		assertFalse(result);
	}
	
	@Test
	void containsUpperAndLowerCaseLetters_whenStringContainsUpperAndLowerCaseLetters_thenReturnTrue() {
		//given
		String password = "12&HelloWorld";
		//when
		boolean result = PasswortValidierung.containsLetters(password);
		//then
		assertTrue(result);
	}
	
	@Test
	void containsNoUpperAndLowerCaseLetters_whenStringContainsNoUpperAndLowerCaseLetters_thenReturnFalse() {
		//given
		String password = "12&helloworld";
		//when
		boolean result = PasswortValidierung.containsLetters(password);
		//then
		assertFalse(result);
	}
	
	@Test
	void notAStandardPassword_whenStringContainsAStandardPassword_thenReturnTrue() {
		//given
		String password = "Passwort";
		//when
		boolean result = PasswortValidierung.containsStandard(password);
		//then
		assertTrue(result);
	}
	
	@Test
	void notAStandardPassword_whenStringContainsNoStandardPassword_thenReturnFalse() {
		//given
		String password = "specialpasswordThatN0on3Ev3rFind0u74nditisf4RawayfromA5tandardPassw0rd";
		//when
		boolean result = PasswortValidierung.containsStandard(password);
		//then
		assertFalse(result);
	}
}
