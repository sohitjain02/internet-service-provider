package com.assignment.internet.service.provider.controller;

import com.assignment.internet.service.provider.constants.AppConstants;
import com.assignment.internet.service.provider.dto.request.CancelSubscriptionRequestDto;
import com.assignment.internet.service.provider.dto.request.SubscriptionRequestDto;
import com.assignment.internet.service.provider.dto.response.common.DefaultResponse;
import com.assignment.internet.service.provider.dto.response.common.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InternetServiceController {

    private static final Logger logger = LoggerFactory.getLogger(InternetServiceController.class);

    @PostMapping("/v1/isp/subscribe")
    public ResponseEntity<DefaultResponse> subscribe(@RequestBody SubscriptionRequestDto subscriptionRequestDto) {
        Message message = Message.builder()
                .title(AppConstants.TITLE)
                .text(AppConstants.API_NOT_IMPLEMENTED_MESSAGE)
                .build();
        DefaultResponse defaultResponse = DefaultResponse.builder().message(message).build();
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(defaultResponse);
    }

    @PostMapping("/v1/isp/cancel")
    public ResponseEntity<DefaultResponse> cancelSubscription(@RequestBody CancelSubscriptionRequestDto cancelSubscriptionRequestDto) {
        Message message = Message.builder()
                .title(AppConstants.TITLE)
                .text(AppConstants.API_NOT_IMPLEMENTED_MESSAGE)
                .build();
        DefaultResponse defaultResponse = DefaultResponse.builder().message(message).build();
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(defaultResponse);
    }
}
