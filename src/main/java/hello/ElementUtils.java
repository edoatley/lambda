package hello;

public class ElementUtils<T> {
	
	public static <T> T betterElement(T e1, T e2, BestEntityAnalyser<T> analyser) {
		return  analyser.betterEntity(e1, e2);
	}
}
