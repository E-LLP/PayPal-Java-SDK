package com.paypal.api.payments;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper=false)
@Accessors(chain = true)
public class CurrencyConversion  {

	/**
	 * Date of validity for the conversion rate.
	 */
	private String conversionDate;

	/**
	 * 3 letter currency code
	 */
	private String fromCurrency;

	/**
	 * Amount participating in currency conversion, set to 1 as default 
	 */
	private String fromAmount;

	/**
	 * 3 letter currency code
	 */
	private String toCurrency;

	/**
	 * Amount resulting from currency conversion.
	 */
	private String toAmount;

	/**
	 * Field indicating conversion type applied.
	 */
	private String conversionType;

	/**
	 * Allow Payer to change conversion type.
	 */
	private Boolean conversionTypeChangeable;

	/**
	 * Base URL to web applications endpoint
	 */
	private String webUrl;

	/**
	 * 
	 */
	private List<DefinitionsLinkdescription> links;

	/**
	 * Default Constructor
	 */
	public CurrencyConversion() {
	}

	/**
	 * Parameterized Constructor
	 */
	public CurrencyConversion(String fromCurrency, String fromAmount, String toCurrency, String toAmount) {
		this.fromCurrency = fromCurrency;
		this.fromAmount = fromAmount;
		this.toCurrency = toCurrency;
		this.toAmount = toAmount;
	}
}
