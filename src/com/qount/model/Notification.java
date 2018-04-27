
package com.qount.model;

public class Notification {

	private long time;// time to wait in millis
	private String message;

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}