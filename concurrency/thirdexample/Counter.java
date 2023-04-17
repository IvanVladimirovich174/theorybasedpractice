package thirdexample;

public class Counter {
    private int digit = 0;

    public int getDigit() {
        return digit;
    }

    public synchronized void increment() {
        digit = digit + 1;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "digit=" + digit +
                '}';
    }
}