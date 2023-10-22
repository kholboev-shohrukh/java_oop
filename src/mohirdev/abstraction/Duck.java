package mohirdev.abstraction;

public class Duck extends Animal{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " - quack quack");
    }
}
