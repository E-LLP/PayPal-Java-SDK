package com.paypal.api.payments;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper=false)
@Accessors(chain = true)
public class InstallmentInfo  {

	/**
	 * Installment id.
	 */
	private String installmentId;

	/**
	 * Credit card network.
	 */
	private String network;

	/**
	 * Credit card issuer.
	 */
	private String issuer;

	/**
	 * List of available installment options and the cost associated with each one.
	 */
	private List<InstallmentOption> installmentOptions;

	/**
	 * Default Constructor
	 */
	public InstallmentInfo() {
	}

	/**
	 * Parameterized Constructor
	 */
	public InstallmentInfo(List<InstallmentOption> installmentOptions) {
		this.installmentOptions = installmentOptions;
	}
}
