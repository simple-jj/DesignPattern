package AbstractFactoryPattern.study;

import AbstractFactoryPattern.study.Study;

public class Read implements Study {
    @Override
    public void study() {
        System.out.println("study by read");
    }
}
