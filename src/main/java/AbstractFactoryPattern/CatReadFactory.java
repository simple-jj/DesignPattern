package AbstractFactoryPattern;

import AbstractFactoryPattern.draw.Cat;
import AbstractFactoryPattern.draw.Draw;
import AbstractFactoryPattern.study.Read;
import AbstractFactoryPattern.study.Study;

public class CatReadFactory extends AbstractFactory {

    @Override
    public Draw getDraw(String s) {
        return new Cat();
    }

    @Override
    public Study getStudy(String s) {
        return new Read();
    }
}
