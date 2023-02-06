package messageprovider;

import framework.MainFramework;

public class Main {
    public static void main(String[] args) {
        MainFramework mainFramework = new MainFramework();

        MessageProvider messageProvider = mainFramework.getMessageProvider();
        String message = messageProvider.getMessage();

        MessageRenderer messageRenderer = mainFramework.getMessageRenderer();
        messageRenderer.render(message);
    }
}