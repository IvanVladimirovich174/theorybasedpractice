package messageprovider.config;

import messageprovider.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class MyConfig {
    @Value("${provider.default.args}")
    private String[] arguments;

    @Bean
    public MessageProvider messageProvider() {
        return new ArgumentsMessageProvider(arguments);
    }

    @Bean
    public MessageRenderer messageRenderer() {
        return new JsonMessageRenderer();
    }
}