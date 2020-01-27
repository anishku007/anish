package demo.demoTest.stock;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test5 {
	
	public static int  m1() {
		for(int i=0;i<5;i++) {
			System.out.println("child thread...");
		}
		return 10;
	}

	public static int simpleArraySum(int[] ar) {
		/*
		 * Write your code here.
		 */

return  12;
	}

	public static void main(String[] args) {
		Runnable r= ()->m1();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("main thread...");
		}
		Runnable runnable=()->{
			System.out.println("runnable thread...");
		};
		Thread thread =new Thread(runnable);
		thread.start();
		// TODO Auto-generated method stub
		BiFunction<Integer,Integer,Integer> biFunction=(a,b)-> {
			return a + b;
		};
		System.out.println("addition of two no.."+biFunction.apply(10,20));
		Consumer<Integer> consumer=(a)-> {
			System.out.println(a);
		};
		consumer.accept(10);
		Predicate predicate=(a)->{
			return true;
		};
		predicate.test(10);
	}

}
