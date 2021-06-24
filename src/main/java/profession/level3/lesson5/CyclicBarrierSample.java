package main.java.profession.level3.lesson5;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierSample {
    public static void main(String[] args) {
        final int THREADS_COUNT = 3;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(THREADS_COUNT);
        for (int i = 0; i < THREADS_COUNT; i++) {
            int w = i;
            new Thread(() -> {
                try {
                    System.out.printf("Спортсмен %s начинает подготовку %s \n", w, LocalDateTime.now());
                    Thread.sleep(1000 + new Random().nextInt(2000));
                    System.out.printf("Спортсмен %s закончил подготовку %s \n", w, LocalDateTime.now());
                    cyclicBarrier.await();
                    System.out.printf("Спортсмен %s дождался остальных %s \n", w, LocalDateTime.now());
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
