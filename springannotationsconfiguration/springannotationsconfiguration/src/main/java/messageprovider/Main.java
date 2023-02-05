package messageprovider;

public class Main {
    public static void main(String[] args) {
        MessageProvider argumentsMessageProvider = new DefaultMessageProvider();
        MessageRenderer messageRenderer = new JsonMessageRenderer();

        String message = argumentsMessageProvider.getMessage();
        messageRenderer.render(message);
    }
}