package mohirdev.abstraction;

public abstract class Animal {

    public String name;
    public String colour;
    public int age;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sound();

    public abstract String sayHello();
    public abstract String run();
}
