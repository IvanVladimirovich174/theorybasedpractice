package messageprovider;

public class JsonMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public void render() {
        String json = String.format("{\"message\": \"%s\"}", messageProvider.getMessage());
        System.out.println(json);
    }
}