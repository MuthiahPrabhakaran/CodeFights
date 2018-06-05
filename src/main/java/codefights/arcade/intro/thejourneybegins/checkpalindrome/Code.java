package codefights.arcade.intro.thejourneybegins.checkpalindrome;

public class Code {
	boolean checkPalindrome(String inputString) {
	    StringBuffer reversedString = new StringBuffer(inputString);
	    reversedString = reversedString.reverse();
	    return (inputString.equals(reversedString.toString()))?true:false;
	    
	}

}
