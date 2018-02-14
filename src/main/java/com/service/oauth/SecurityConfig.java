package com.service.oauth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class SecurityConfig extends GlobalAuthenticationConfigurerAdapter {
	
	public void init(AuthenticationManagerBuilder authBuilder) throws Exception {
		//authBuilder.ldapAuthentication().
		authBuilder.inMemoryAuthentication().withUser("jagath").password("kriish").roles("USER").and().withUser("venki").password("kriish1").roles("USER","ADMIN");
	}
	
}
