import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beans.xml");

        DefaultMessageProvider defaultMessageProvider1 = (DefaultMessageProvider) applicationContext.getBean("defaultMessageProvider");
        DefaultMessageProvider defaultMessageProvider2 = applicationContext.getBean(DefaultMessageProvider.class);

        System.out.println("Are same? " + (defaultMessageProvider1 == defaultMessageProvider2));

        System.out.println(defaultMessageProvider1.getMessage());
        System.out.println(defaultMessageProvider2.getMessage());
    }
}