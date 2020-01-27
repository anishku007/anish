package demo.demoTest.stock;

import java.util.function.Function;

public class Test4 {

	public static void main(String args[]) {

		Function<Integer, Function<Integer, Integer>> curryAdder = u -> v -> u + v;

		Function<Integer, Function<Integer, Integer>> curryAdder1 = new Function<Integer, Function<Integer, Integer>>() {
			public Function<Integer, Integer> apply(Integer a) {
				return new Function<Integer, Integer>() {
					public Integer apply(final Integer b) {
						return a + b;
					}
				};
			};
		};

		System.out.println("Add 2, 3 :" + curryAdder.apply(2).apply(3));
		System.out.println("Add 5, 3 :" + curryAdder1.apply(5).apply(3));
	}
}
