package src.com.javaex.practice;

//추상 클래스라 반드시 makeSound() 오버라이딩 해야 함.
public abstract class Animal{
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public abstract void makeSound();
}