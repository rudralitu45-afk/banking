
// Abstract class
abstract class Animal {
    // Abstract method (idea only, no body)
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Child class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Dog d = new Dog();   // object of child class
        d.sound();           // Bark
        d.sleep();           // Sleeping...
    }
}