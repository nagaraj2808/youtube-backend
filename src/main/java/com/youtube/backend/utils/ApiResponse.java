package com.youtube.backend.utils;

public class ApiResponse {
    private int statusCode;
    private Object data;
    private String message = "Success";
    private boolean success;

    public ApiResponse(int statusCode, Object data, String message) {
        this.statusCode = statusCode;
        this.data = data;
        this.message = message;
        this.success = statusCode < 400;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public Object getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return success;
    }
}
