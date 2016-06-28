package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper=false)
@Accessors(chain = true)
public class RefundDetail  extends PayPalModel {

	/**
	 * PayPal refund type indicating whether refund was done in invoicing flow via PayPal or externally. In the case of the mark-as-refunded API, refund type is EXTERNAL and this is what is now supported. The PAYPAL value is provided for backward compatibility.
	 */
	private String type;

	/**
	 * Date when the invoice was marked as refunded. If no date is specified, the current date and time is used as the default. In addition, the date must be after the invoice payment date.
	 */
	private String date;

	/**
	 * Optional note associated with the refund.
	 */
	private String note;

	/**
	 * Default Constructor
	 */
	public RefundDetail() {
	}

	/**
	 * Parameterized Constructor
	 */
	public RefundDetail(String type) {
		this.type = type;
	}
}
