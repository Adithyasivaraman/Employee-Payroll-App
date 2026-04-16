package com.bridgelabz.employeepayrollapp.exception;

import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public String handleCustomException(CustomException ex) {
        return ex.getMessage();
    }
}