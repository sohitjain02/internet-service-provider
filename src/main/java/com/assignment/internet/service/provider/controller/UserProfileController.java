package com.assignment.internet.service.provider.controller;

import com.assignment.internet.service.provider.constants.AppConstants;
import com.assignment.internet.service.provider.dto.response.common.DefaultResponse;
import com.assignment.internet.service.provider.dto.response.common.Message;
import com.assignment.internet.service.provider.service.UserProfileService;
import com.assignment.internet.service.provider.validator.MultipartFileValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class UserProfileController {

    private static final Logger logger = LoggerFactory.getLogger(UserProfileController.class);

    private final MultipartFileValidator multipartFileValidator;
    private final UserProfileService userProfileService;

    public UserProfileController(MultipartFileValidator multipartFileValidator, UserProfileService userProfileService) {
        this.multipartFileValidator = multipartFileValidator;
        this.userProfileService = userProfileService;
    }

    @PutMapping("/v1/isp/profile/picture/{userId}")
    public ResponseEntity<DefaultResponse> updateProfilePicture(@PathVariable Long userId,
                                                                @RequestParam MultipartFile image) {
        logger.info("Request received to update profile picture for user: " + userId);
        multipartFileValidator.validateProfileImage(image);
        userProfileService.updateProfilePicture(userId, image);
        Message message = Message.builder()
                .title(AppConstants.TITLE)
                .text(AppConstants.PROFILE_PICTURE_UPDATE_SUCCESSFUL_MESSAGE)
                .build();
        DefaultResponse defaultResponse = DefaultResponse.builder().message(message).build();
        return ResponseEntity.ok(defaultResponse);
    }
}
