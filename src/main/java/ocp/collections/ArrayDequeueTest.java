package ocp.collections;


import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueTest {
    public static void main(String args[]) {
        ArrayDeque<String> greetings = new ArrayDeque<String>();
        //Since we call push() rather than offer(), we are treating the ArrayDeque as a LIFO
        greetings.push("hello");
        greetings.push("hi");
        greetings.push("ola");
        System.out.println(greetings);
        greetings.pop();
        greetings.peek();
        while (greetings.peek() != null)
            System.out.println(greetings.pop());

        fifo();

        test2();
    }

    static void test2(){
        System.out.println("test2");



        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.push(2);
        d.pop();
        d.offerFirst(3);
        d.remove();
        System.out.println(d);

    }
    static void fifo(){
        System.out.println();
        ArrayDeque<String> greetings = new ArrayDeque<String>();
        greetings.offer("hello");
        greetings.push("hi");
        greetings.offer("ola");
        System.out.println(greetings);

       // greetings.poll();
        greetings.pop();
        while (greetings.peek() != null)
            System.out.println(greetings.pop());
    }
}
