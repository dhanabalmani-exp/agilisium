/**
 * 
 */
package com.agilisium.product.rest.api.vo;

import java.util.List;

/**
 * This class responsible to provide list of configuration details
 * 
 * @author DhanabalM
 *
 */
public class ConfigResponseVO {

	private List<ConfigVO> configDetails;

	public ConfigResponseVO(List<ConfigVO> configDetails) {
		super();
		this.configDetails = configDetails;
	}

	/**
	 * @return the configDetails
	 */
	public List<ConfigVO> getConfigDetails() {
		return configDetails;
	}

	/**
	 * @param configDetails
	 *            the configDetails to set
	 */
	public void setConfigDetails(List<ConfigVO> configDetails) {
		this.configDetails = configDetails;
	}

}
