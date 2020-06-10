package com.agilisium.product.config.security;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections4.map.HashedMap;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This class is responsible to provide unauthorized status as response.
 * 
 * @author DhanabalM
 *
 */
@Component
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
		AuthenticationException authException) throws IOException {

		final String unAuthorizedResponseStr = new ObjectMapper().writeValueAsString(getUnAuthorizedResponse());
		response.setContentType("application/json;charset=UTF-8");
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		response.getWriter().print(unAuthorizedResponseStr);
	}

	/**
	 * Method to get response for un-authorized login
	 * 
	 * @return ({@code Map<String, Object>}) which contains unauthorized details
	 */
	private static Map<String, Object> getUnAuthorizedResponse() {
		final Map<String, Object> map = new HashedMap<>();
		map.put("timestamp", new Date());
		map.put("status", HttpServletResponse.SC_UNAUTHORIZED);
		map.put("message", "Not authorized");
		return map;
	}

}