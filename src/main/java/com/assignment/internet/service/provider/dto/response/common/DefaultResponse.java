package com.assignment.internet.service.provider.dto.response.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;

import java.util.List;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public record DefaultResponse(String traceId,
                              String code,
                              String description,
                              Message message,
                              List<Error> errors) {
}
