package main.java.profession.level2.lesson1;

public class Man implements Jumpable, Runnable{
    private String name;
    private int power = 15;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public boolean run(int lenght) {
        if (lenght <= power) {
            System.out.println("Человек справился с дистанцией");
            return true;
        }else {
            System.out.println("Человек не справился с дистанцией");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= power) {
            System.out.println("Человек справился с высотой");
            return true;
        }else {
            System.out.println("Человек не справился с высотой");
            return false;
        }
    }
}
