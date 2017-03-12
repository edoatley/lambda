package hello;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class StringManipulationsBasicTest {

	private StringManipulation manipulator;
	
	@Before
	public void setUp() {
		manipulator = new StringManipulationBasic();
	}
	
	private String[] templateArray = {    "Apple"
										, "Mango"
										, "Orange"
										, "Banana"
										, "Grape"
										, "Strawberry"
										, "Melon"
										, "Raspberry"
										, "Kiwi"
										, "Blueberry"
									 };
	@Test
	public void testSortAlphabetically() {
		List<String> strings = Arrays.asList(templateArray);
		
		List<String> result = manipulator.sortAlphabetically(strings);
		
		assertTrue(TestUtil.stringListInSequence(result
											  , (e1, e2) -> e1.compareTo(e2)));
	}
	
	@Test
	public void testSortByLength() {
		List<String> strings = Arrays.asList(templateArray);
		
		List<String> result = manipulator.sortByLength(strings);

		assertTrue(TestUtil.stringListInSequence(result
											  , (e1, e2) -> e1.length() - e2.length()));
		
	}
	
	@Test
	public void testSortAlphabeticallyByFirstChar() {
		List<String> strings = Arrays.asList(templateArray);
		
		List<String> result = manipulator.sortAlphabeticallyByFirstChar(strings);
		
		assertTrue(TestUtil.stringListInSequence(result
				  							  , (e1, e2) -> e1.charAt(0) - e2.charAt(0)));
	}
	
	@Test
	public void testSortEsFirst() {
		List<String> strings = Arrays.asList(templateArray);
		
		List<String> result = manipulator.sortEsFirst(strings);
		
		System.err.println(result.toString());
		assertTrue(TestUtil.stringListInSequence(result
				  							   , (e1, e2) -> e1.contains("e") == e2.contains("e") ? 0 : ((e1.contains("e") ?  -1 : 1))));
	}
	
	
}
