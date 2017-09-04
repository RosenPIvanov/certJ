package ocp.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by dia on 3.9.2017 г..
 */
public class StreamJoining {
    public static void main(String args[]) {
        System.out.print(
                Stream.iterate(1, x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.
                        joining()));
    }
}
