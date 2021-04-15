package main.java.profession.level2.lesson1;

public class Man extends Entity implements Swimmable, Runnable{

    public Man(String name, int runlenght, int jumpheight){
        super(name, runlenght, jumpheight);
    }

    @Override
    public void run() {
        System.out.println("Человек бежит отлично");
    }

    @Override
    public void swim() {
        System.out.println("Человек плывет хорошо");
    }
}
