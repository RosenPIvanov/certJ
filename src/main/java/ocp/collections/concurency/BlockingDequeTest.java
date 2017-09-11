package ocp.collections.concurency;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * Created by dia on 9.9.2017 г..
 */
public class BlockingDequeTest {
    public void addAndPrintItems(BlockingDeque<Integer> deque) throws InterruptedException {
         deque.offer(103);
         deque.offerFirst(20, 1, TimeUnit.SECONDS);//InterruptedException

         deque.offerLast(85, 7, TimeUnit.HOURS);//InterruptedException
         System.out.print(deque.pollFirst(200, TimeUnit.NANOSECONDS));//InterruptedException
         System.out.print(" "+deque.pollLast(1, TimeUnit.MINUTES));//InterruptedException
         }
}
