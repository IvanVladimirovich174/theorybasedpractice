package messageprovider;

public class JsonMessageRenderer implements MessageRenderer {
    @Override
    public void render(String message) {
        String json = String.format("{\"message\": \"%s\"}", message);
        System.out.println(json);
    }
}