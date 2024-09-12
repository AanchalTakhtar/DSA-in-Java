package BinarySearchTree;

public class Main
{
    public static void main(String[] args) {

        BinarysearchTree mybst= new BinarysearchTree();

        mybst.insert(47);
        mybst.insert(21);
        mybst.insert(76);
        mybst.insert(18);
        mybst.insert(52);
        mybst.insert(82);


        System.out.println(mybst.contains(21));
        System.out.println(mybst.contains(17));

        System.out.println("\nBST contains 27: ");
        System.out.println(mybst.rContains(27));

        System.out.println("\nBST contains 17: ");
        System.out.println(mybst.rContains(17));

    }
}
