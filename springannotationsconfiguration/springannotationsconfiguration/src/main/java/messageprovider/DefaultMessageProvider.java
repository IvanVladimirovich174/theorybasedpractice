package messageprovider;

import org.springframework.beans.factory.annotation.Value;

public class DefaultMessageProvider implements MessageProvider {
    private String message;

    @Value("${provider.default_text}")
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}