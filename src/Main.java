import inheritance.Doctor;
import inheritance.Lor;
import inheritance.Xirurg;
import polymorphism.overriding.Animal;
import polymorphism.overriding.Cat;
import polymorphism.overriding.Dog;
import polymorphism.overriding.Duck;

public class Main {
    public static void main(String[] args) {
        Doctor xirurg = new Xirurg("Akmal", 32, 4);
        xirurg.information();
        Doctor lor = new Lor("Akmal", "Hospital", 4);
        lor.information();

        Animal dog = new Dog("Rex");
        dog.sound();
        Animal duck = new Duck("Goose");
        duck.sound();
        Animal cat = new Cat("Pet");
        cat.sound();
    }
}