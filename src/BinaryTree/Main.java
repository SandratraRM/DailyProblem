package BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree myTree = new BinaryTree(4);
        myTree.add(1);
        myTree.add(2);
        myTree.add(3);
        myTree.add(0);
        myTree.add(6);
        myTree.add(5);

        String serialized = BinaryTree.serialize(myTree.getRoot());

        Node deserialized = BinaryTree.deserialize(serialized);


        System.out.println(serialized);
        System.out.println(BinaryTree.serialize(deserialized));

    }
}
