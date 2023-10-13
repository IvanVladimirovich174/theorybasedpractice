public interface A {
    default void printSomeMessage(String s) {
        System.out.println(s);
    }
}