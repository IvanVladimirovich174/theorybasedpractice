package messageprovider;

import messageprovider.DefaultMessageProvider;
import messageprovider.JsonMessageRenderer;

public class Main {
    public static void main(String[] args) {
        MessageProvider messageProvider = new DefaultMessageProvider();
        MessageRenderer renderer = new JsonMessageRenderer();
        String message = messageProvider.getMessage();

        renderer.render(message);
    }
}