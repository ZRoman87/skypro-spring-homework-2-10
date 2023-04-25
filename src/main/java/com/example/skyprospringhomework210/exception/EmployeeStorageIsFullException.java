package com.example.skyprospringhomework210.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.TOO_MANY_REQUESTS)
public class EmployeeStorageIsFullException extends RuntimeException{
}
