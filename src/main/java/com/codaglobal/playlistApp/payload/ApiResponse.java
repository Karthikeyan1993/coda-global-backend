package com.codaglobal.playlistApp.payload;

public class ApiResponse {

	private Object data;
	private boolean flag;
	private String message;

	public ApiResponse() {
		super();
	}

	public ApiResponse(Object data, boolean flag, String message) {
		super();
		this.data = data;
		this.flag = flag;
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ApiResponse [data=" + data + ", flag=" + flag + ", message=" + message + "]";
	}

}
