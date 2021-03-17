package main.java.profession.level1.lesson7;

public class MainClass {
    public static void main(String[] args) {
        Cat[] catsArr = new Cat[5];
        catsArr[0] = new Cat("Барсик", 1);
        catsArr[1] = new Cat("Леня", 2);
        catsArr[2] = new Cat("Филя", 3);
        catsArr[3] = new Cat("Лео", 4);
        catsArr[4] = new Cat("Муртуз", 5);
        Plate plate = new Plate(10);
        for (Cat cat: catsArr) {
            cat.eat(plate);
            plate.info();
        }
        plate.addFood(40);
        plate.info();
        catsArr[0].eat(plate);
        plate.info();
        catsArr[4].eat(plate);
        plate.info();
    }
}
