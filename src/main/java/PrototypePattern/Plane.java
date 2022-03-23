package PrototypePattern;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**

 * @author  鲁靖

 * @create  2022/1/23 20:51

 * @desc 原型类的具体实现

 **/
@Setter
@Getter
@ToString
public class Plane implements Prototype{

    public Plane() {
        this.name = "飞机"+Math.random();
        this.type = "波音"+Math.random();
    }

    public Plane(String name, String type) {
        this.name = name;
        this.type = type;
    }

    private String name;
    private String type;

    @Override
    public Prototype clone(){
        return new Plane(this.name,this.type);
    }
}
