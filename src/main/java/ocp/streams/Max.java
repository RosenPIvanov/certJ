package ocp.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by dia on 17.9.2017 г..
 */
public class Max {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(3, 4, 6, 9, 2, 5, 7);
        System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b)); //1
        System.out.println("reduce with Integer::max" + ls.stream().reduce(Integer.MIN_VALUE, Integer::max)); //1

        System.out.println("Integer::max"+ ls.stream().max(Integer::max).get()); //2 wrong
        System.out.println(ls.stream().max(Integer::compare).get()); //3
        System.out.println(ls.stream().max((a, b) -> a > b ? a : b)); //4
         int max = ls.stream().max(Comparator.comparing(a->a)).get();
         System.out.println(max); //1
    }
}
