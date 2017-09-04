package ocp.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by dia on 4.9.2017 г..
 */
public class MapToObj {
    public static void main(String args[]) {
    List<Integer> l = IntStream.range(1, 6)
            .mapToObj(i -> i).collect(Collectors.toList());
l.forEach(System.out::println);}

}
