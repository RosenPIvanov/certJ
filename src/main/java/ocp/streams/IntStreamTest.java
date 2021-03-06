package ocp.streams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by dia on 3.9.2017 г..
 */
public class IntStreamTest { public static void main(String args[]) {
    IntStream is = IntStream.empty();
    IntStream.of(1,2);// no List arg
    is.average(); //returns the type int.
     is.average();// returns the type OptionalInt.
    is.findAny(); //returns the type int.
    is.findAny();// returns the type OptionalInt.
    is.sum() ;//returns the type int.
    is.sum() ;//returns the type OptionalInt

    double d = Stream.of(1,2,3).collect(Collectors.averagingInt(x->x));
}
}
