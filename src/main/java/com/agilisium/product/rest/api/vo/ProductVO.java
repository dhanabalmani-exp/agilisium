/**
 * 
 */
package com.agilisium.product.rest.api.vo;

/**
 * This class responsible to provide list of product detail
 * 
 * @author DhanabalM
 *
 */
public class ProductVO {

	private Integer id;
	private String name;

	public ProductVO(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
