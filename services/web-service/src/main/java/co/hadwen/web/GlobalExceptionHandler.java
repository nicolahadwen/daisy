package co.hadwen.web;

import co.hadwen.exception.NotFoundException;
import co.hadwen.exception.ValidationException;
import co.hadwen.service.web.exception.BadRequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler({ ValidationException.class })
    ResponseEntity<BadRequestBody> validationError(ValidationException e) {
        System.err.println(e.getMessage());
        return ResponseEntity.badRequest().body(e.getBody());
    }

    @ExceptionHandler({ NotFoundException.class })
    ResponseEntity<BadRequestBody> notFound(NotFoundException e) {
        System.err.println(e.getMessage());
        return ResponseEntity.notFound().build();
    }
}
