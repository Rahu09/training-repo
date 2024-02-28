package com.hexa.samplejpa.config;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFilter;
 
@Configuration
@EnableMethodSecurity
public class SpringSecurityConfig {
	AuthenticationFilter obj;
	@Bean
	public static PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }
 
	/*
	 * @Bean public InMemoryUserDetailsManager userDetailsService() { UserDetails
	 * sayooj =
	 * User.builder().username("sayooj").password(passwordEncoder().encode("root")).
	 * roles("USER") .build(); UserDetails admin =
	 * User.builder().username("admin").password(passwordEncoder().encode("root")).
	 * roles("ADMIN") .build();
	 *  
	 * return new InMemoryUserDetailsManager(sayooj, admin);
	 * 
	 * }
	 */
 
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf((csrf) -> csrf.disable()).authorizeHttpRequests((authorize) -> {
			// authorize.requestMatchers(HttpMethod.POST,"/api/v1/productapp/addProduct**").hasRole("ADMIN");
			// authorize.requestMatchers(HttpMethod.GET,"/api/v1/**").permitAll();
 
			authorize.anyRequest().authenticated();
		}).httpBasic(Customizer.withDefaults());
		return http.build();
 
	}
 
}