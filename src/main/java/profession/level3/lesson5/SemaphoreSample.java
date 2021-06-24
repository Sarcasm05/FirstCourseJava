package main.java.profession.level3.lesson5;

import java.time.LocalDateTime;
import java.util.concurrent.Semaphore;

public class SemaphoreSample {
    public static void main(String[] args) {
        Semaphore semaphore  = new Semaphore(3);
        for (int i = 1; i <= 5; i++) {
            final int w = i;
            new Thread(()-> {
                System.out.println("Поток " + w + " остановился перед семафором");
                try {
                    Thread.sleep(1000);
                    semaphore.acquire();
                    System.out.printf("Поток " + w + " занял семафор:%s\n", LocalDateTime.now());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                    System.out.println("Поток " + w + " освободил семафор");
                }
            }).start();
        }
    }
}
