package Singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest {

    public static void main(String[] args) {

        ExecutorService executorService=null;
        MyThread myThread=new MyThread();
        try{

            executorService = Executors.newFixedThreadPool(2);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        Singleton singleton1 = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//        Singleton singleton3 = Singleton.getInstance();
//        System.out.println("singleton1 = " + singleton1.hashCode());
//        System.out.println("singleton2 = " + singleton2.hashCode());
//        System.out.println("singleton3 = " + singleton3.hashCode());
    }

}
