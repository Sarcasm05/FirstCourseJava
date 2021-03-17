package main.java.profession.level1.lesson7;


public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void info() {
        System.out.println("На тарелке " + food + " единиц еды");
    }
    public void addFood(int count){
        food += count;
    }
    public int getFood() {
        return food;
    }
}

