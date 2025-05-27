// Interface: defines sound behavior
interface Sound {
    void makeSound();
}

// Abstract class: base class for all animals
abstract class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void move();

    // Concrete method
    public void showName() {
        System.out.println("Animal Name: " + name);
    }
}

// Subclass: Dog extends Animal and implements Sound
class Dog extends Animal implements Sound {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }

    @Override
    void move() {
        System.out.println("Dog runs.");
    }
}

// Subclass: Cat extends Animal and implements Sound
class Cat extends Animal implements Sound {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }

    @Override
    void move() {
        System.out.println("Cat walks gracefully.");
    }
}

// Main class
public class Abstruction {
    public static void main(String[] args) {
        Animal dog = new Dog("Buggy");
        dog.showName();
        ((Sound) dog).makeSound();
        dog.move();

        System.out.println();

        Animal cat = new Cat("Whiskers");
        cat.showName();
        ((Sound) cat).makeSound();
        cat.move();
    }
}