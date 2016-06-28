package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper=false)
@Accessors(chain = true)
public class PayoutBatch extends PayPalModel  {

	/**
	 * A batch header that includes the generated batch status.
	 */
	private PayoutBatchHeader batchHeader;

	/**
	 * Array of the items in a batch payout.
	 */
	private List<PayoutItemDetails> items;

	/**
	 * 
	 */
	private List<Links> links;

	/**
	 * Default Constructor
	 */
	public PayoutBatch() {
	}

	/**
	 * Parameterized Constructor
	 */
	public PayoutBatch(PayoutBatchHeader batchHeader, List<PayoutItemDetails> items) {
		this.batchHeader = batchHeader;
		this.items = items;
	}
}
