package com.javaeefinal.itse1908r.javaeefinal.ValidationError;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValidationError {
    private String path;
    private String message;
}
