package seventhexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("In task thread=" + getThreadInfo());
        };

        System.out.println("Main thread finished" + getThreadInfo());

        ExecutorService executorService = Executors.newFixedThreadPool(4);
    }

    private static String getThreadInfo() {
        Thread thread = Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

        return "Thread {id" + id + " name " + name + "}";
    }
}