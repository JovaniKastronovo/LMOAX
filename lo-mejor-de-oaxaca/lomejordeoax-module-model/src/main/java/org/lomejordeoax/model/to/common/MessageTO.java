package org.lomejordeoax.model.to.common;

import java.util.List;

import org.lomejordeoax.model.vo.common.HeaderVO;

public class MessageTO {
	
	private HeaderVO header;
	private Object objectData;
	private List<ErrorMessage> errors;
	
	public HeaderVO getHeader() {
		return header;
	}
	public void setHeader(HeaderVO header) {
		this.header = header;
	}
	public Object getObjectData() {
		return objectData;
	}
	public void setObjectData(Object objectData) {
		this.objectData = objectData;
	}
	public List<ErrorMessage> getErrors() {
		return errors;
	}
	public void setErrors(List<ErrorMessage> errors) {
		this.errors = errors;
	}
	
	@Override
	public String toString() {
		return "MessageTO [header=" + header + ", objectData=" + objectData
				+ ", errors=" + errors + "]";
	}	
	
}
