package binary_tree;

public class BinaryTree<T extends Comparable<T>> {
    private BinaryNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(T content) {
        BinaryNode<T> newNode = new BinaryNode<>(content);
        root = insert(root, newNode);
    }

    private BinaryNode<T> insert(BinaryNode<T> actual, BinaryNode<T> newNode) {
        if (actual == null) {
            return newNode;
        } else if (newNode.getContent().compareTo(actual.getContent()) < 0) {
            actual.setLeftNode((insert(actual.getLeftNode(), newNode)));
        } else {
            actual.setRigthNode(insert(actual.getRigthNode(), newNode));
        }
        return actual;
    }

    public void showInOrder() {
        System.out.println("n Showing InOrder");
        showInOrder(this.root);
    }

    private void showInOrder(BinaryNode<T> actual) {
        if (actual != null) {
            showInOrder(actual.getLeftNode());
            System.out.print(actual.getContent() + ", ");
            showInOrder(actual.getRigthNode());
        }
    }

    public void showPostOrder() {
        System.out.println("n Showing PostOrder");
        showPostOrder(this.root);
    }

    private void showPostOrder(BinaryNode<T> actual) {
        if (actual != null) {
            showPostOrder(actual.getLeftNode());
            showPostOrder(actual.getRigthNode());
            System.out.print(actual.getContent() + ", ");
        }
    }

    public void showPreOrder() {
        System.out.println("\n Showing PreOrder");
        showPreOrder(this.root);
    }

    private void showPreOrder(BinaryNode<T> actual) {
        if (actual != null) {
            System.out.print(actual.getContent() + ", ");
            showPreOrder(actual.getLeftNode());
            showPreOrder(actual.getRigthNode());
        }
    }

    public void remove(T content) {
        try {
            BinaryNode<T> actual = this.root;
            BinaryNode<T> father = null;
            BinaryNode<T> son = null;
            BinaryNode<T> temp = null;
            while (actual != null && !actual.getContent().equals(content)) {
                father = son;
                if (content.compareTo(actual.getContent()) < 0) {
                    actual = actual.getLeftNode();
                } else {
                    actual = actual.getRigthNode();
                }
            }

            if (actual == null) {
                System.out.println("Content not found!\nTry Block");
            }
            if (father == null) {
                if (actual.getRigthNode() == null) {
                    this.root = actual.getLeftNode();
                } else if (actual.getLeftNode() == null) {
                    this.root = actual.getRigthNode();
                } else {
                    for (temp = actual, son = actual.getLeftNode(); son.getRigthNode() != null; temp = son, son = son
                            .getLeftNode()) {
                        if (son != actual.getLeftNode()) {
                            temp.setRigthNode(son.getLeftNode());
                            son.setLeftNode(root.getLeftNode());
                        }
                    }
                    son.setRigthNode(root.getRigthNode());
                    root = son;
                }
            } else if (actual.getRigthNode() == null) {
                if (father.getLeftNode() == actual) {
                    father.setLeftNode(actual.getLeftNode());
                } else {
                    father.setRigthNode(actual.getLeftNode());
                }
            } else {
                for (temp = actual, son = actual.getLeftNode(); son.getRigthNode() != null; temp = son, son = son
                        .getRigthNode()) {
                    son.setRigthNode(actual.getRigthNode());
                    if (father.getLeftNode() == actual) {
                        father.setLeftNode(son);
                    } else {
                        father.setRigthNode(son);
                    }
                }
            }
        } catch (NullPointerException erro) {
            System.out.print("Content not found!\nCatch Block");

        }
    }

}
