/**
 * 
 */
package com.agilisium.product.rest.api.vo;

import java.util.List;

/**
 * This class responsible to provide list of product details
 * 
 * @author DhanabalM
 *
 */
public class ProductResponseVO {

	private List<ProductVO> productDetails;

	public ProductResponseVO(List<ProductVO> productDetails) {
		super();
		this.productDetails = productDetails;
	}

	/**
	 * @return the productDetails
	 */
	public List<ProductVO> getProductDetails() {
		return productDetails;
	}

	/**
	 * @param productDetails
	 *            the productDetails to set
	 */
	public void setProductDetails(List<ProductVO> productDetails) {
		this.productDetails = productDetails;
	}

}
