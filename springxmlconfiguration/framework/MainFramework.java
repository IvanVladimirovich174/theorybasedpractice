package framework;

import messageprovider.MessageProvider;
import messageprovider.MessageRenderer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MainFramework {
    private final MessageProvider messageProvider;
    private final MessageRenderer messageRenderer;

    public MainFramework() {
        Properties properties = new Properties();

        try (FileInputStream fileInputStream = new FileInputStream("config.properties")) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read properties error=" + e.toString(), e);
        }

        try {
            String renderedClass = properties.getProperty("render.class");
            String messageProviderClass = properties.getProperty("provider.class");

            messageProvider = (MessageProvider) Class.forName(messageProviderClass).newInstance();
            messageRenderer = (MessageRenderer) Class.forName(renderedClass).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Failed to init framework error=" + e, e);
        }
    }

    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
    public MessageRenderer getMessageRenderer() {
        return messageRenderer;
    }
}