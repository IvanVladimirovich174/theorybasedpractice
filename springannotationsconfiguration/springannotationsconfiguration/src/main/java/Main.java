public class Main {
    public static void main(String[] args) {
        ArgumentsMessageProvider argumentsMessageProvider = new ArgumentsMessageProvider(args);

        String message = argumentsMessageProvider.getMessage();
        System.out.println(message);
    }
}