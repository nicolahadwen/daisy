package co.hadwen.exception;

/**
 * Exception thrown when an operation is unimplemented
 */
public class UnimplementedException extends UnsupportedOperationException {
    private static final String MESSAGE = "Unimplemented";

    public UnimplementedException() {
        super(MESSAGE);
    }
}
