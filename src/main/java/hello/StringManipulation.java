package hello;

import java.util.List;

public interface StringManipulation {

	public List<String> sortAlphabetically(List<String> strings);
	
	public List<String> sortByLength(List<String> strings);
	
	public List<String> sortAlphabeticallyByFirstChar(List<String> strings);

	public List<String> sortEsFirst(List<String> strings);
}
