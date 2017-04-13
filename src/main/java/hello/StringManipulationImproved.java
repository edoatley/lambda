package hello;

import java.util.List;
import java.util.stream.Collectors;

public class StringManipulationImproved implements StringManipulation {

	public List<String> sortAlphabetically(List<String> listOfStrings) {
		return listOfStrings.stream().sorted((e1, e2) -> e1.compareTo(e2)).collect(Collectors.toList());
	}

	public List<String> sortByLength(List<String> listOfStrings) {
		return listOfStrings.stream().sorted((e1, e2) -> e1.length() - e2.length()).collect(Collectors.toList());
	}

	public List<String> sortAlphabeticallyByFirstChar(List<String> listOfStrings) {
		return listOfStrings.stream().sorted((e1, e2) -> e1.charAt(0) - e2.charAt(0)).collect(Collectors.toList());
	}

	public List<String> sortEsFirst(List<String> listOfStrings) {
		return listOfStrings.stream()
				.sorted((e1, e2) -> e1.contains("e") == e2.contains("e") ? 0 : ((e1.contains("e") ? -1 : 1)))
				.collect(Collectors.toList());

	}

}
