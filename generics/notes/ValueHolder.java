package generics.notes;

public class ValueHolder <T extends Comparable<T>> {
    private T value;

    public ValueHolder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public int compare (T other) {
        return this.value.compareTo(other);
    }

    @Override
    public String toString() {
        return "ValueHolder{" +
                "value=" + value +
                '}';
    }
}
