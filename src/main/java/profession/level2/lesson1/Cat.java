package main.java.profession.level2.lesson1;

public class Cat implements Swimmable, Runnable{
    @Override
    public void run() {
        System.out.println("Кот бежит очень тихо");
    }

    @Override
    public void swim() {
        System.out.println("Котик плывет не любя");
    }
}
