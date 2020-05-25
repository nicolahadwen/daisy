package co.hadwen.service.web.exception;

import lombok.Value;

import java.util.List;

@Value
public class BadRequestBody {
    List<BadRequestReason> invalidValues;
}
