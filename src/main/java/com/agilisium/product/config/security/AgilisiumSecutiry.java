/**
 * 
 */
package com.agilisium.product.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * This class is responsible for spring security
 * 
 * @author DhanabalM
 *
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
@ComponentScan(basePackages = { "com.agilisium.product" })
public class AgilisiumSecutiry extends WebSecurityConfigurerAdapter {

	/**
	 * To handle unauthorized request
	 */
	@Autowired
	private RestAuthenticationEntryPoint restAuthenticationEntryPoint;

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().exceptionHandling().authenticationEntryPoint(restAuthenticationEntryPoint).and()
			.authorizeRequests().anyRequest().authenticated().and().httpBasic().and().anonymous().disable();
	}

	/**
	 * Method to load default credentials in memory
	 * 
	 * @param auth
	 *            which contains authentication builder
	 * @throws Exception
	 *             if any exception occur
	 */
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user1").password(passwordEncoder().encode("password1"))
			.authorities("ROLE_USER1").and().withUser("user2").password(passwordEncoder().encode("password2"))
			.authorities("ROLE_USER2");
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
