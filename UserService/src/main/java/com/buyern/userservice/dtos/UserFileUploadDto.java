package com.buyern.userservice.dtos;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class UserFileUploadDto {
    private MultipartFile file;
    private String userUid;
}
