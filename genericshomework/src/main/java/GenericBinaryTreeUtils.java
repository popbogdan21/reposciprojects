import java.util.ArrayList;
import java.util.List;

public class GenericBinaryTreeUtils<T extends Comparable> {

    private List<T> elementsSortedAscending = new ArrayList<T>();
    private List<T> elementsSortedDescending = new ArrayList<T>();

    /**
     * Recursive method that traverses the given tree in order to produce an ascending sorted tree
     *
     * @param tree            The tree for which the sorted elements are requested
     * @param receivedPointer Node type element
     * @return an ascending sorted List of Nodes type objects
     */
    public List<T> getSortedTreeAscending(GenericBinaryTree tree, GenericBinaryTree.Node receivedPointer) {
        GenericBinaryTree.Node pointer;
        pointer = receivedPointer;
        if ((pointer.getLeftchild() != null) && (pointer != getMin(tree))) {
            getSortedTreeAscending(tree, pointer.getLeftchild());
        }
        elementsSortedAscending.add((T) pointer.getValue());
        if ((pointer.getRighchild() != null) && (pointer != getMax(tree))) {
            getSortedTreeAscending(tree, pointer.getRighchild());
        }
        return elementsSortedAscending;
    }


    /**
     * Recursive method that traverses the given tree in order to produce an descending sorted tree
     *
     * @param tree            The tree for which the sorted elements are requested
     * @param receivedPointer Node type element representing the pointer from which the traversal is started
     * @return a descending sorted List of Nodes type objects
     */
    public List<T> getSortedTreeDescending(GenericBinaryTree tree, GenericBinaryTree.Node receivedPointer) {
        GenericBinaryTree.Node pointer;
        pointer = receivedPointer;
        if ((pointer.getRighchild() != null) && (pointer != getMax(tree))) {
            getSortedTreeDescending(tree, pointer.getRighchild());
        }
        elementsSortedDescending.add((T) pointer.getValue());
        if ((pointer.getLeftchild() != null) && (pointer != getMin(tree))) {
            getSortedTreeDescending(tree, pointer.getLeftchild());
        }
        return elementsSortedDescending;
    }

    /**
     * The method is private in order to respect encapsulation for the purpose of this exercise but for a better
     * functionality of the Utils class most likely should be public
     *
     * @param tree Represents the binary tree from which the minimum value is extracted
     * @return the node which contains the minimum value
     */
    private GenericBinaryTree.Node getMin(GenericBinaryTree tree) {
        GenericBinaryTree.Node left = tree.getRoot();
        while (left.getLeftchild() != null) {
            left = left.getLeftchild();
        }
        return left;
    }

    /**
     * The method is private in order to respect encapsulation for the purpose of this exercise but for a better
     * functionality of the Utils class most likely should be public
     *
     * @param tree Represents the binary tree from which the maximum value is extracted
     * @return the node which contains the maximum value
     */
    private GenericBinaryTree.Node getMax(GenericBinaryTree tree) {
        GenericBinaryTree.Node right = tree.getRoot();
        while (right.getRighchild() != null) {
            right = right.getRighchild();
        }
        return right;
    }

}
