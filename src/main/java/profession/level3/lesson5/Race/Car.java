package main.java.profession.level3.lesson5.Race;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Car implements Runnable {
    private static final AtomicInteger CARS_COUNT;
    static {
        CARS_COUNT = new AtomicInteger(0);
    }

    private Race race;
    private int speed;
    private String name;
    private CyclicBarrier cyclicBarrier;
    private CountDownLatch startCountDown;
    private CountDownLatch finishCountDown;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed, CyclicBarrier cyclicBarrier, CountDownLatch startCountDown, CountDownLatch finishCountDown) {
        this.race = race;
        this.speed = speed;
        this.cyclicBarrier = cyclicBarrier;
        this.startCountDown = startCountDown;
        this.finishCountDown = finishCountDown;
        CARS_COUNT.incrementAndGet();
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            startCountDown.countDown();
            cyclicBarrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        if (checkWin()){
            System.out.println(this.name + "WIN");
        }
    }

    private boolean checkWin(){
        synchronized (CARS_COUNT) {
            finishCountDown.countDown();
            return finishCountDown.getCount() + 1 == CARS_COUNT.get();
        }
    }

}
