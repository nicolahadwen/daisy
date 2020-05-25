package co.hadwen.service.web.exception;

import co.hadwen.exception.ValidationExceptionReason;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;
import lombok.NonNull;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class BadRequestReason {
    @Getter
    @NonNull
    private final List<String> resourcePath;
    @Getter
    @NonNull
    private final ValidationExceptionReason reason;
    private final String suggestion;
    private final String suppliedValue;

    public BadRequestReason(
            @NonNull String resourceName, @NonNull ValidationExceptionReason reason) {
        this.resourcePath = Collections.singletonList(resourceName);
        this.reason = reason;
        this.suggestion = null;
        this.suppliedValue = null;
    }

    @NonNull
    public Optional<String> getSuggestion() {
        return Optional.ofNullable(suggestion);
    }

    @NonNull
    public Optional<String> getSuppliedValue() {
        return Optional.ofNullable(suppliedValue);
    }

    public String toJsonString() {
        Gson gson = new GsonBuilder()
                .serializeNulls()
                .create();
        return gson.toJson(this, this.getClass());
    }
}
