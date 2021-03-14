package main.java.profession.level1.lesson6;

public class Zoo {
    public static void main(String[] args) {
        Dog bobik = new Dog("Бобик");
        Dog bobik2 = new Dog("Бобик2");
        Dog bobik3 = new Dog("Бобик3");
        Cat barsik = new Cat("Барсик");
        Cat barsik2 = new Cat("Барсик2");
        bobik.run(42);
        bobik2.run(4213);
        bobik.swim(5);
        bobik2.swim(11);
        barsik.run(42);
        barsik2.run(4213);
        barsik.swim(5);

        Animal.printCountAnimals();
        Dog.printCount();
        Cat.printCount();

    }
}
