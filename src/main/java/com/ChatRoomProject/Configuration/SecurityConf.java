package com.ChatRoomProject.Configuration;


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
@Configuration
@EnableWebSecurity
public class SecurityConf {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
        .csrf(csrf ->csrf.disable())
        .authorizeHttpRequests((authorize) -> authorize
            .requestMatchers("/register","/login").permitAll()
            .anyRequest().authenticated()
        ).httpBasic(Customizer.withDefaults());
        return http.build();
    }
    @Autowired
    private MongoDetailsService mongoDetailsService;

    
    @Bean
    AuthenticationManager authenticationManager(PasswordEncoder passwordEncoder) 
    {
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
