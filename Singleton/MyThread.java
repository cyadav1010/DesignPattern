package Singleton;

public class MyThread implements Runnable {
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+ singleton.hashCode());
    }
}
