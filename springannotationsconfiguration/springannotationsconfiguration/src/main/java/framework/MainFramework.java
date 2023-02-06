package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MainFramework {

    public MainFramework() {
        Properties properties = new Properties();

        try (FileInputStream fileInputStream = new FileInputStream("config.properties")) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read properties error= " + e.toString(), e);
        }

        String renderClass = properties.getProperty("render.class");
        String messageProviderClass = properties.getProperty("provider.class");
    }
}