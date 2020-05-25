package co.hadwen.exception;

import lombok.NonNull;
import lombok.Value;

import java.util.Collections;
import java.util.List;

/**
 * Body describing why an exception was thrown
 */
@Value
public class ValidationExceptionBody {
    private final List<ValidationFailure> failures;

    public ValidationExceptionBody(@NonNull String resourceName, @NonNull ValidationExceptionReason reason) {
        this.failures = Collections.singletonList(new ValidationFailure(resourceName, reason));
    }
}
