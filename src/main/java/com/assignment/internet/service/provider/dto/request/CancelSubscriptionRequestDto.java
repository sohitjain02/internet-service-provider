package com.assignment.internet.service.provider.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CancelSubscriptionRequestDto {

    @NotNull
    private Long userId;

    @NotNull
    private Long productId;
}
