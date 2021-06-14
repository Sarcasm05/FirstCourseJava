package main.java.profession.level3.lesson4;

public class WaitNotifyClass {
    private final Object monitor = new Object();
    private volatile char currentChar = 'A';
    public static void main(String[] args) {
        WaitNotifyClass waitNotifyObj = new WaitNotifyClass();
        Thread thread0 = new Thread(waitNotifyObj::printA);
        Thread thread1 = new Thread(waitNotifyObj::printB);
        Thread thread2 = new Thread(waitNotifyObj::printC);
        thread0.start();
        thread1.start();
        thread2.start();
    }

    public void printA(){
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentChar != 'A') {
                        monitor.wait();
                    }
                    System.out.print("A");
                    currentChar = 'B';
                    monitor.notifyAll();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void printB(){
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentChar != 'B') {
                        monitor.wait();
                    }
                    System.out.print("B");
                    currentChar = 'C';
                    monitor.notifyAll();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void printC(){
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentChar != 'C') {
                        monitor.wait();
                    }
                    System.out.print("C");
                    currentChar = 'A';
                    monitor.notifyAll();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}