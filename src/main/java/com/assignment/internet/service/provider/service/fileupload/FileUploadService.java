package com.assignment.internet.service.provider.service.fileupload;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {

    void uploadFile(MultipartFile file);
}
