package main.java.profession.level3.lesson5;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchSample {
    public static void main(String[] args) throws InterruptedException {
        final int THREAD_COUNT = 4;
        CountDownLatch countDownLatch = new CountDownLatch(THREAD_COUNT);
        for (int i = 0; i < THREAD_COUNT; i++) {
            int w = i;
            new Thread(() -> {
                try {
                    Thread.sleep(1000 + new Random().nextInt(5000));
                    System.out.printf("Поток %s завершил подготовку %s \n", w, LocalDateTime.now());
                    countDownLatch.countDown();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }).start();
        }
        boolean result = countDownLatch.await(7, TimeUnit.SECONDS);
        if (result){
            System.out.println("Все потоки вызвали метод countDown");
        }else {
            System.out.println("Не все потоки вызвали метод countDown");
        }
        System.out.println("Главный поток дождался своих работников");
    }
}
