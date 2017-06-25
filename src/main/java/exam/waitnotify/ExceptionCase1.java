package exam.waitnotify;

public class ExceptionCase1 {
    public static void main(String[] args) {
        try {
            new ExceptionCase1().go();
        } catch (Exception e) {
            //we have IllegalMonitorStateException
            System.out.println("thrown to main");
        }
    }
    synchronized void go() throws InterruptedException {
        Thread t1 = new Thread();
        t1.start();
        System.out.print("1 ");
        t1.wait(5000);
        System.out.print("2 ");
    }
}