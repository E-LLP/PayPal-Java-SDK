package com.paypal.api.payments;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper=false)
@Accessors(chain = true)
public class FmfDetails {

	/**
	 * Type of filter.
	 */
	private String filterType;
	
	/**
	 * Filter Identifier.
	 */
	private String filterId;
	
	/**
	 * Name of the filter
	 */
	private String name;
	
	/**
	 * Description of the filter.
	 */
	private String description;
}
