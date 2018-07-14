package com.plant42.drip.domain;

import java.io.Serializable;

public class DripError extends DripObject implements Serializable {

    private String message;
    private String code;
    private String attribute;

    public DripError() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String error) {
        this.message = error;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String field) {
        this.code = field;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "DripError{" +
                "message='" + message + '\'' +
                ", code='" + code + '\'' +
                ", attribute='" + attribute + '\'' +
                '}';
    }
}
