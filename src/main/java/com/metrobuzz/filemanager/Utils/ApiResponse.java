package com.metrobuzz.filemanager.Utils;

public class ApiResponse {

    private boolean status;
    private String message;
    private Object payload;
    private int code;

    private ApiResponse(boolean status, String message, Object payload, int code) {
        this.status = status;
        this.message = message;
        this.payload = payload;
        this.code = code;
    }

    public static ApiResponse success(String message, Object payload) {
        return new ApiResponse(true, message, payload, 200);
    }

    public static ApiResponse error(String message, int code) {
        return new ApiResponse(false, message, null, code);
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
