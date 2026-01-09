package com.crudplusAngular.crud_fullstack_angular.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
    private LocalDateTime timeStamp;
    private String message;
    private String Path;
    private String errorCode;

    public ErrorDetails() {
    }

    public ErrorDetails(LocalDateTime timeStamp, String message, String path, String errorCode) {
        this.timeStamp = timeStamp;
        this.message = message;
        Path = path;
        this.errorCode = errorCode;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
