package main.java.profession.level2.lesson1;

public class Cat implements Jumpable, Runnable{
    private String name;
    private int power = 10;

    public Cat(String name) {
        this.name = name;
    }


    @Override
    public boolean run(int lenght) {
        if (lenght <= power) {
            System.out.println("Кот справился с дистанцией");
            return true;
        }else {
            System.out.println("Кот не справился с дистанцией");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= power ) {
            System.out.println("Котик справился с высотой");
            return true;
        }else {
            System.out.println("Котик не справился с высотой");
            return false;
        }
    }
}
