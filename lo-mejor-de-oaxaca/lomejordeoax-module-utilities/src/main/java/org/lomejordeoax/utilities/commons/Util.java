package org.lomejordeoax.utilities.commons;

import java.util.List;

import org.lomejordeoax.model.to.common.ErrorMessage;

public class Util {
	
	public static String concatError(List<ErrorMessage> errors){
		StringBuilder strn = new StringBuilder();
		for (ErrorMessage error : errors) {
			strn.append(error);
		}
		return strn.toString();
	}
}
