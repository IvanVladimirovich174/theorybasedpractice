public class Main {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

        System.out.println("Thread {id" + id + " name " + name + "}");
    }
}