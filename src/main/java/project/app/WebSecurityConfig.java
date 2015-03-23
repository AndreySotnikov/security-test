package project.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

import javax.sql.DataSource;

/**
 * Created by andrey on 23.03.15.
 */
@Configuration
@EnableWebMvcSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                    .antMatchers("/", "/aa/home", "/aa/register").permitAll()
                    .anyRequest().authenticated()
                .and()
                .formLogin()
                    .loginPage("/aa/loginuser").defaultSuccessUrl("/aa/home",false).failureUrl("/aa/fail")
                .permitAll()
                .and()
                    .logout()
                    .logoutUrl("/aa/logout").logoutSuccessUrl("/aa/home")
                .permitAll()
                .and()
                .httpBasic();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery(
                        "select username,password, enabled from users where username=?")
                .authoritiesByUsernameQuery(
                        "select username, role from user_roles where username=?");

//        auth
//                .inMemoryAuthentication()
//                .withUser("user").password("password").roles("USER");
    }
}
