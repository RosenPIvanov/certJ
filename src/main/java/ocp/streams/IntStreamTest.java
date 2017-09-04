package ocp.streams;

import java.util.stream.IntStream;

/**
 * Created by dia on 3.9.2017 г..
 */
public class IntStreamTest { public static void main(String args[]) {
    IntStream is = IntStream.empty();
    is.average(); //returns the type int.
     is.average();// returns the type OptionalInt.
    is.findAny(); //returns the type int.
    is.findAny();// returns the type OptionalInt.
    is.sum() ;//returns the type int.
    is.sum() ;//returns the type OptionalInt
}
}
