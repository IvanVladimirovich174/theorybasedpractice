package messageprovider;

import org.springframework.beans.factory.annotation.Autowired;

public class XmlMessageRenderer implements MessageRenderer{
    private MessageProvider messageProvider;
    @Override
    @Autowired
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }
    @Override
    public void render() {
        String xml = String.format("<renderer>%s</renderer>", messageProvider.getMessage());
        System.out.println(xml);
    }
}