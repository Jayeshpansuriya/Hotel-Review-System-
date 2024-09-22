package com.jd.user.services.exceptions;

import com.jd.user.services.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundException ex) {
        String message = ex.getMessage();
        ApiResponse response = ApiResponse.builder()
                .message(message)
                .success(false) // Indicates failure
                .status(HttpStatus.NOT_FOUND) // Directly use HttpStatus
                .build();
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
