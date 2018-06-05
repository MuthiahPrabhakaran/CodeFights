package codefights.arcade.intro.thejourneybegins.thecenturyfromyear;

public class Code {

	int centuryFromYear(int year) {

	    int century = 0;
	    century = year/100 + (year%100>0?1:0);
	    return century;
	}

}
