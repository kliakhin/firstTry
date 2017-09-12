package com.test.bu.config;


import com.test.bu.dao.UserDao;
import com.test.bu.dao.UserDaoIml;
import com.test.bu.service.UserService;
import com.test.bu.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfig {

    @Bean
    public UserService getUserService() {
        return new UserServiceImpl();
    }

    @Bean
    public UserDao getUserDaoIml() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return new UserDaoIml(dataSource);
    }

}
