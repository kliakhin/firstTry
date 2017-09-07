package entity;

import org.springframework.context.annotation.Bean;

public class Animal {

    public String name = "name";
    public String age = "dgds";

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void init() {
        System.out.println("I'm initialising");
    }

    public void destroy() {
        System.out.println("Buy buy!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
