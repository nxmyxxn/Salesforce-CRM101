package src.com.javaex.practice;

public class Duck extends Animal implements Swimmable, Flyable{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says Quack!");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying over the lake.");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming in the pond.");
    }
}
