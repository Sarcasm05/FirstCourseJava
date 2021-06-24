package main.java.profession.level3.lesson5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SamplestLockApp {
    public static void main(String[] args) {
        final Lock lock = new ReentrantLock();
        for (int i = 0; i < 5; i++) {
            int w = i;
            new Thread(() -> {
                try {
                    System.out.println("Поток " + w + " подошел к точке синхронизации");
                    lock.lock();
                } finally {
                    lock.unlock();
                }
            }).start();
        }
    }
}
