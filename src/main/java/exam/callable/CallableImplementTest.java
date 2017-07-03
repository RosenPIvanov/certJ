package exam.callable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableImplementTest {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        Job job = new Job();
        Callable<File> job2 = new Job2();
        Callable job3 = new Job3();
        pool.submit(job);
        pool.submit(job2);
        pool.submit(job3);
    }
    }

class Job implements Callable<String> {
    public String call() {
        return "Success";
    }
}

class Job2 implements Callable<File> {
    public File call() throws FileNotFoundException {
        return new File("abcd");
    }
}

class Job3 implements Callable<Void> {
    public Void call() {return null;}
}