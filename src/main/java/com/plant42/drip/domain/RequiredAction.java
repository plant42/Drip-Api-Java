package com.plant42.drip.domain;

public class RequiredAction {

    private String code;
    private String message;

    public RequiredAction() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "RequiredAction{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
