package fourthexample;

public class Main {
    public static void main(String[] args) {
        MyThread th = new MyThread();

        th.start();

        System.out.println("Main thread finished thread=" + getThreadInfo());
    }

    private static String getThreadInfo() {
        Thread thread = Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

        return "Thread {id" + id + " name " + name + "}";
    }
}