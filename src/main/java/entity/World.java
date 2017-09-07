package entity;

public class World {

    private Animal animal;

    public World() {
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
}
