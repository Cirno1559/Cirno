package com.web.pojo;

public class OutJson {

	private boolean success;//判断是否成功   true；成功   false：失败
	private String message;//提示信息
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
