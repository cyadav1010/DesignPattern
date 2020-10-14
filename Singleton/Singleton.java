package Singleton;

public class Singleton {
    private  static Singleton instance;

    private Singleton() {
    }

    public static  Singleton getInstance()  {
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    try{
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    instance=new Singleton();
                }
            }
        }


        return instance;
    }
}
