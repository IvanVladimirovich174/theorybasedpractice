public class Main {
    public static void main(String[] args) {
        ArgumentsMessageProvider messageProvider = new ArgumentsMessageProvider(args);
        String message = messageProvider.getMessage();
        System.out.println(message);
    }
}