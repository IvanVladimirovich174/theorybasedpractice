package messageprovider;

import framework.MainFramework;

public class Main {
    public static void main(String[] args) {
        MainFramework mainFramework = new MainFramework();
        MessageRenderer messageRenderer = mainFramework.getMessageRenderer();

        messageRenderer.render();
    }
}