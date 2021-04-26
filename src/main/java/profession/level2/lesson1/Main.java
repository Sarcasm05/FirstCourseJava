package main.java.profession.level2.lesson1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> participants = new ArrayList<>();
        participants.add(new Cat("Лео"));
        participants.add(new Man("Рустам"));
        participants.add(new Robot("Xiaomi"));

        ArrayList<Object> obstacles = new ArrayList<>();
        obstacles.add(new Wall(10));
        obstacles.add(new Road(16));

        for (Object atlet: participants) {
            for (Object obstacle: obstacles) {
                if (atlet instanceof Runnable && obstacle instanceof Road){
                    ((Runnable) atlet).run(((Road) obstacle).getLength());
                }
                if (atlet instanceof Jumpable && obstacle instanceof Wall){
                    ((Jumpable) atlet).jump(((Wall) obstacle).getHeight());
                }
            }
        }
    }
}
