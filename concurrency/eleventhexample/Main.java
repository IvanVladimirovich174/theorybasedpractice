package eleventhexample;

import java.time.LocalTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable task = () -> {
            System.out.println("[" + LocalTime.now() + "]" + " Custom task started thread=" + getThreadInfo());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("[" + LocalTime.now() + "]" + " Custom task finished thread=" + getThreadInfo());
        };

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(4);

        System.out.println("[" + LocalTime.now() + "]" + " Main thread started thread=" + getThreadInfo());
        executorService.scheduleAtFixedRate(task, 3, 10, TimeUnit.SECONDS);
        System.out.println("[" + LocalTime.now() + "]" + " Main thread finished thread=" + getThreadInfo());
    }

    private static String getThreadInfo() {
        Thread thread = Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

        return "Thread {id" + id + " name " + name + "}";
    }
}