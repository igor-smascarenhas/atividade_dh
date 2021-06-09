package com.digitalhouse.obtenerdiploma.service.exceptions;

import org.springframework.http.HttpStatus;

public class ExceptionDefault {

    private HttpStatus status;
    private String message;

    public ExceptionDefault() {
    }

    public ExceptionDefault(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
