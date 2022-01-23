package AbstractFactoryPattern;

import AbstractFactoryPattern.study.Study;

public class Demo {
    public static void main(String[] args) {
        AbstractFactory abstractFactory =Factory.getFactory("catRead");
        Study study = abstractFactory.getStudy("");
        study.study();
    }
}
