package ocp.streams;

import java.util.stream.Stream;

/**
 * Created by dia on 3.9.2017 г..
 */
public class StreamCreate {
    public static void main(String args[]) {
        Stream<String> stream = Stream.iterate("z", (s) -> s + "1");
        stream.limit(10).peek(System.out::println).count();
        Stream.generate(() -> "growl! ").limit(5).peek(System.out::println).count();
    }
}
