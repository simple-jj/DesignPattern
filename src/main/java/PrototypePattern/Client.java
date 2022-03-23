package PrototypePattern;

/**
 * @author 鲁靖
 * @create 2022/1/23 20:53
 * @desc 原型模式主要是完成实例的复制工作,当原来的对象难以复制时，可以实现clone方法，在需要被复制的类中去实现。
 **/
public class Client {
    public static void main(String[] args) {
        Plane p1 = new Plane();
        Plane p2 = (Plane) p1.clone();
        System.out.println(p1);
        System.out.println(p2.toString());

        Tank t1 = new Tank();
        Tank t2 = (Tank) t1.clone();
        t1.setType(new Type("test"));
        System.out.println(t1);
        System.out.println(t2.toString());
    }
}
