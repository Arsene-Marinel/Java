package com.company.Exceptions;

public class ReadFileException extends Exception {
    public ReadFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReadFileException(String message) {
        super(message);
    }
}
