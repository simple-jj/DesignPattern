package FactoryPattern;

public class Demo {

    public static void main(String[] args) {
        Factory factory =new Factory();
        Draw a = factory.getDraw("dog");
        Draw b = factory.getDraw("cat");
        a.draw();
        b.draw();
    }
}
