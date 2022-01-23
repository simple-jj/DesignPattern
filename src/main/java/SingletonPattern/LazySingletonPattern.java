package SingletonPattern;

/*
*  懒汉型单例，加锁保证线程安全，节约内存，但是效率低
* */
public class LazySingletonPattern {

    private static LazySingletonPattern instance;

    private LazySingletonPattern(){

    }

    public static synchronized LazySingletonPattern getInstance(){
        if(instance!=null){
            instance = new LazySingletonPattern();
        }
        return instance;
    }
}
