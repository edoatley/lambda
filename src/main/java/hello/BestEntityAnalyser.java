package hello;

@FunctionalInterface
public interface BestEntityAnalyser<T> {
	T betterEntity(T e1, T e2);
}
