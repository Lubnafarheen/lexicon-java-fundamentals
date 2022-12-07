package org.lubna.fundamentals.week9.exceptions;

public class CustomDataNotFoundException extends Exception {
    private Integer errorCode;

    public CustomDataNotFoundException(String message) {
        super(message);
    }

    public CustomDataNotFoundException(String message, Integer errorCode) {
        this(message);
        this.errorCode = errorCode;
    }

    public Integer getErrorCode() {
        return errorCode;
    }


}
