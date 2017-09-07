package config;


import entity.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.ServiceTest;

@Configuration
public class SpringConfig {

    @Bean
    public Animal getAnimal() {
        Animal animal = new Animal();
        animal.setName("name1");
        animal.setAge("age1");
        return animal;
    }

    @Bean
    public ServiceTest getServiceTest() {
        return new ServiceTest();
    }
}
