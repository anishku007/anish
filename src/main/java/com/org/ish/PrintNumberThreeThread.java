package com.org.ish;

public class PrintNumberThreeThread {
    static int count = 1;
    int MAX = 10;
    int reminder;

    /*public PrintNumberThreeThread(int reminder) {
        this.reminder = reminder;
    }*/

    // static Object lock=new Object();
    public void printByThread1() {
        synchronized (this) {
            while (count < MAX) {
                while (!(MAX % 3 == 1)) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("t1" + "" + count);
                count++;
                notifyAll();
            }
        }

    }

    public void printByThread2() {
        synchronized (this) {
            while (count < MAX) {
                while (!(MAX % 3 == 2)) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("t2" + "" + count);
                count++;
                notifyAll();
            }
        }

    }

    public void printByThread3() {
        synchronized (this) {
            while (count < MAX) {
                while (!(MAX % 3 == 0)) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("t3" + "" + count);
                count++;
                notifyAll();
            }
        }

    }

    public static void main(String[] arg) {
        PrintNumberThreeThread pnt = new PrintNumberThreeThread();
       /* Runnable runnable=()->{
            pnt.printByThread1();
            pnt.printByThread2();
            pnt.printByThread3();
        };*/

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                pnt.printByThread1();

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                pnt.printByThread2();

            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                pnt.printByThread3();

            }
        });
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
