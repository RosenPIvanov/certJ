package ocp.streams;

import java.util.Arrays;

/**
 * Created by dia on 9.9.2017 г..
 */
public class ReduceTest {

    public static void main(String[] args) {
        System.out.println(Arrays.asList("duck", "chicken", "flamingo", "pelican")
                .parallelStream().parallel() // q1
                .reduce(0,
                        (c1, c2) -> c1/*.length()*/ + c2.length(), // BiFunction<U, ? super T, U> accumulator,
                        (s1, s2) -> s1 + s2)); //
    }
}
