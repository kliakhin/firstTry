package entity;

public class World {

    private String name;
    private Animal animal;

    public World() {
    }

    public World(String name) {
        this.name = name;
    }


    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void writeAnimal() {
        System.out.println(animal.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
