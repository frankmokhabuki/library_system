package com.devills.library_system.entity.dto;

import lombok.Data;

@Data
public class BorrowRequest {

    private String userEmail;

    private String bookUniqueIdentifier;

}
