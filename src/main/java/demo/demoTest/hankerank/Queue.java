package demo.demoTest.hankerank;

import java.util.Stack;

/*implementation of Queue using Stack*/
public class Queue {
    private static Stack<Integer> s1 = new Stack<>();
    private static Stack<Integer> s2 = new Stack<>();

    public static void enQueue(int x) {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
    }

    public static int deQueue() {
        if (s1.empty()) {
            System.out.println("queue is empity");
        }
        ;
        int x = s1.peek();
        s1.pop();
        return x;
    }

    public static void main(String[] arg) {
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());

    }
}
