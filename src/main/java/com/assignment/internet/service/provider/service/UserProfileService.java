package com.assignment.internet.service.provider.service;

import com.assignment.internet.service.provider.constants.AppConstants;
import com.assignment.internet.service.provider.exception.DataNotFoundException;
import com.assignment.internet.service.provider.repository.UserProfileRepository;
import com.assignment.internet.service.provider.service.fileupload.FileUploadService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UserProfileService {

    private final UserProfileRepository userProfileRepository;
    private final FileUploadService fileUploadService;

    public UserProfileService(UserProfileRepository userProfileRepository, FileUploadService fileUploadService) {
        this.userProfileRepository = userProfileRepository;
        this.fileUploadService = fileUploadService;
    }

    public void updateProfilePicture(Long userId, MultipartFile image) {
        boolean profileExists = userProfileRepository.userProfileExists(userId);
        if (profileExists) {
            fileUploadService.uploadFile(image);
        } else {
            throw new DataNotFoundException(AppConstants.PROFILE_NOT_FOUND_ERROR_MESSAGE + userId);
        }
    }
}
