// Abstract class Animal
abstract class Animal {
    abstract void sound();
}

// Interface Printable
interface Printable {
    void print();
}

// Concrete class Dog extends Animal and implements Printable
class Dog extends Animal implements Printable {
    @Override
    void sound() {
        System.out.println("Woof!");
    }

    @Override
    public void print() {
        System.out.println("Dog");
    }
}

// Concrete class Cat extends Animal and implements Printable
class Cat extends Animal implements Printable {
    @Override
    void sound() {
        System.out.println("Meow!");
    }

    @Override
    public void print() {
        System.out.println("Cat");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of animals
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call sound() method
        dog.sound(); // Output: Woof!
        cat.sound(); // Output: Meow!

        // Call print() method
        ((Printable) dog).print(); // Output: Dog
        ((Printable) cat).print(); // Output: Cat
    }
}
