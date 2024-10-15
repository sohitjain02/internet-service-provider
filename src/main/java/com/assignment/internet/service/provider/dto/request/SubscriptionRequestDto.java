package com.assignment.internet.service.provider.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubscriptionRequestDto {

    @NotNull
    private Long userId;

    @NotNull
    @NotEmpty
    private String product;
}
