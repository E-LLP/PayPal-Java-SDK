package com.paypal.api.payments;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper=false)
@Accessors(chain = true)
public class FundingSource  {

	/**
	 * Default Constructor
	 */
	public FundingSource() {
	}

}
