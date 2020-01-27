package demo.demoTest.stock;

import java.util.function.Function;

public class Test6 {
	public static void main(String[] args) {
	Function<Integer, Function<Integer, Function<Integer, Integer>>> curryAdder1 = u -> v ->f-> u +v+f;

	Function<Integer, Function<Integer,Function<Integer,Integer>>> curryAdder2=new Function<Integer,Function<Integer,Function<Integer,Integer>>>(){
		public  Function<Integer,Function<Integer,Integer>> apply(Integer t1){
			return new Function<Integer,Function<Integer,Integer>>(){
				public Function<Integer,Integer> apply(Integer t2){
					return new Function<Integer,Integer>(){
						@Override
						public Integer apply(Integer t3) {
							// TODO Auto-generated method stub
							return t1+t2+t3;
						}
						
					};
				}
				
			};
		}
		
	};
	System.out.println("Add 2, 3 ,5:" + curryAdder1.apply(2).apply(3).apply(5));
	System.out.println("Add 2, 3 ,5:" + curryAdder2.apply(5).apply(5).apply(5));
	}
}
