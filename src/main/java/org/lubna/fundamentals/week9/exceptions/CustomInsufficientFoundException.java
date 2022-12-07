package org.lubna.fundamentals.week9.exceptions;

public class CustomInsufficientFoundException extends Exception{

    private Integer errorCode;

    public CustomInsufficientFoundException(String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

}
