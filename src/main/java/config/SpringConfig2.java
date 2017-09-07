package config;

import entity.World;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig2 {

    @Bean
    public World getWorld() {
        World world = new World();
        world.setName("world1");
        return world;
    }
}
