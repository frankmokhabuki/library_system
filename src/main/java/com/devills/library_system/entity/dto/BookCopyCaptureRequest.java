package com.devills.library_system.entity.dto;

import lombok.Data;

@Data
public class BookCopyCaptureRequest {

    private String uniqueBookIdentifier;

    private String Isbn;
}
