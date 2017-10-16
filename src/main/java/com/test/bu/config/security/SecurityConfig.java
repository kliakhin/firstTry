package com.test.bu.config.security;


import com.test.bu.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserService userDetailsService;


    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/").permitAll()
                /*.antMatchers("/goods/**").access("hasRole('USER') and hasRole('ADMIN')")
                .antMatchers("/**", "/user/**").access("hasRole('ADMIN')")*/
                .and().formLogin()
                .loginPage("/loginPage").permitAll()//.failureUrl("/error_page")
                .usernameParameter("username")
                .passwordParameter("password")
                .and().exceptionHandling().accessDeniedPage("/error_page");
    }
}
