package ocp.exceptions;

/**
 * Created by dia on 6.9.2017 г..
 */
public class AutoClosableTest {
    public static void main(String[] args) {


        try (StuckTurkeyCage t = new StuckTurkeyCage()) {
             System.out.println("put turkeys in");
             throw new RuntimeException("initial");
             }catch ( Exception e){
            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.getSuppressed()[0]);
        }
    }

    static class StuckTurkeyCage implements AutoCloseable {
        public void close() throws Exception {
            throw new Exception("Cage door does not close");
        }
    }
}
