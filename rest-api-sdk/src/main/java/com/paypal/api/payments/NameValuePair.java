package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper=false)
@Accessors(chain = true)
public class NameValuePair  extends PayPalModel {

	/**
	 * Key for the name value pair.  The value name types should be correlated 
	 */
	private String name;

	/**
	 * Value for the name value pair.
	 */
	private String value;

	/**
	 * Default Constructor
	 */
	public NameValuePair() {
	}

	/**
	 * Parameterized Constructor
	 */
	public NameValuePair(String name, String value) {
		this.name = name;
		this.value = value;
	}
}
