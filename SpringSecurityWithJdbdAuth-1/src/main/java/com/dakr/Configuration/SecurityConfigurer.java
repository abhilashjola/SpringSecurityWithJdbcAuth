package com.dakr.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfigurer {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	public void authManager(AuthenticationManagerBuilder auth) throws Exception{
		
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			.passwordEncoder(new BCryptPasswordEncoder())
			.usersByUsernameQuery("select username,password from users where username=?")
			.authoritiesByUsernameQuery("select username,authority from authorities where username=?");
			
	}

    @Bean
   public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests((req) -> req
                .requestMatchers("/admin").hasRole("ADMIN")
                .requestMatchers("/user").hasAnyRole("ADMIN", "USER")
                .requestMatchers("/").permitAll()
                .anyRequest().authenticated())
                .formLogin(withDefaults());
		return http.build();
	}
}
