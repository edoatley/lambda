package hello;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ElementUtilsTest {

	@Test
	public void thatBestStringContainsMostVowels() {
		String best = ElementUtils.betterElement("Donkey", "Swamp", (s1, s2) -> StringUtils.countVowels(s1) > StringUtils.countVowels(s2) ? s1 : s2);
		assertThat(best, equalTo("Donkey"));
	}

	@Test
	public void thatBestCarIsASkoda() {
		Car best = ElementUtils.betterElement(new Car("Skoda", "Superb")
										    , new Car("Ford", "Ka")
										    , (c1, c2) -> c1.getMake().equals("Skoda") ? c1 : c2);
		assertThat(best.getMake(), equalTo("Skoda"));
	}
}
