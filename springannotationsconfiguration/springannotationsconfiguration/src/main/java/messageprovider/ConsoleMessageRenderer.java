package messageprovider;

public class ConsoleMessageRenderer implements MessageRenderer{
    @Override
    public void render(String message) {
        System.out.println(message);
    }
}