package com.assignment.internet.service.provider.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class AppConstants {

    public static final String TITLE = "ISP Service";
    public static final String INTERNAL_SERVER_ERROR_MESSAGE = "Internal Server Error";
    public static final String OPERATION_NOT_SUPPORTED_MESSAGE = "Operation not supported";
    public static final String PROFILE_NOT_FOUND_ERROR_MESSAGE = "Profile does not exists with id ";
    public static final String PROFILE_PICTURE_UPDATE_SUCCESSFUL_MESSAGE = "Profile Picture Updated Successfully";
    public static final String PROFILE_PICTURE_SIZE_TOO_LARGE_MESSAGE = "Profile image too large";
    public static final String INVALID_FILE_UPLOAD_ERROR_MESSAGE = "Invalid file uploaded";
    public static final String INVALID_FILE_FORMAT_ERROR_MESSAGE = "Please upload jpeg file only";
    public static final String LOCAL_FILE_SAVE_FAILED_MESSAGE = "Failed to save file to local directory";

    public static final String API_NOT_IMPLEMENTED_MESSAGE = "API not implemented";

    public static final String DATA_NOT_FOUND_ERROR_CODE = "4001";
    public static final String FILE_UPLOAD_FAILED_ERROR_CODE = "4002";
    public static final String FILE_SIZE_TOO_LARGE_ERROR_CODE = "4003";
    public static final String INTERNAL_SERVER_ERROR_CODE = "5000";

}
