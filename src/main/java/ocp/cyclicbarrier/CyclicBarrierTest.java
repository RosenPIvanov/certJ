package ocp.cyclicbarrier;

import java.util.Collections;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

/**
 * Created by dia on 8.9.2017 г..
 */
public class CyclicBarrierTest {
    public static void await(CyclicBarrier cb) { // j1
        try { cb.await(); } catch (InterruptedException |
                BrokenBarrierException e) {

            // Handle exception
        }
    }
    public static void main(String[] args) {
        //hands on number of processors +1
        CyclicBarrier cb = new CyclicBarrier(10,
                () -> System.out.println("Stock Room Full!")); // j2
        IntStream.iterate(1, i -> 1).limit(9)//hangs with .limit(10)
                .parallel()
                .forEach(i -> await(cb)); // j3
    }
}
