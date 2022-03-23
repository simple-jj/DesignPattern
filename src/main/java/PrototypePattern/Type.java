package PrototypePattern;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Type {
    private String type;

    public Type(String type) {
        this.type = type;
    }
    public Type() {
    }
}
