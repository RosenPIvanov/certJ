package exam;

import java.util.concurrent.Callable;


public class CallableTest {
}

class CallerThread1 implements Callable<String> {
    public String call() throws Exception { return "thread";}
}



