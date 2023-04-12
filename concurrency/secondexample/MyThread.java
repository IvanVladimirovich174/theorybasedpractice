package secondexample;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread started thread=" + getThreadInfo());
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread finished thread=" + getThreadInfo());
    }

    private static String getThreadInfo() {
        Thread thread = Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

        return "Thread {id" + id + " name " + name + "}";
    }
}