package com.assignment.internet.service.provider.exception;

import lombok.Getter;

@Getter
public class FileUploadException extends RuntimeException {

    private final String description;

    public FileUploadException(String message, String description) {
        super(message);
        this.description = description;
    }

}
