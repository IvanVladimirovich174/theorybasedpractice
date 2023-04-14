package secondexample;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();

        myThread.start();
        Thread.sleep(2000);

        myThread.interrupt();
    }

    private static String getThreadInfo() {
        Thread thread = Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

        return "Thread {id" + id + " name " + name + "}";
    }
}