package src.com.javaex.practice;

public class Shark extends Animal implements Swimmable{
    public Shark(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes bubbling sounds.");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming through the ocean.");
    }
}
