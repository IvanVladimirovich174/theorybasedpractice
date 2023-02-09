package messageprovider.config;

import messageprovider.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:application.properties")
public class MyConfig {
    /* Value("${provider.default.args}")
    private String[] arguments;

    @Bean
    public MessageProvider argumentsMessageProvider() {
        return new ArgumentsMessageProvider(arguments);
    }*/

    @Bean
    public MessageProvider defaultMessageProvider() {
        return new DefaultMessageProvider();
    }

    @Bean
    @Scope("prototype")
    public MessageRenderer messageRenderer() {
        return new JsonMessageRenderer();
    }
}