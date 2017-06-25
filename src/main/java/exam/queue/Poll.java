package exam.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by dia on 25.6.2017 г..
 */
public class Poll {

    public static  void main(String [] args) {
        Queue<String> products = new ArrayDeque<String>();
        products.add("p1");
        products.add("p2");
        products.add("p3");
        System.out.print(products.peek());
        System.out.print(products.poll());
        System.out.println("");
        products.forEach(s -> System.out.print(s));

    }
}
