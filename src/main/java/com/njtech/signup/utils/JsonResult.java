package com.njtech.signup.utils;

public class JsonResult {
    private int success;

    public void setCode(String code) {
        this.code = code;
    }

    public int getSuccess() {

        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    private String code;
    private String message;
    private Object data;

    public JsonResult() {
        this.setCode(ResultCode.SUCCESS);
        this.setMessage("成功！");

    }

    public JsonResult(ResultCode code) {
        this.setCode(code);
        this.setMessage(code.msg());
    }
    public JsonResult(int success) {
        this.success = success;
    }

    public JsonResult(ResultCode code, String message) {
        this.setCode(code);
        this.setMessage(message);
    }
    public JsonResult(int success, Object data) {
        this.success = success;
        this.data = data;
    }

    public JsonResult(int success, String code, String message, Object data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public JsonResult(int success, ResultCode code, Object data) {
        this.success = success;
        this.setCode(code);
        this.data = data;
    }

    public String getCode() {
        return code;
    }
    public void setCode(ResultCode code) {
        this.code = code.val();
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
