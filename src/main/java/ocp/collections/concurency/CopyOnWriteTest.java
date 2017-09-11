package ocp.collections.concurency;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by dia on 9.9.2017 г..
 */
public class CopyOnWriteTest {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3);
        List<Integer> l2 = new CopyOnWriteArrayList<>(l1);
        Set<Integer> s3 = new ConcurrentSkipListSet<>();
        s3.addAll(l1);
        for(Integer item: l2) {
            System.out.println(item);
            l2.add(4); // x1
        }
        for(Integer item: s3) {
            System.out.println(item);
            s3.add(5); // x2
        }
        System.out.println(l1.size()+" "+l2.size()+" "+s3.size());
    }
}
