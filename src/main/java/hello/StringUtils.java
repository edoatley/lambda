package hello;

public class StringUtils {
	
	public static String betterString(String s1, String s2, BestStringAnalyser analyser) {
		return analyser.betterString(s1, s2);
	}
	
	public static int countVowels(String s) {
		if(s == null || s.length() == 0) {
			return 0;
		}
		else {
			return (int) s.chars().filter((c) -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u').count();
		}
	}
}
