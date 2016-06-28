package com.paypal.api.payments;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper=false)
@Accessors(chain = true)
public class FundingDetail  {

	/**
	 * Expected clearing time
	 */
	private String clearingTime;

	/**
	 * [DEPRECATED] Hold-off duration of the payment. payment_debit_date should be used instead.
	 */
	private String paymentHoldDate;

	/**
	 * Date when funds will be debited from the payer's account
	 */
	private String paymentDebitDate;

	/**
	 * Processing type of the payment card
	 */
	private String processingType;

	/**
	 * Default Constructor
	 */
	public FundingDetail() {
	}
}
