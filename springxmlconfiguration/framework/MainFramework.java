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
            throw new RuntimeException(e);
        }

        String renderedClass = properties.getProperty("render.class");
        String messageProviderClass = properties.getProperty("provider.class");

        messageProvider = Class.forName(messageProviderClass);
        messageRenderer = Class.forName(renderedClass);
    }
}