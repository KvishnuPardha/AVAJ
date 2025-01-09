abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void sound();
    
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}
             
class Dog extends Animal {
    public void sound() {
        System.out.println("Woof");
    }
}

class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
        myDog.sleep();
    }
}
