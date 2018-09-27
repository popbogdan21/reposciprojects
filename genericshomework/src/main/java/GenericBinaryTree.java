import java.util.ArrayList;
import java.util.List;

/**
 * @param <T> The generic type used by the class
 *            Creates a binary tree
 *            Contains inner class Node used to define the features of  a node element in the binary tree
 *            Unique method that adds a element to the tree
 */
public class GenericBinaryTree<T extends Comparable> {
    List<T> elements = new ArrayList<T>();
    List<T> elements1 = new ArrayList<T>();
    private Node root;
    private Node left;
    private Node right;

    /**
     * @param value1      represents the Element that will be added
     * @param currentRoot represents the root of the three
     *                    Method is recursive
     *                    Any member(new node) should be added by using the syntax addNode(<T></>, TreeNode.getRoot())
     *                    The second parameter could have been avoided by using a private method for the recursive
     *                    algorithm and a public method that requires as a parameter the value that is going to be added
     */
    public void addNode(T value1, Node currentRoot) {
        Node pointer;
        pointer = currentRoot;
        if (pointer != null) {
            if ((pointer.leftchild != null) && (pointer.value.compareTo(value1) >= 0)) {
                addNode(value1, pointer.leftchild);
            } else {
                if ((pointer.leftchild == null) && (pointer.value.compareTo(value1) >= 0)) {
                    Node n2 = new Node(pointer, value1);
                    pointer.leftchild = n2;
                    n2.top = pointer;
                    return;
                }
            }
            if ((pointer.righchild != null) && (pointer.value.compareTo(value1) < 0)) {
                addNode(value1, pointer.righchild);
            } else {
                if ((pointer.righchild == null) && (pointer.value.compareTo(value1) < 0)) {
                    Node n1 = new Node(pointer, value1);
                    pointer.righchild = n1;
                    n1.top = pointer;
                    return;
                }
            }
        } else {
            pointer = new Node(pointer, value1);
            pointer.top = root;
            root = pointer;
            return;
        }
    }

    /**
     * @return The root of the Binary Tree
     */
    public Node getRoot() {
        return root;
    }


    /**
     * Inner class that is used to define a Node type object
     *
     * @param <T>The object that will be added
     *               Class is public in order to be accessed by the the GenericBinaryTreeUtils
     */
    public class Node<T extends Comparable> {
        private Node top;
        private Node righchild;
        private Node leftchild;
        private T value;

        /**
         * @param top   Represents the upper node to which the new node will be linked
         * @param value Represents the value that will be added
         */
        public Node(Node top, T value) {
            this.top = top;
            this.value = value;
        }

        /**
         * @return The top of the current node
         */
        public Node getTop() {
            return top;
        }

        /**
         * @return The right child of the current node
         */
        public Node getRighchild() {
            return righchild;
        }

        /**
         * @return The right child of the current node
         */
        public Node getLeftchild() {
            return leftchild;
        }

        /**
         * @return The <T></> type object that is assigned as the value of the node
         */
        public T getValue() {
            return value;
        }
    }
}
