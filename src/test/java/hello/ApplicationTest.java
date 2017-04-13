package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTest {

	@Autowired
	private CommandLineRunner clr;

	@Rule
	public OutputCapture outputCapture = new OutputCapture();

	@Test
	public void thatCommandLineRunnerDoesStuff() throws Exception {
		String expected = "It worked!";

		this.clr.run();
		String actual = this.outputCapture.toString();

		assertThat(actual, containsString(expected));
	}
}
