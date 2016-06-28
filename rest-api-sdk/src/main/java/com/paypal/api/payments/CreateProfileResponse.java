package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper=false)
@Accessors(chain = true)
public class CreateProfileResponse  extends PayPalModel {

	/**
	 * ID of the payment web experience profile.
	 */
	private String id;

	/**
	 * Default Constructor
	 */
	public CreateProfileResponse() {
	}
}
