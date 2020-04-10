package org.arc.aie;

public class BinaryTree {
    Node root;

    static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    int maxDepth(Node node){
        if(node==null)
            return 0;
        else
        {
            int lDepth=maxDepth(node.left);
            int rDepth=maxDepth(node.right);
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    public static void main(String[] arg) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root=new Node(3);
        binaryTree.root.left=new Node(4);
        binaryTree.root.right=new Node(5);
        binaryTree.root.left.left=new Node(6);
        binaryTree.root.left.right=new Node(7);
        System.out.println("Max Depth "+binaryTree.maxDepth(binaryTree.root));
    }
}
