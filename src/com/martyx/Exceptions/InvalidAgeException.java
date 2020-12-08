package com.martyx.Exceptions;

public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException(String message) {
        System.err.println(message);
    }
}
