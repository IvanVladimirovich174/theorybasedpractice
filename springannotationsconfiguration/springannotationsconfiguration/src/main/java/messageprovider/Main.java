package messageprovider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("messageprovider");

        MessageProvider provider = (MessageProvider) context.getBean("messageProvider");
        MessageRenderer renderer = (MessageRenderer) context.getBean("messageRenderer");

        renderer.render();
    }
}