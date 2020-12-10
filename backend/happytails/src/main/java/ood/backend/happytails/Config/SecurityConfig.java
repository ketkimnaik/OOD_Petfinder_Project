package ood.backend.happytails.Config;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import ood.backend.happytails.Service.UserService;

import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	// add a reference to our security data source
    @Autowired
    private UserService userService;
	
    @Autowired
    private CustomAuthenticationSuccessHandler customAuthenticationSuccessHandler;
    
    //trial code
//    protected void configure(final HttpSecurity http) throws Exception {}
    
 
    
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
        // Form Login config
		
	http.httpBasic().disable();

//		http
//			.authorizeRequests()
////			.antMatchers("/").hasRole("USER").permitAll()
////			.antMatchers("/systems/**").hasRole("ADMIN")
//			.antMatchers("/register").permitAll()
//			.antMatchers("/login/home").permitAll()
////			.antMatchers("/dog").permitAll()
//			.antMatchers("/confirm").permitAll()
//			.antMatchers("/login").permitAll();
////			.anyRequest().permitAll();
//		
//        http.formLogin()
//			.loginPage("/login/home")
//			.loginProcessingUrl("/authenticateTheUser")
//			.successHandler(customAuthenticationSuccessHandler)
//			.usernameParameter("email")
//			.permitAll()
//			.and()
//			.logout().permitAll()
//			.and()
//			.exceptionHandling().accessDeniedPage("/access-denied")
//			.and().csrf().disable();// disable CSRF
	
		http.authorizeRequests().antMatchers("/fav/**").authenticated();
        
		
	    http.csrf().disable();
	    http.formLogin().loginPage("/login/showMyLoginPage").loginProcessingUrl("/authenticateTheUser")
		.successHandler(customAuthenticationSuccessHandler)
	    .usernameParameter("email").permitAll().and().exceptionHandling().accessDeniedPage("/access-denied")
	    .and().csrf().disable();
		
	}
	
	
	
	
	//beans
	//bcrypt bean definition
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	//authenticationProvider bean definition
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
		auth.setUserDetailsService(userService); //set the custom user details service
		auth.setPasswordEncoder(passwordEncoder()); //set the password encoder - bcrypt
		return auth;
	}
}

