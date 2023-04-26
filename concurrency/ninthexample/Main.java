package ninthexample;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> task = () -> {
            System.out.println("Custom task started thread=" + getThreadInfo());
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Do something");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("method shutdownNow() was execute");
                    break;
                }
            }
            System.out.println("Custom task finished thread=" + getThreadInfo());
            return "Hello world!";
        };

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Future<String> future = executorService.submit(task);

        Thread.sleep(3_000);
        executorService.shutdownNow();

        System.out.println("Main thread finished " + getThreadInfo());
    }

    private static String getThreadInfo() {
        Thread thread = Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

        return "Thread {id" + id + " name " + name + "}";
    }
}