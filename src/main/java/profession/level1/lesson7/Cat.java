package main.java.profession.level1.lesson7;


public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(Plate p) {
        if (fullness) {
            System.out.println(name +" сыт.");
        } else if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            fullness = true;
            System.out.println(name + " поел.");
        } else System.out.println("Для котика " + name + " не хватает еды на тарелке для насыщения, он не будет есть.");
    }
}
