package sixthexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> allDigits = Collections.synchronizedList(new ArrayList<>());
        List<Thread> threadList = new ArrayList<>();

        for (int i = 0; i < 10; ++i) {

            Runnable task = () -> {
                System.out.println("Thread started id= " + Thread.currentThread().getId());

                for (int j = 0; j < 1000; ++j) {
                    allDigits.add(j);
                }

                System.out.println("Thread finished id= " + Thread.currentThread().getId());
            };

            threadList.add(new Thread(task));
        }

        for (Thread thread : threadList) {
            thread.start();
        }

        for (Thread thread : threadList) {
            thread.join();
        }

        System.out.println("Size digits= " + allDigits.size());
    }

    private static String getThreadInfo() {
        Thread thread = Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

        return "Thread {id" + id + " name " + name + "}";
    }
}