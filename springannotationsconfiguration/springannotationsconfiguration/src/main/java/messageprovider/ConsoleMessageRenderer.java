package messageprovider;

import org.springframework.beans.factory.annotation.Autowired;

public class ConsoleMessageRenderer implements MessageRenderer{
    private MessageProvider messageProvider;
    @Override
    @Autowired
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }
    @Override
    public void render() {
        System.out.println(messageProvider.getMessage());
    }
}