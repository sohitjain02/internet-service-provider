package com.assignment.internet.service.provider.exception;

import com.assignment.internet.service.provider.constants.AppConstants;
import com.assignment.internet.service.provider.controller.UserProfileController;
import com.assignment.internet.service.provider.dto.response.common.DefaultResponse;
import com.assignment.internet.service.provider.dto.response.common.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import java.util.UUID;

@ControllerAdvice(basePackageClasses = UserProfileController.class)
public class UserProfileExceptionHandler {

    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<DefaultResponse> handleDataNotFoundException(DataNotFoundException ex) {
        Message message = Message.builder()
                .title(AppConstants.TITLE)
                .text(ex.getMessage())
                .build();
        DefaultResponse dataNotFoundResponse = DefaultResponse.builder()
                .traceId(UUID.randomUUID().toString())
                .code(AppConstants.DATA_NOT_FOUND_ERROR_CODE)
                .message(message)
                .build();
        return ResponseEntity.badRequest().body(dataNotFoundResponse);
    }

    @ExceptionHandler(FileUploadException.class)
    public ResponseEntity<DefaultResponse> handleFileUploadException(FileUploadException ex) {
        Message message = Message.builder()
                .title(AppConstants.TITLE)
                .text(ex.getMessage())
                .build();
        DefaultResponse fileUploadResponse = DefaultResponse.builder()
                .traceId(UUID.randomUUID().toString())
                .description(ex.getDescription())
                .code(AppConstants.FILE_UPLOAD_FAILED_ERROR_CODE)
                .message(message)
                .build();
        return ResponseEntity.internalServerError().body(fileUploadResponse);
    }

    @ExceptionHandler(InvalidFileUploadException.class)
    public ResponseEntity<DefaultResponse> handleInvalidFileUploadException(InvalidFileUploadException ex) {
        Message message = Message.builder()
                .title(AppConstants.TITLE)
                .text(ex.getMessage())
                .build();
        DefaultResponse invalidFileUploadResponse = DefaultResponse.builder()
                .traceId(UUID.randomUUID().toString())
                .description("")
                .code(AppConstants.FILE_UPLOAD_FAILED_ERROR_CODE)
                .message(message)
                .build();
        return ResponseEntity.badRequest().body(invalidFileUploadResponse);
    }

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ResponseEntity<DefaultResponse> handleMaxUploadSizeExceededException(MaxUploadSizeExceededException ex) {
        Message message = Message.builder()
                .title(AppConstants.TITLE)
                .text(AppConstants.PROFILE_PICTURE_SIZE_TOO_LARGE_MESSAGE)
                .build();
        DefaultResponse maxUploadSizeExceededResponse = DefaultResponse.builder()
                .traceId(UUID.randomUUID().toString())
                .description(ex.getMessage())
                .code(AppConstants.FILE_SIZE_TOO_LARGE_ERROR_CODE)
                .message(message)
                .build();
        return ResponseEntity.internalServerError().body(maxUploadSizeExceededResponse);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<DefaultResponse> handleRuntimeException(RuntimeException ex) {
        Message message = Message.builder()
                .title(AppConstants.TITLE)
                .text(AppConstants.INTERNAL_SERVER_ERROR_MESSAGE)
                .build();
        DefaultResponse errorResponse = DefaultResponse.builder()
                .traceId(UUID.randomUUID().toString())
                .description(ex.getMessage())
                .code(AppConstants.INTERNAL_SERVER_ERROR_CODE)
                .message(message)
                .build();
        return ResponseEntity.internalServerError().body(errorResponse);
    }

}
