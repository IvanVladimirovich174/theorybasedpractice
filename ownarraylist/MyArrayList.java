import java.util.Arrays;

public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 5;
    private int[] array;
    private int size;
    private int capacity;

    public MyArrayList() {
        this.capacity = DEFAULT_CAPACITY;
        this.size = 0;
        this.array = new int[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.array = new int[capacity];
    }

    public int size() {
        return this.size;
    }

    public int get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public void add(int element) {
        if (this.size >= capacity) {
            capacity *= 2;
            array = Arrays.copyOf(array, capacity);
        }

        array[size] = element;
        ++size;
    }
}