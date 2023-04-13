package secondexample;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();

        System.out.println("Thread state: " + myThread.getState());

        myThread.start();
        myThread.join();

        System.out.println("Thread state: " + myThread.getState());
    }

    private static String getThreadInfo() {
        Thread thread = Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

        return "Thread {id" + id + " name " + name + "}";
    }
}