public class DefaultMessageProvider implements MessageProvider {
    private String message;

    public void setMessage(String message) {
        System.out.println("Setter called message=" + message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}