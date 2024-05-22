package com.ChatRoomProject.Configuration;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Configuration
@EnableWebSecurity
public class SecurityConf {

 @Autowired
 private MongoDetailsService mongoDetailsService;
 
 @Bean
 AccessDeniedHandler accessDeniedHandler() {
     return new AccessDeniedHandler() {

		@Override
		public void handle(HttpServletRequest request, HttpServletResponse response,
				org.springframework.security.access.AccessDeniedException accessDeniedException)
				throws IOException, ServletException {
			// TODO Auto-generated method stub
			
		}
     };
 }


 @Bean
 SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
     http
         .csrf(csrf -> csrf.disable())
         .authorizeHttpRequests(authorize -> authorize
             .requestMatchers("/register", "/login", "/ws/**", "/topic").permitAll()
             .anyRequest().authenticated()
         )
         .exceptionHandling(ex -> ex.accessDeniedHandler(accessDeniedHandler()))
         .httpBasic(Customizer.withDefaults());
     return http.build();
 }


 @Bean
 AuthenticationManager authenticationManager(PasswordEncoder passwordEncoder) {
     DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
     authenticationProvider.setUserDetailsService(mongoDetailsService);
     authenticationProvider.setPasswordEncoder(passwordEncoder);
     return new ProviderManager(authenticationProvider);
 }

 @Bean
 PasswordEncoder passwordEncoder() {
     return NoOpPasswordEncoder.getInstance();
 }
}
