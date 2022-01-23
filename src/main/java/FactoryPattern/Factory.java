package FactoryPattern;

import java.util.Objects;

public class Factory {

    public Draw getDraw(String s){
        if(Objects.equals(s, "cat")){
            return new Cat();
        }
        if(Objects.equals(s,"dog")){
            return new Dog();
        }
        return null;
    }
}
