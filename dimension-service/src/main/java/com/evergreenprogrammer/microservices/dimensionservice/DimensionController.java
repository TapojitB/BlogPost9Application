/**
 * 
 */
package com.evergreenprogrammer.microservices.dimensionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TapojitBhattacharya
 *
 */
@RestController
public class DimensionController {

	@Autowired
	private Dimension dimension;

	@GetMapping("/dimensions")
	public Dimension retrieveDimension() {
		return new Dimension(dimension.getLength(), dimension.getBreadth(), dimension.getHeight());

	}

}
