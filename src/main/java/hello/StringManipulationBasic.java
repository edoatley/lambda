package hello;

import java.util.Collections;
import java.util.List;

public class StringManipulationBasic implements StringManipulation {

	// quite rubbish solutions
	public List<String> sortAlphabetically(List<String> listOfStrings) {
		Collections.sort(listOfStrings, (e1, e2) -> e1.compareTo(e2));
		return listOfStrings;
	}
	public List<String> sortByLength(List<String> listOfStrings) {
		Collections.sort(listOfStrings, (e1, e2) -> e1.length() - e2.length());
		return listOfStrings;
	}
	public List<String> sortAlphabeticallyByFirstChar(List<String> listOfStrings) {
		Collections.sort(listOfStrings, (e1, e2) -> Character.valueOf(e1.charAt(0)).compareTo(Character.valueOf(e2.charAt(0))));
		return listOfStrings;
	}
	public List<String> sortEsFirst(List<String> listOfStrings) {
		Collections.sort(listOfStrings, (e1, e2) -> e1.contains("e") ? (e2.contains("e") ? 0 : -1) : 1);
		return listOfStrings;
	}
	
}
