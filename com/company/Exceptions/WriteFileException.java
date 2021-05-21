package com.company.Exceptions;

public class WriteFileException extends Exception {

    public WriteFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public WriteFileException(String message) {
        super(message);
    }
}
