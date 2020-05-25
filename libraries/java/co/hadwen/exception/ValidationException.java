package co.hadwen.exception;

import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value
public class ValidationException extends Exception {
    ValidationExceptionBody body;
}
