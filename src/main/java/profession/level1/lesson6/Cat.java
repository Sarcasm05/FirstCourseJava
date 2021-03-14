package main.java.profession.level1.lesson6;

public class Cat extends Animal {
    private final int MAX_DISTANCE = 200;
    private static int counter = 0;
    public Cat(String name){
        super(name);
        counter++;
    }

    public static void printCount() {
        System.out.println("Вы создали " + counter + " кошек");
    }

    @Override
    protected void run(int length) {
        if (length < MAX_DISTANCE)
            super.run(length);
        else {
            System.out.println(name + " не смог(ла) пробежать больше "+ MAX_DISTANCE + " метров");
        }
    }

    @Override
    protected void swim(int length) {
        System.out.println("Котики не умеют плавать :(");
    }
}
