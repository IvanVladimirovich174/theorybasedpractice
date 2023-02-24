package functionalinterfaces.squarenumber;

public class Main {
    public static void main(String[] args) {
        Square s = (int x) -> x * x;

        int result = s.calculate(5);
        System.out.println(result);
    }
}