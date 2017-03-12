package hello;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void thatBestStringContainsMostVowels() {
		String best = StringUtils.betterString("Donkey", "Swamp", (s1, s2) -> StringUtils.countVowels(s1) > StringUtils.countVowels(s2) ? s1 : s2);
		assertThat(best, equalTo("Donkey"));
	}
	
	@Test
	public void thatBestStringIstheLongest() {
		String best = StringUtils.betterString("Small String", "Very Big String", (s1, s2) -> s1.length() > s2.length() ? s1 : s2);
		assertThat(best, equalTo("Very Big String"));
	}
}
