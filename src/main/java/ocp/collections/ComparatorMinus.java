package ocp.collections;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by dia on 20.9.2017 г..
 */
public class ComparatorMinus implements Comparator {
    static String[] sa = { "d", "bbb", "aaaa" };
    public int compare(Object o1, Object o2) {
        int s1 = ((String) o1).length();
        int s2 = ((String) o2).length();
        return         s1 - s2;
    }

    public static void main(String[] args) {
        Arrays.sort(sa, new ComparatorMinus());
        System.out.println(sa[0]);
        System.out.println(Arrays.binarySearch(sa, "c", new ComparatorMinus()));
        System.out.println(Arrays.binarySearch(sa, "cc", new ComparatorMinus()));
    }
}
