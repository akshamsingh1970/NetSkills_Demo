package NetSkills_Demo.codes;
class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog is eating.");
    }
    
    public void bark() {
        System.out.println("Dog is barking.");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("Cat is eating.");
    }
    
    public void meow() {
        System.out.println("Cat is meowing.");
    }
}

public class test {
    public static void main(String[] args) {
        // Upcasting
        Animal animal = new Dog();
        animal.eat(); // Output: Dog is eating.
        
        // Downcasting
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bark(); // Output: Dog is barking.
        }
        
        // Downcasting
        animal = new Cat();
        animal.eat(); // Output: Cat is eating.
        
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.meow(); // Output: Cat is meowing.
        }
    }
}
