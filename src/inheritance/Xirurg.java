package inheritance;

import inheritance.Doctor;

public class Xirurg extends Doctor {

    private String name;
    private int age;
    private int experience;

    public Xirurg(String name, int age, int experience, String name1, int age1, int experience1) {
        super(name, age, experience);
        this.name = name1;
        this.age = age1;
        this.experience = experience1;
    }

    public Xirurg(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void information(){
        System.out.println("Name: " + name + " Age: " + age + " Experience: " + experience);
    }
}
