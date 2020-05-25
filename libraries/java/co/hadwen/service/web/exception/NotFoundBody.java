package co.hadwen.service.web.exception;

import lombok.Value;

@Value
public class NotFoundBody {
    private final String resourceType;
    private final String id;
}
