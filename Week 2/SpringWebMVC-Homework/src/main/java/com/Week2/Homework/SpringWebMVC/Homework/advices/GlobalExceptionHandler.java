package com.Week2.Homework.SpringWebMVC.Homework.advices;

import com.Week2.Homework.SpringWebMVC.Homework.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Arrays;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse<?>> handleInputValidationError (MethodArgumentNotValidException exception){
        ApiError apiError = ApiError.builder().status(HttpStatus.BAD_REQUEST).error("Input Validation Failed")
                .subError(Arrays.stream(exception.getSuppressedFields()).toList())
                .build();

        return getResponseEntity(apiError);
    }

   @ExceptionHandler(ResourceNotFoundException.class)
   public ResponseEntity<ApiResponse<?>> resourceNotFoundHandle (ResourceNotFoundException exception){
        ApiError apiError = ApiError.builder().status(HttpStatus.NOT_FOUND)
                .error(exception.getMessage()).build();
        return getResponseEntity(apiError);
   }

   @ExceptionHandler(Exception.class)
   public ResponseEntity<ApiResponse<?>> handleInternalServerError(Exception exception){
        ApiError apiError= ApiError.builder().status(HttpStatus.INTERNAL_SERVER_ERROR).error("Internal Sever Error found")
                .build();
        return getResponseEntity(apiError);
   }

    private ResponseEntity<ApiResponse<?>> getResponseEntity(ApiError apiError){
       return  new ResponseEntity<>(new ApiResponse<>(apiError) , apiError.getStatus());
    }

}
