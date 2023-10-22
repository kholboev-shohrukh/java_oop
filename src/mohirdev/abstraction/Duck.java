package mohirdev.abstraction;

public class Duck extends Animal{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " - quack quack");
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
