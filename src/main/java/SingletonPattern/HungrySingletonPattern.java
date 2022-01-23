package SingletonPattern;

/*
*  饿汉型单例模式：1.拥有一个私有的构造方法，防止被其他类实例化，2.拥有一个静态的方法用来返回单例
*  问题：线程安全，但是浪费内存，即我还没使用你就已经创建了该单例对象
* */
public class HungrySingletonPattern {
    //构造唯一的静态实例
    private static final HungrySingletonPattern instance = new HungrySingletonPattern();
    //私有构造方法
    private HungrySingletonPattern(){}
    //提供静态放回实例方法
    public static HungrySingletonPattern getInstance(){
        return instance;
    }
}
