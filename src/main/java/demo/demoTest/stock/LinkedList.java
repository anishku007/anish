package demo.demoTest.stock;

import demo.demoTest.emp.Employee;

public class LinkedList<E> {
    Node head;

    class Node {
        Node next;
        int data;

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
        if (head == null) {
            head = new Node(data);
            return;
        }
        newNode.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
            last.next = newNode;
            return;
        }
    }

    public Node reverseLinkedList(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current.next != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;

    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList<Employee> linkedList = new LinkedList<Employee>();
        /*linkedList.addInFront(10);
        linkedList.addInFront(20);
        linkedList.addInFront(30);*/
        linkedList.addInFront(40);
        linkedList.head=linkedList.reverseLinkedList(linkedList.head);
        linkedList.printList(linkedList.head);
    }
}
