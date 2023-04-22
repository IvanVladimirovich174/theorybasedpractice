package sixthexample;

public class Counter {
    private int digit = 0;

    public int getDigit() {
        return digit;
    }

    public void increment() {
        digit = digit + 1;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "digit=" + digit +
                '}';
    }
}