package com.plant42.drip.api.exceptions;

public class DripException extends RuntimeException {

    protected Error error;

    public DripException(Error error) {
        this.error = error;
    }

    public DripException(String message, Error error) {
        super(message);
        this.error = error;
    }

    public DripException(String message, Throwable cause, Error error) {
        super(message, cause);
        this.error = error;
    }

    public DripException(Throwable cause, Error error) {
        super(cause);
        this.error = error;
    }

    public DripException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Error error) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.error = error;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
