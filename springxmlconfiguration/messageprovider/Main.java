package messageprovider;

import framework.MainFramework;

public class Main {
    public static void main(String[] args) {
        MainFramework mainFramework = new MainFramework();
        MessageProvider messageProvider = mainFramework.getMessageProvider();
        MessageRenderer messageRenderer = mainFramework.getMessageRenderer();

        String message = messageProvider.getMessage();
        messageRenderer.render(message);
    }
}