package service;

import entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceTest {

    @Autowired
    private Animal animal;

    public String getAnimalName() {
        return animal.getName();
    }
}
