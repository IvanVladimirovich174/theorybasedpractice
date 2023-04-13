package secondexample;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread started thread=" + getThreadInfo());
        System.out.println("Thread state: " + Thread.currentThread().getState());
        System.out.println("MyThread finished thread=" + getThreadInfo());
    }

    private static String getThreadInfo() {
        Thread thread = Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

        return "Thread {id" + id + " name " + name + "}";
    }
}