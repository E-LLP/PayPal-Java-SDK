package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper=false)
@Accessors(chain = true)
public class Credit  extends PayPalModel {

	/**
	 * Unique identifier of credit resource.
	 */
	private String id;

	/**
	 * specifies type of credit
	 */
	private String type;


	/**
	 * Default Constructor
	 */
	public Credit() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Credit(String type) {
		this.type = type;
	}
}
