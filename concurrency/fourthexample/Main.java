package fourthexample;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object monitor = new Object();

        System.out.println("Main thread started thread=" + getThreadInfo());
        MyThread th = new MyThread(monitor);

        th.start();
        synchronized (monitor) {
            monitor.wait();
        }

        System.out.println("Main thread finished thread=" + getThreadInfo());
    }

    private static String getThreadInfo() {
        Thread thread = Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

        return "Thread {id" + id + " name " + name + "}";
    }
}