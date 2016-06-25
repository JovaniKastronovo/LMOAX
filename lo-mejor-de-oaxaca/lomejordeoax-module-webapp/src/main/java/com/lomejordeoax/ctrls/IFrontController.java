package com.lomejordeoax.ctrls;

import org.lomejordeoax.model.to.common.MessageTO;

public interface IFrontController {
	void validateResponse(MessageTO messageTo) throws RuntimeException;
}
