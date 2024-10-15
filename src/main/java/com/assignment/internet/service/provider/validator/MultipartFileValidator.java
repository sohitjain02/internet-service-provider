package com.assignment.internet.service.provider.validator;

import com.assignment.internet.service.provider.constants.AppConstants;
import com.assignment.internet.service.provider.exception.InvalidFileUploadException;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class MultipartFileValidator {

    public void validateProfileImage(MultipartFile image) {
        if (image.isEmpty()) {
            throw new InvalidFileUploadException(AppConstants.INVALID_FILE_UPLOAD_ERROR_MESSAGE);
        }
        if (!"image/jpeg".equals(image.getContentType())) {
            throw new InvalidFileUploadException(AppConstants.INVALID_FILE_FORMAT_ERROR_MESSAGE);
        }
    }
}
