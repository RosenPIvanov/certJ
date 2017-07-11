package ocp;

import java.util.concurrent.Callable;


public class CallableTest {
}

class CallerThread1 implements Callable<String> {
    public String call() throws Exception {{
        System.out.println(1);
    } return "thread";
        }
}



