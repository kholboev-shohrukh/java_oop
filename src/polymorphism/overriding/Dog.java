package polymorphism.overriding;

import polymorphism.overriding.Animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " - bow bow");
    }
}
