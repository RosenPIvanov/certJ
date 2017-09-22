package ocp.collections;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by dia on 1.7.2017 г..
 */
class TestTreeSet {
    public static void main(String args[]) {

        subsetInsertOutsideRange();
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

    static void ceil() {
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("one");
        tree.add("One");
        tree.add("ONE");
        System.out.println(tree.ceiling("On"));//Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
        System.out.println(tree.floor("On"));

    }

    public static void subsetInsertOutsideRange() {
       try {
        TreeSet<Integer> s = new TreeSet<Integer>();
        TreeSet<Integer> subs = new TreeSet<Integer>();
        for (int i = 324; i <= 328; i++) {
            s.add(i);
        }
        subs = (TreeSet) s.subSet(326, true, 328, true);
        subs.add(329);
        System.out.println(s + " " + subs);}
        catch (Exception e) {
           e.printStackTrace();
        }
    }
}
