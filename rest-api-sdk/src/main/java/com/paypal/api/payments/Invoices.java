package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper=false)
@Accessors(chain = true)
public class Invoices  extends PayPalModel {

	/**
	 * 
	 */
	private int totalCount;

	/**
	 * List of invoices belonging to a merchant.
	 */
	private List<Invoice> invoices;

	/**
	 * Default Constructor
	 */
	public Invoices() {
		invoices = new ArrayList<Invoice>();
	}
}
