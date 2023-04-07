import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) throws Exception {
        Runnable task1 = () -> {
            System.out.println("Task1 thread= " + getThreadInfo());
        };

        task1.run();

        System.out.println("Main thread= " + getThreadInfo());

        Callable<String> task2 = () -> {
            System.out.println("Task2 thread= " + getThreadInfo());
            return "Hello world";
        };

        String task2Result = task2.call();
        System.out.println("Main thread= " + getThreadInfo() + " taskResult" + task2Result);
    }

    private static String getThreadInfo() {
        Thread thread = Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

        return "Thread {id" + id + " name " + name + "}";
    }
}