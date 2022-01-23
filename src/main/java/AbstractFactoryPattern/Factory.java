package AbstractFactoryPattern;

import java.util.Objects;

public class Factory {
    public static AbstractFactory getFactory(String s){
        if(Objects.equals(s,"dogHomeWork")){
            return new DogHomeWorkFactory();
        }
        if(Objects.equals(s,"catRead")){
            return new CatReadFactory();
        }
        return null;
    }
}
