package ocp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by dia on 18.9.2017 г..
 */
public class CollectorsTest
{

    public static void main(String[] args) {

        List<String> names = Arrays.asList("greg", "dave", "don", "ed", "fred");
        //Counting => Long!!!!!!!!!!!!!!!!!!
        Map<Integer, Long> data = names.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.counting()
                )
        );
        System.out.println(data.values());
        //Collectors.summingInt()
        //Collectors.summingLong()
        //Collectors.summingDouble()



    }


}
