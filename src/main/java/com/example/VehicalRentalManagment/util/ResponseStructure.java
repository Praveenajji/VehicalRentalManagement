package com.example.VehicalRentalManagment.util;

public class ResponseStructure <T> {
	
	private int status;
	private String message;
	private  T data;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	public static<T> ResponseStructure<T> create(int status,String message,T data){
		ResponseStructure<T> response = new ResponseStructure<T>();
		response.setStatus(status);
		response.setMessage(message);
		response.setData(data);
		return response;
	}
}
