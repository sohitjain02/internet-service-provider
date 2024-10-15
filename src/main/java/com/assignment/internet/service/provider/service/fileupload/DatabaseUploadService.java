package com.assignment.internet.service.provider.service.fileupload;

import com.assignment.internet.service.provider.constants.AppConstants;
import com.assignment.internet.service.provider.exception.FileUploadException;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@ConditionalOnProperty(prefix = "app.image.save", name = "location", havingValue = "db", matchIfMissing = true)
@Service
public class DatabaseUploadService implements FileUploadService {

    @Override
    public void uploadFile(MultipartFile file) {
        // Code to save image to DB as BLOB
        throw new FileUploadException(AppConstants.OPERATION_NOT_SUPPORTED_MESSAGE, AppConstants.OPERATION_NOT_SUPPORTED_MESSAGE);
    }
}
