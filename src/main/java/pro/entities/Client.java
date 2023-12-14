package pro.entities;

import lombok.*;

public class Client {
    @Getter @Setter
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
