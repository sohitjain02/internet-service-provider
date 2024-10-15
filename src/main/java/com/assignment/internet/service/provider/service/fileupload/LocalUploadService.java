package com.assignment.internet.service.provider.service.fileupload;

import com.assignment.internet.service.provider.constants.AppConstants;
import com.assignment.internet.service.provider.exception.FileUploadException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@ConditionalOnProperty(prefix = "app.image.save", name = "location", havingValue = "local", matchIfMissing = true)
@Service
public class LocalUploadService implements FileUploadService {

    private static final Logger logger = LoggerFactory.getLogger(LocalUploadService.class);

    private static final String UPLOAD_DIR = "C://Users//sohit//Desktop//isp//profiles//";

    @Override
    public void uploadFile(MultipartFile file) {
        try {
            String fileName = file.getOriginalFilename();
            File dest = new File(UPLOAD_DIR + fileName);
            file.transferTo(dest);
            logger.info("File saved to local directory successfully");
        } catch (Exception e) {
            logger.info("Failed to save file to local directory");
            throw new FileUploadException(AppConstants.LOCAL_FILE_SAVE_FAILED_MESSAGE, e.getMessage());
        }
    }
}
