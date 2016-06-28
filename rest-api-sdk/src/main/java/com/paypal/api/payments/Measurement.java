package com.paypal.api.payments;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper=false)
@Accessors(chain = true)
public class Measurement {
	
	/**
	 * Value this measurement represents.
	 */
	private String value;
	
	/**
	 * Unit in which the value is represented.
	 */
	private String unit;
}
