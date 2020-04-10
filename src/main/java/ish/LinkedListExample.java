package ish;

public class LinkedListExample {
    Node head;

    static class Node {
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

    public void addToLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
            newNode.next = null;
        }
    }
    public void addAtMiddle(int data){
        Node newNode=new Node(data);
        Node fast=null;
        Node slow=null;
        while (head.next==null);
        slow=head.next;
        fast=head.next.next;
        if(fast.next==null){
            slow.next=newNode;
            newNode.next=slow.next.next;
        }

    }

    public static void reverseLinkedList(LinkedListExample linkedList) {
        Node prev = null;
        Node current = linkedList.head;
        Node next;
        while (current!= null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        linkedList.head = prev;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] arg) {
        LinkedListExample node = new LinkedListExample();
       /* node.addInFront(1);
        node.addInFront(2);
        node.addInFront(3);*/
        //node.addToLast(4);
        //node.addToLast(5);
        node.head = new Node(1);
        node.head.next = new Node(2);
        node.head.next.next = new Node(3);
        node.head.next.next.next = new Node(4);
        // node.printList();
        reverseLinkedList(node);
        node.printList();

    }
}
