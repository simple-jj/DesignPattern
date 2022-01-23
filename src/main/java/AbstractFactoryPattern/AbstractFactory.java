package AbstractFactoryPattern;

import AbstractFactoryPattern.draw.Draw;
import AbstractFactoryPattern.study.Study;

public abstract class AbstractFactory {
    public abstract Draw getDraw(String s);
    public abstract Study getStudy(String s);
}
