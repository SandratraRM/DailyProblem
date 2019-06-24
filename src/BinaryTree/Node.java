package BinaryTree;

public class Node {
    private int value;
    private Node left;
    private Node right;

    Node(int value) {
        setValue(value);
        setLeft(null);
        setRight(null);
    }

    int getValue() {
        return value;
    }

    private void setValue(int value) {
        this.value = value;
    }

    Node getLeft() {
        return left;
    }

    void setLeft(Node left) {
        this.left = left;
    }

    Node getRight() {
        return right;
    }

    void setRight(Node right) {
        this.right = right;
    }

    @Override
    public boolean equals(Object obj) {
        boolean res = true;
        if (obj instanceof Node) {
            Node subject = (Node) obj;
            res = res && this.value == subject.value;
            if (this.getLeft() != null && subject.getLeft() != null)
                res = res && this.getLeft().equals(subject.getLeft());
            else if (!(this.getLeft() == null && subject.getLeft() == null)){
                res = false;
            }
            if (this.getRight() != null && subject.getRight() != null)
                res = res && this.getRight().equals(subject.getRight());
            else if (!(this.getRight() == null && subject.getRight() == null)){
                res = false;
            }

        } else {
            res = false;
        }
        return res;
    }
}

