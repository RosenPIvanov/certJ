package ocp.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by dia on 3.9.2017 г..
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(12);
        q.remove(1);
        System.out.print(q);

        List<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(12);
        l.remove(1);
        System.out.print(l);
    }
}
