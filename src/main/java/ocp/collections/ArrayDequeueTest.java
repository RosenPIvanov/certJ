package ocp.collections;


import java.util.ArrayDeque;

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
