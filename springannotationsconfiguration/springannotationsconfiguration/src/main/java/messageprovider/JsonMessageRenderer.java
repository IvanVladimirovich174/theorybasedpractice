package messageprovider;

import org.springframework.beans.factory.annotation.Autowired;

public class JsonMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;
    @Override
    @Autowired
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public void render() {
        String json = String.format("{\"message\": \"%s\"}", messageProvider.getMessage());
        System.out.println(json);
    }
}