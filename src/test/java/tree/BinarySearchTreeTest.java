package tree;


import org.junit.Test;

// elementele din stanga mereu mai mici decat radacina, care este mai mica
// decat cele din dreapta
public class BinarySearchTreeTest {

   @Test
   public void binarySearchTreeTestAddAndPrint() {

       BinarySearchTree binarySearchTree = new BinarySearchTree();

       binarySearchTree.add(8);
       binarySearchTree.add(12);
       binarySearchTree.add(1);
       binarySearchTree.add(15);
       binarySearchTree.add(5);
       binarySearchTree.add(2);
       binarySearchTree.add(7);

       binarySearchTree.printDFS();
   }


    @Test
    public void binarySearchTreePerimetruPrint() {

        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.add(8);
        binarySearchTree.add(12);
        binarySearchTree.add(1);
        binarySearchTree.add(15);
        binarySearchTree.add(5);
        binarySearchTree.add(2);
        binarySearchTree.add(7);

        binarySearchTree.printPerimetru();
    }

    @Test
    public void binarySearchTreeBFSPrint() {

        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.add(8);
        binarySearchTree.add(12);
        binarySearchTree.add(1);
        binarySearchTree.add(15);
        binarySearchTree.add(5);
        binarySearchTree.add(2);
        binarySearchTree.add(7);

        binarySearchTree.printBFS();
    }

}
