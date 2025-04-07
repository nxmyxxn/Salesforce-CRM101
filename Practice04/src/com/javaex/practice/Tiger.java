package src.com.javaex.practice;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " roars!");
    }
}
