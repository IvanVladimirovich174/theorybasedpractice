package messageprovider;

public class XmlMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public void render() {
        String xml = String.format("<renderer>%s</renderer>", messageProvider.getMessage());
        System.out.println(xml);
    }
}