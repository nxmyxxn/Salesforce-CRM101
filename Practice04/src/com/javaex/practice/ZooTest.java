package src.com.javaex.practice;

public class ZooTest {
    public static void main(String[] args) {
        Animal tiger = new Tiger("Tiggy");
        Animal duck = new Duck("Ducky");
        Animal shark = new Shark("Sharky");

        tiger.eat();
        tiger.makeSound();

        duck.eat();
        duck.makeSound();
        ((Swimmable) duck).swim();
        ((Flyable) duck).fly();

        shark.eat();
        shark.makeSound();
        ((Swimmable) shark).swim();
    }
}
