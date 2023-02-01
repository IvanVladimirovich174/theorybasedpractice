package messageprovider;

public class XmlMessageRenderer implements MessageRenderer {
    @Override
    public void render(String message) {
        String xml = String.format("<renderer>%s</renderer>", message);
        System.out.println(xml);
    }
}