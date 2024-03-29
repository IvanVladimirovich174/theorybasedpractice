import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beans.xml");
        MessageRenderer messageRenderer = applicationContext.getBean(MessageRenderer.class);

        messageRenderer.render();
    }
}