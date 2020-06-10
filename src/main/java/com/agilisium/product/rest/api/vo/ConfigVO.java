/**
 * 
 */
package com.agilisium.product.rest.api.vo;

/**
 * This class responsible to provide configuration detail
 * 
 * @author DhanabalM
 *
 */
public class ConfigVO {

	private Integer id;
	private Integer productId;
	private Integer stock;

	public ConfigVO(Integer id, Integer productId, Integer stock) {
		super();
		this.id = id;
		this.productId = productId;
		this.stock = stock;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the productId
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
	 * @return the stock
	 */
	public Integer getStock() {
		return stock;
	}

	/**
	 * @param stock
	 *            the stock to set
	 */
	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
