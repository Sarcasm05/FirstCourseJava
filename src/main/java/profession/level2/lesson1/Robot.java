package main.java.profession.level2.lesson1;

public class Robot implements Swimmable, Runnable{
    @Override
    public void run() {
        System.out.println("Робот бежит спотыкается");;
    }

    @Override
    public void swim() {
        System.out.println("Робот плывет чутка тонет");
    }
}
