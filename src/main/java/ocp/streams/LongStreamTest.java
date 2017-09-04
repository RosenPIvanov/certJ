package ocp.streams;

import java.util.OptionalLong;
import java.util.stream.LongStream;

/**
 * Created by dia on 3.9.2017 г..
 */
public class LongStreamTest {
    public static void main(String args[]) {
        long a = 1;
    LongStream ls = LongStream.of(1, 2, 3);
    OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();
        if (opt.isPresent()) System.out.println(opt.getAsLong());
}}
