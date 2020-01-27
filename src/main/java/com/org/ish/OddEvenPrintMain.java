package com.org.ish;

public class OddEvenPrintMain {
    int count = 1;
    boolean odd;
    int MAX_NUMBER = 20;

    public void printOdd() {
        synchronized (this) {
            while (count < MAX_NUMBER) {
                System.out.println("Checking odd loop");
                while (!odd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"" +count);
                count++;
                odd=false;
                notify();
            }
        }

    }
    public void printEven() {
        synchronized (this) {
            while (count < MAX_NUMBER) {
                System.out.println("Checking even loop");
                while (odd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"" +count);
                count++;
                odd=true;
                notify();

            }

        }

    }

    public static void main(String[] arg) {
        OddEvenPrintMain oem = new OddEvenPrintMain();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                oem.printOdd();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                oem.printEven();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
