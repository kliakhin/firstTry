package entity;

public class Animal {

    private String name;
    private String age;
    private String lastName;
    private int age2;

    public Animal() {
    }

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }


    public void writeName() {
        System.out.println("My name is " + name + ", and age = " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge2(int age2) {
        this.age2 = age2;
    }

    public int getAge2() {
        return age2;
    }
}
