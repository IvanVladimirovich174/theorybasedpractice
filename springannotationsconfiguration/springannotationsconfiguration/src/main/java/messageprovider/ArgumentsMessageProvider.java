package messageprovider;

public class ArgumentsMessageProvider implements MessageProvider {
    private final String message;

    public ArgumentsMessageProvider(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException("Can't find str in arguments");
        }

        message = args[0];
    }

    @Override
    public String getMessage() {
        return message;
    }
}