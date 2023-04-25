package seventhexample;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> task = () -> {
            System.out.println("In task thread=" + getThreadInfo());
            return "Hello world!";
        };

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Future<String> future = executorService.submit(task);
        String result = future.get();

        System.out.println("Main thread finished" + getThreadInfo() + " result" + result);
    }

    private static String getThreadInfo() {
        Thread thread = Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

        return "Thread {id" + id + " name " + name + "}";
    }
}