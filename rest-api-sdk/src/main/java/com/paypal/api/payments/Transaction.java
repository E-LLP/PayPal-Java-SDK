package com.paypal.api.payments;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper=false)
@Accessors(chain = true)
public class Transaction extends TransactionBase {

	/**
	 * Additional transactions for complex payment scenarios.
	 */
	private List<Transaction> transactions;

	/**
	 * Default Constructor
	 */
	public Transaction() {
		transactions = new ArrayList<Transaction>();
	}
}
