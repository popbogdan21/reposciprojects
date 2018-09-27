import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains all the test GenericBinaryTreeUtilsClass
 */
class GenericBinaryTreeUtilsTest {

    /**
     * Test using integer for ascending sorting with duplicate values
     */
    @org.junit.jupiter.api.Test
    void getSortedTreeAscendingWithInteger() {
        GenericBinaryTree<Integer> t1 = new GenericBinaryTree<Integer>();
        t1.addNode(5, t1.getRoot());
        t1.addNode(4, t1.getRoot());
        t1.addNode(2, t1.getRoot());
        t1.addNode(11, t1.getRoot());
        t1.addNode(14, t1.getRoot());
        t1.addNode(6, t1.getRoot());
        t1.addNode(8, t1.getRoot());
        t1.addNode(8, t1.getRoot());
        t1.addNode(17, t1.getRoot());
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(5);
        expectedList.add(6);
        expectedList.add(8);
        expectedList.add(8);
        expectedList.add(11);
        expectedList.add(14);
        expectedList.add(17);
        GenericBinaryTreeUtils u1 = new GenericBinaryTreeUtils();
        Assertions.assertEquals(expectedList, u1.getSortedTreeAscending(t1, t1.getRoot()));
    }

    /**
     * Test using integer for descending sorting with duplicate values
     */
    @org.junit.jupiter.api.Test
    void getSortedTreeDescendingWithInteger() {
        GenericBinaryTree<Integer> t2 = new GenericBinaryTree<Integer>();
        t2.addNode(5, t2.getRoot());
        t2.addNode(4, t2.getRoot());
        t2.addNode(7, t2.getRoot());
        t2.addNode(2, t2.getRoot());
        t2.addNode(11, t2.getRoot());
        t2.addNode(14, t2.getRoot());
        t2.addNode(6, t2.getRoot());
        t2.addNode(8, t2.getRoot());
        t2.addNode(8, t2.getRoot());
        t2.addNode(17, t2.getRoot());
        List<Integer> expectedList1 = new ArrayList<>();
        expectedList1.add(17);
        expectedList1.add(14);
        expectedList1.add(11);
        expectedList1.add(8);
        expectedList1.add(8);
        expectedList1.add(7);
        expectedList1.add(6);
        expectedList1.add(5);
        expectedList1.add(4);
        expectedList1.add(2);
        GenericBinaryTreeUtils u2 = new GenericBinaryTreeUtils();
        Assertions.assertEquals(expectedList1, u2.getSortedTreeDescending(t2, t2.getRoot()));
    }

    /**
     * Test using Strings for ascending sorting without duplicate values
     */
    @org.junit.jupiter.api.Test
    void getSortedTreeAscendingWithStrings() {
        GenericBinaryTree<String> t2 = new GenericBinaryTree<String>();
        t2.addNode("a", t2.getRoot());
        t2.addNode("b", t2.getRoot());
        t2.addNode("e", t2.getRoot());
        t2.addNode("c", t2.getRoot());
        t2.addNode("d", t2.getRoot());
        List<String> expectedList2 = new ArrayList<>();
        expectedList2.add("a");
        expectedList2.add("b");
        expectedList2.add("c");
        expectedList2.add("d");
        expectedList2.add("e");
        GenericBinaryTreeUtils t4 = new GenericBinaryTreeUtils();
        Assertions.assertEquals(expectedList2, t4.getSortedTreeAscending(t2, t2.getRoot()));
    }

    /**
     * Test using Strings for descending sorting without duplicate values
     */
    void getSortedTreeDescendingWithStrings() {
        GenericBinaryTree<String> t3 = new GenericBinaryTree<String>();
        t3.addNode("a", t3.getRoot());
        t3.addNode("b", t3.getRoot());
        t3.addNode("e", t3.getRoot());
        t3.addNode("c", t3.getRoot());
        t3.addNode("d", t3.getRoot());
        List<String> expectedList3 = new ArrayList<>();
        expectedList3.add("e");
        expectedList3.add("d");
        expectedList3.add("c");
        expectedList3.add("b");
        expectedList3.add("a");
        GenericBinaryTreeUtils t5 = new GenericBinaryTreeUtils();
        Assertions.assertEquals(expectedList3, t5.getSortedTreeAscending(t3, t3.getRoot()));
    }

    /**
     * Test using ExampleClass objects for ascending sorting without duplicate values
     */
    @org.junit.jupiter.api.Test
    void getSortedTreeAscendingWithComparableObjects() {
        GenericBinaryTreeUtils u5 = new GenericBinaryTreeUtils();
        GenericBinaryTree<ExampleClass> t7 = new GenericBinaryTree<ExampleClass>();
        t7.addNode(new ExampleClass("Apple", 1), t7.getRoot());
        t7.addNode(new ExampleClass("Cherry", 3), t7.getRoot());
        t7.addNode(new ExampleClass("Elderberry", 5), t7.getRoot());
        t7.addNode(new ExampleClass("Banana", 2), t7.getRoot());
        t7.addNode(new ExampleClass("Dewberries", 4), t7.getRoot());
        List<ExampleClass> expectedList4 = new ArrayList<>();
        expectedList4.add(new ExampleClass("Apple", 1));
        expectedList4.add(new ExampleClass("Banana", 2));
        expectedList4.add(new ExampleClass("Cherry", 3));
        expectedList4.add(new ExampleClass("Dewberries", 4));
        expectedList4.add(new ExampleClass("Elderberry", 5));
        Assertions.assertEquals(expectedList4, u5.getSortedTreeAscending(t7, t7.getRoot()));
    }

    /**
     * Test using ExampleClass objects for descending sorting without duplicate values
     */
    void getSortedTreeDescendingWithComparableObjects() {
        GenericBinaryTreeUtils u7 = new GenericBinaryTreeUtils();
        GenericBinaryTree<ExampleClass> t9 = new GenericBinaryTree<ExampleClass>();
        t9.addNode(new ExampleClass("Apple", 1), t9.getRoot());
        t9.addNode(new ExampleClass("Cherry", 3), t9.getRoot());
        t9.addNode(new ExampleClass("Elderberry", 5), t9.getRoot());
        t9.addNode(new ExampleClass("Banana", 2), t9.getRoot());
        t9.addNode(new ExampleClass("Dewberries", 4), t9.getRoot());
        List<ExampleClass> expectedList5 = new ArrayList<>();
        expectedList5.add(new ExampleClass("Elderberry", 5));
        expectedList5.add(new ExampleClass("Dewberries", 4));
        expectedList5.add(new ExampleClass("Cherry", 3));
        expectedList5.add(new ExampleClass("Banana", 2));
        expectedList5.add(new ExampleClass("Apple", 1));
        Assertions.assertEquals(expectedList5, u7.getSortedTreeDescending(t9, t9.getRoot()));
    }
}