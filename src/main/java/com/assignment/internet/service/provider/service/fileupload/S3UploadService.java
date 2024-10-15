package com.assignment.internet.service.provider.service.fileupload;

import com.assignment.internet.service.provider.constants.AppConstants;
import com.assignment.internet.service.provider.exception.FileUploadException;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@ConditionalOnProperty(prefix = "app.image.save", name = "location", havingValue = "s3", matchIfMissing = true)
@Service
public class S3UploadService implements FileUploadService {

    @Override
    public void uploadFile(MultipartFile file) {
        // Code to upload file to S3 bucket.
        throw new FileUploadException(AppConstants.OPERATION_NOT_SUPPORTED_MESSAGE, AppConstants.OPERATION_NOT_SUPPORTED_MESSAGE);
    }
}
