package br.com.learning.exceptions;

public class UserServiceException extends RuntimeException {

    private static final long serialVersionUID = 4173627880223661733L;

    public UserServiceException(String message) {
        super(message);
    }
}
