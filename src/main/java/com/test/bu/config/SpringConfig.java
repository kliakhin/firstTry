package com.test.bu.config;


import com.test.bu.dao.GoodsDao;
import com.test.bu.dao.GoodsDaoImp;
import com.test.bu.dao.UserDao;
import com.test.bu.dao.UserDaoIml;
import com.test.bu.service.GoodsService;
import com.test.bu.service.GoodsServiceImpl;
import com.test.bu.service.UserService;
import com.test.bu.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public UserService getUserService() {
        return new UserServiceImpl();
    }

    @Bean
    public UserDao getUserDao() {
        return new UserDaoIml();
    }

    @Bean
    public GoodsService getGoodsService() {
        return new GoodsServiceImpl();
    }

    @Bean
    public GoodsDao getGoodsDao() {
        return new GoodsDaoImp();
    }

}
