package hello;

import java.util.Comparator;
import java.util.List;

public class TestUtil {

	public static boolean stringListInSequence(List<String> list, Comparator<String> comparator) {

		if (list.size() < 2) {
			return true;
		}

		String prev = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			String curr = list.get(i);

			System.err.println("Comparing prev[" + prev + "] with curr [" + curr + "] gives a comparator result "
					+ comparator.compare(prev, curr));

			if (comparator.compare(prev, curr) > 0) {
				return false;
			} else {
				prev = curr;
			}
		}

		return true;
	}
}
