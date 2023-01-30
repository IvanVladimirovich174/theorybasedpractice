public class ArgumentsMessageProvider {
    private final String message;

    public ArgumentsMessageProvider(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException("Can't find string in args!");
        }

        message = args[0];
    }

    public String getMessage() {
        return message;
    }
}
