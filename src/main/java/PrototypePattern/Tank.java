package PrototypePattern;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**

 * @author  鲁靖

 * @create  2022/1/23 21:20

 * @desc    实现Object自带的clone

 **/
@Setter
@Getter
@ToString
public class Tank implements Cloneable{
    private String name;
    private Type type;

    public Tank(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public Tank() {
        this.name = "路战虎111"+Math.random();
        this.type = new Type("背景"+Math.random());
    }

    @Override
    protected Object clone()  {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return new Tank(this.name,this.type);
    }
}
