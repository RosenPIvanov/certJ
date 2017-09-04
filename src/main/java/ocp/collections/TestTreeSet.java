package ocp.collections;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by dia on 1.7.2017 г..
 */
class TestTreeSet {
    public static void main(String args[]) {
        ceil();
        TreeSet<StringBuilder> treeSetNames = new TreeSet<StringBuilder>();
        treeSetNames.add(new StringBuilder("Shreya"));
        treeSetNames.add(new StringBuilder("Harry"));
        treeSetNames.add(new StringBuilder("Paul"));
        treeSetNames.add(new StringBuilder("Shreya"));
        Iterator it = treeSetNames.descendingIterator();
        while (it.hasNext())
            System.out.print(it.next() + ":");

    }
    static void ceil(){
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("one");
        tree.add("One");
        tree.add("ONE");
        System.out.println(tree.ceiling("On"));
        System.out.println(tree.floor("On"));

    }
}
