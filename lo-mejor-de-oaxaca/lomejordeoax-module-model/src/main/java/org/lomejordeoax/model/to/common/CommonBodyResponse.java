package org.lomejordeoax.model.to.common;

import java.util.List;

public class CommonBodyResponse {	
	
	private int warning_count;
	private int error_count;
	private List<ErrorMessage> message_list;
	
	public int getWarning_count() {
		return warning_count;
	}
	public void setWarning_count(int warning_count) {
		this.warning_count = warning_count;
	}
	public int getError_count() {
		return error_count;
	}
	public void setError_count(int error_count) {
		this.error_count = error_count;
	}
	public List<ErrorMessage> getMessage_list() {
		return message_list;
	}
	public void setMessage_list(List<ErrorMessage> message_list) {
		this.message_list = message_list;
	}
	

}
