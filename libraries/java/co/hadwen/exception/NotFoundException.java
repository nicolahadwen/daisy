package co.hadwen.exception;

import lombok.Getter;
import lombok.NonNull;

/**
 * Exception thrown when a resource cannot be found
 */
@Getter
public class NotFoundException extends Exception {
    private static final String MESSAGE_FORMAT = "Resource not found, with type: %s id: %s";
    private final String resourceType;
    private final String id;

    public NotFoundException(@NonNull String resourceType, @NonNull String id) {
        super(createMessage(resourceType, id));
        this.resourceType = resourceType;
        this.id = id;
    }

    public NotFoundException(@NonNull String resourceType, @NonNull String id, @NonNull Throwable cause) {
        super(createMessage(resourceType, id), cause);
        this.resourceType = resourceType;
        this.id = id;
    }

    private static String createMessage(@NonNull String resourceType, @NonNull String id) {
        return String.format(MESSAGE_FORMAT, resourceType, id);
    }
}
