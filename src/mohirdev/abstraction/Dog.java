package mohirdev.abstraction;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " - bow bow");
    }

    @Override
    public String sayHello() {
        return null;
    }

    @Override
    public String run() {
        return null;
    }
}
