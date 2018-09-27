public class Main {
    /**
     * @param args Main method used to initialise and print objects of GenericTreeType or GenericBinaryTreeUtils
     *             and to print their results
     */
    public static void main(String[] args) {

        //Integer
        GenericBinaryTree<Integer> t1 = new GenericBinaryTree<Integer>();
        t1.addNode(5, t1.getRoot());
        t1.addNode(4, t1.getRoot());
        t1.addNode(7, t1.getRoot());
        t1.addNode(2, t1.getRoot());
        t1.addNode(11, t1.getRoot());
        t1.addNode(14, t1.getRoot());
        t1.addNode(6, t1.getRoot());
        t1.addNode(8, t1.getRoot());
        t1.addNode(17, t1.getRoot());
        GenericBinaryTreeUtils t3 = new GenericBinaryTreeUtils();
        System.out.println(t3.getSortedTreeAscending(t1, t1.getRoot()));
        System.out.println(t3.getSortedTreeDescending(t1, t1.getRoot()));

        //String
        GenericBinaryTree<String> t2 = new GenericBinaryTree<String>();
        t2.addNode("a", t2.getRoot());
        t2.addNode("b", t2.getRoot());
        t2.addNode("e", t2.getRoot());
        t2.addNode("c", t2.getRoot());
        t2.addNode("d", t2.getRoot());
        t2.addNode("h", t2.getRoot());
        t2.addNode("f", t2.getRoot());
        t2.addNode("g", t2.getRoot());
        GenericBinaryTreeUtils t4 = new GenericBinaryTreeUtils();
        System.out.println(t4.getSortedTreeAscending(t2, t2.getRoot()));
        System.out.println(t4.getSortedTreeDescending(t2, t2.getRoot()));

        //Custom Class implementing comparable
        GenericBinaryTreeUtils t6 = new GenericBinaryTreeUtils();
        GenericBinaryTree<ExampleClass> t5 = new GenericBinaryTree<ExampleClass>();
        t5.addNode(new ExampleClass("One", 1), t5.getRoot());
        t5.addNode(new ExampleClass("Three", 3), t5.getRoot());
        t5.addNode(new ExampleClass("Five", 5), t5.getRoot());
        t5.addNode(new ExampleClass("Two", 2), t5.getRoot());
        t5.addNode(new ExampleClass("Four", 4), t5.getRoot());
        System.out.println(t6.getSortedTreeAscending(t5, t5.getRoot()));
        System.out.println(t6.getSortedTreeDescending(t5, t5.getRoot()));
    }
}
