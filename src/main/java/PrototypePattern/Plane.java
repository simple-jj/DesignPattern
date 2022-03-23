package PrototypePattern;
/**

 * @author  鲁靖

 * @create  2022/1/23 20:51

 * @desc 原型类的具体实现

 **/
public class StudyPrototype implements Prototype{
    
    @Override
    public void doSomething() {
        System.out.println("这个是学习的原型类new ");
    }

    @Override
    public Prototype clone(){
        return new StudyPrototype();
    }
}
