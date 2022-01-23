package AbstractFactoryPattern;

import AbstractFactoryPattern.draw.Dog;
import AbstractFactoryPattern.draw.Draw;
import AbstractFactoryPattern.study.HomeWork;
import AbstractFactoryPattern.study.Study;

public class DogHomeWorkFactory extends AbstractFactory {

    @Override
    public Draw getDraw(String s) {
       return new Dog();
    }

    @Override
    public Study getStudy(String s) {
       return new HomeWork();
    }
}
