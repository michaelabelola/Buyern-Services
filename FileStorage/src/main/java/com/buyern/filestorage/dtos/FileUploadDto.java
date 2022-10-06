package com.buyern.filestorage.dtos;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public class FileUploadDto {
    private String name;
    private MultipartFile file;
}
