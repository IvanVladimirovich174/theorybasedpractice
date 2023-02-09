package messageprovider.config;

import messageprovider.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public MessageProvider messageProvider() {
        return new DefaultMessageProvider();
    }

    @Bean
    public MessageRenderer messageRenderer() {
        return new JsonMessageRenderer();
    }
}