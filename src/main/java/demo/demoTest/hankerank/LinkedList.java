package demo.demoTest.hankerank;

public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addInFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addAtLast(int data) {
        Node newNode = new Node(data);
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.next = null;
    }

    public void printList(Node head) {
        if (head == null) {
            System.out.println("Empty list");
        }
        while (head != null) {
            System.out.print(" " + head.data);
            head = head.next;
        }
    }

    public static void main(String[] arg) {
        LinkedList list = new LinkedList();
        list.addInFront(10);
        list.addAtLast(20);
        list.addAtLast(30);
        list.addAtLast(40);
        list.printList(list.head);
    }
}
