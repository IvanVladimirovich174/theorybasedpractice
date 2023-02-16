package functionalinterfaces.getpi;

public class Main {
    public static void main(String[] args) {
        GetPiValue piValue = () -> Math.PI;
        System.out.println(piValue.getPiValue());
    }
}