package tree;


import java.util.ArrayDeque;
import java.util.Queue;

// elementele din stanga mereu mai mici decat radacina, care este mai mica
// decat cele din dreapta
public class BinarySearchTree {

    Node root;

    private static class Node {
        Integer e;
        Node right;
        Node left;
    }


    public void add(Integer e){
        if (root==null){
            root = new Node();
            root.e = e;
            return;
        }

        Node current = root;

        while (true) {
            if (e > current.e) {
                if (current.right != null) {
                    current = current.right;
                } else {
                    current.right = new Node();
                    current.right.e = e;
                    return;
                }
            } else {
                if (current.left != null) {
                    current = current.left;
                } else {
                    current.left = new Node();
                    current.left.e = e;
                    return;
                }
            }
        }
    }


    public void printBFS() {
        Queue<Node> binarySearchQueue = new ArrayDeque<>();

        Node current = root;

        while (current!=null) {
            System.out.println(current.e);

            if (current.left!=null) {
                binarySearchQueue.add(current.left);
            }
            if (current.right!=null) {
                binarySearchQueue.add(current.right);
            }

            current = binarySearchQueue.poll();
        }
    }



    public void printDFS(){
        printDFSRec(root);
    }

    private void printDFSRec(Node n){
        if (n == null){
            return;
        }
        printDFSRec(n.left);
        System.out.println(n.e);
        printDFSRec(n.right);
    }

    public void printPerimetru(){
        periLeft(root);
        periFrunza(root);
        periRight(root);
    }

    private void periLeft(Node n){
        if (n==null){
            return;
        }
        System.out.println(n.e);
        periLeft(n.left);

    }

    private void periRight(Node n){
        if (n==null){
            return;
        }
        periRight(n.right);
        System.out.println(n.e);
    }

    private void periFrunza(Node n){
        goDFSRec(n);
    }

    private void goDFSRec(Node n){
        if (n == null){
            return;
        }
        if (n.left==null && n.right==null){
            System.out.println(n.e);
        }
        goDFSRec(n.left);
        goDFSRec(n.right);
    }

}
