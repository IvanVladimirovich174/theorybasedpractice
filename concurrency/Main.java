public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Task thread= " + getThreadInfo());
        };

        System.out.println("Main thread= " + getThreadInfo());
    }

    private static String getThreadInfo() {
        Thread thread = Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

        return "Thread {id" + id + " name " + name + "}";
    }
}