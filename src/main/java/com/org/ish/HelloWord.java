package com.org.ish;

import java.util.function.BiFunction;

public class HelloWord {

    public static void main(String[] arg){
        BiFunction<Integer,Integer,Integer> add=( a,b)->a+b;
        HelloWord helloWord=new HelloWord();
        Runnable myRunnable= helloWord::run;
        Thread t=new Thread(myRunnable);
        t.start();
        Thread myThread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(""+add.apply(10,20));

            }
        });myThread.start();
    }

    private  void run() {
        for (int i = 0; i < 5; i++) System.out.println("" + i);
        ;
    }
}
