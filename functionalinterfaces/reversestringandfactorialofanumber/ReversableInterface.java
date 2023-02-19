package functionalinterfaces.reversestringandfactorialofanumber;

@FunctionalInterface
public interface ReversableInterface<T> {
    T reverse(T t);
}