package BinaryTree;

class BinaryTree {
    private Node root;

    BinaryTree(int value){
        setRoot(new Node(value));
    }
    private static StringBuilder serializeRecursion(StringBuilder currentString, Node currentNode){
        if (currentNode != null){
            currentString.append(currentNode.getValue()).append(",");
            currentString = serializeRecursion(currentString,currentNode.getLeft());
            currentString = serializeRecursion(currentString,currentNode.getRight());
        }
        return currentString;
    }
    static String serialize(Node root){
        String serialized = String.valueOf(serializeRecursion(new StringBuilder(),root));
        serialized = serialized.substring(0,serialized.length() - 1);
        return serialized;
    }
    static Node deserialize(String serialized){
        String[] values = serialized.split(",");
        BinaryTree binaryTree = new BinaryTree(Integer.parseInt(values[0]));
        for (int i = 1; i < values.length; i++){
            binaryTree.add(Integer.parseInt(values[i]));
        }
        return binaryTree.getRoot();
    }
    private Node addRecursion(Node node,int value){
        if (node == null){
            return new Node(value);
        }else if(value > node.getValue()) {
            node.setRight(addRecursion(node.getRight(),value));
        }else if (value < node.getValue()){
            node.setLeft(addRecursion(node.getLeft(),value));
        }else {
            return node;
        }
        return node;
    }
    void add(int value){
        setRoot(addRecursion(root,value));
    }
    Node getRoot() {
        return root;
    }

    void setRoot(Node root) {
        this.root = root;
    }
}
