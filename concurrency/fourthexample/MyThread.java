package fourthexample;

public class MyThread extends Thread {
    Object monitor;

    public MyThread(Object monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        System.out.println("Mythread started thread=" + getThreadInfo());

        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
        }

        System.out.println("Mythread finished thread=" + getThreadInfo());
        synchronized (monitor) {
            monitor.notify();
        }
    }

    private static String getThreadInfo() {
        Thread thread = Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

        return "Thread {id" + id + " name " + name + "}";
    }
}