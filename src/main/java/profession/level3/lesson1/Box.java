package main.java.profession.level3.lesson1;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    public ArrayList<Fruit> container;
    private Float weight;

    public Box(){
        this.container = new ArrayList<>();
        this.weight = 0.0f;
    }

    public void addItem(Fruit item){
        container.add(item);
        if (item instanceof Apple){
            weight += 1.0f;
        }else if (item instanceof Orange){
            weight += 1.5f;
        }
    }

    public Float getWeight(){
        return weight;
    }

    public boolean compare(Box<?> another){
        return weight.equals(another.weight); //будет работать если weight всегда типа Float
    }

    public void pour(Box<?> secondBox){ //надо сделать проверку на тип фрукта
        secondBox.container.clear();
        secondBox.weight = 0.0f;
        for (Fruit s: container) {
            secondBox.addItem(s);
        }
        container.clear();
        weight = 0.0f;
    }
}
