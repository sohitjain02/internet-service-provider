package com.assignment.internet.service.provider.dto.response.common;

import lombok.Builder;

@Builder
public record Message(String title, String text) {
}
