package main.java.profession.level1.lesson6;

public class Dog extends Animal{
    private final int MAX_DISTANCE_RUN = 500;
    private final int MAX_DISTANCE_SWIM = 10;
    private static int counter = 0;
    public  Dog(String name){
        super(name);
        counter++;
    }


    public static void printCount() {
        System.out.println("Вы создали " + counter + " собак");
    }

    @Override
    protected void run(int length) {
        if (length < MAX_DISTANCE_RUN)
            super.run(length);
        else {
            System.out.println(name + " не смог(ла) пробежать больше " + MAX_DISTANCE_RUN + " метров");
        }
    }

    @Override
    protected void swim(int length) {
        if (length < MAX_DISTANCE_SWIM)
            super.swim(length);
        else {
            System.out.println(name + " не смог(ла) проплыть больше " + MAX_DISTANCE_SWIM + " метров");
        }
    }
}
