package ocp.exceptions;

/**
 * Created by xworks.admin on 03/07/2017.
 */
public class OverrrideCheckedExcTest {
    enum Color {VIOLET, INDIGO, BLUE, GREEN, YELLOW, ORANGE, RED}
     class Rainbow extends Thread {
        public void run() /* 1. cannot compile throws InterruptedException*/ {
            for (Color color : Color.values()) {
                try {//resolution needs to be added
                    Thread.sleep(1000);
                } catch (InterruptedException e) {//needs to be added
                    e.printStackTrace();
                }
                System.out.println(color);
            }
        }
    }
}
