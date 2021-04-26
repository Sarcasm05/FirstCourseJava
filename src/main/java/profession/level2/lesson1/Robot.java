package main.java.profession.level2.lesson1;

public class Robot implements Jumpable, Runnable{
    private String name;
    private int power = 20;

    public Robot(String name) {
        this.name = name;
    }


    @Override
    public boolean run(int lenght) {
        if (lenght <= power) {
            System.out.println("Робот справился с дистанцией");
            return true;
        }else {
            System.out.println("Робот не справился с дистанцией");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= power) {
            System.out.println("Робот справился с высотой");
            return true;
        }else {
            System.out.println("Робот не справился с высотой");
            return false;
        }
    }
}
