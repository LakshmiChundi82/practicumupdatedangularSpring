//package security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//
//@Configuration
//@EnableWebSecurity
//
//public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Override
////	protected void configure(HttpSecurity http) throws Exception {
////		http.authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/**").permitAll().anyRequest()
////				.authenticated().and()
////				.formLogin().and()
////				.httpBasic();
//	
//	
//	protected void configure(HttpSecurity http) throws Exception{
//		
//		http.authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/**").permitAll().anyRequest();
//		http.csrf().disable()
//		.authorizeRequests().anyRequest().authenticated()
//		.and()
//		.httpBasic();
//	}
//	}
//	
//	
