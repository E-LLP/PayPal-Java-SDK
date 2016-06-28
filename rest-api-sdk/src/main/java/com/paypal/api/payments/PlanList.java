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
public class PlanList  extends PayPalModel {

	/**
	 * Array of billing plans.
	 */
	private List<Plan> plans;

	/**
	 * Total number of items.
	 */
	private String totalItems;

	/**
	 * Total number of pages.
	 */
	private String totalPages;

	/**
	 * 
	 */
	private List<Links> links;

	/**
	 * Default Constructor
	 */
	public PlanList() {
		plans = new ArrayList<Plan>();
		links = new ArrayList<Links>();
	}
}
