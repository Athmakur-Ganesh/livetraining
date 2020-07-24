package com.example.demo;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
		auth.inMemoryAuthentication().withUser("ramesh").
		                 password("{noop}ramesh").roles("USER");

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
	 	.antMatchers("/greet")
		.authenticated().and()
		.formLogin().and().logout().logoutSuccessUrl("/greet")
		.invalidateHttpSession(true)
		.deleteCookies("JSESSIONID").and().csrf().
		disable();

	}

	
	
}
