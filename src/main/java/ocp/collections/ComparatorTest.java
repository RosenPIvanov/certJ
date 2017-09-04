package ocp.collections;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by dia on 2.9.2017 г..
 */
public class ComparatorTest implements Comparator<String>  {

        public int compare(String a, String b) {
            return b.toLowerCase().compareTo(a.toLowerCase());
                    //preserves the order of equal elements
            }
        public static void main(String[] args) {
            String[] values = { "123", "Abb", "aab" };
            Arrays.sort(values, new ComparatorTest());
            for (String s: values)
                System.out.print(s + " ");
        }
    }

