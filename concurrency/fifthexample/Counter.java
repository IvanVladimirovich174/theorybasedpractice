package fifthexample;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger digit = new AtomicInteger();

    public int getDigit() {
        return digit.get();
    }

    public void increment() {
        digit.incrementAndGet();
    }

    @Override
    public String toString() {
        return "Counter{" +
                "digit=" + digit +
                '}';
    }
}