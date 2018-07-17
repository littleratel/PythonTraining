package cn.bin.viewmodel;

import lombok.Data;

@Data
public class ResponseBody<T> {
	/**
	 * 响应码
	 * 200 - 成功
	 * 404 
	 * */
	private Integer code;
	private String msg;
	private T data;
}
