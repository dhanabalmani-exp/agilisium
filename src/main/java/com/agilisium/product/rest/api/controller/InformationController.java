package com.agilisium.product.rest.api.controller;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agilisium.product.rest.api.vo.ConfigResponseVO;
import com.agilisium.product.rest.api.vo.ConfigVO;
import com.agilisium.product.rest.api.vo.ProductResponseVO;
import com.agilisium.product.rest.api.vo.ProductVO;

/**
 * 
 * This class responsible for provide information about product and config details
 * 
 * @author DhanabalM
 *
 */
@RestController
public class InformationController {

	/**
	 * Method to get list of products as json response
	 * 
	 * @return ({@code ProductResponseVO}) contains product value object
	 */
	@PreAuthorize("hasRole('ROLE_USER1')")
	@RequestMapping(value = "/api/getproductdetails", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public ProductResponseVO getProductDetails() {

		return new ProductResponseVO(prepareProductList());
	}

	/**
	 * Method to get list of products as json response
	 * 
	 * @return ({@code ConfigResponseVO}) contains configuration value object
	 */
	@PreAuthorize("hasRole('ROLE_USER2')")
	@RequestMapping(value = "/api/getconfigdetails", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public ConfigResponseVO getConfigDetails() {

		return new ConfigResponseVO(prepareConfigList());
	}

	/**
	 * Method to prepare product details
	 * 
	 * @return ({@code List<ProductVO>}) contains list of product details
	 */
	private static List<ProductVO> prepareProductList() {

		return Arrays.asList(new ProductVO(1001, "Phone"), new ProductVO(1002, "Laptop"), new ProductVO(1003, "Watch"));

	}

	/**
	 * Method to prepare configuration details
	 * 
	 * @return ({@code List<ConfigVO>}) contains list of configuration details
	 */
	private static List<ConfigVO> prepareConfigList() {

		return Arrays.asList(new ConfigVO(1, 1001, 10), new ConfigVO(2, 1002, 100), new ConfigVO(3, 1003, 1000));

	}

}
