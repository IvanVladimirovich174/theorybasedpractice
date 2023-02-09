package messageprovider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("messageprovider");

        MessageRenderer renderer1 = (MessageRenderer) context.getBean("messageRenderer");
        MessageRenderer renderer2 = (MessageRenderer) context.getBean("messageRenderer");
        System.out.println("Are same: " + (renderer1 == renderer2));

        renderer1.render();
        renderer2.render();
    }
}