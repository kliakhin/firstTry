package com.test.bu;

import com.test.bu.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.test.bu.service.ServiceTest;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    }
}
