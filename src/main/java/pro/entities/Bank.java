package pro.entities;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class Bank {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private List<Account> accounts;
}
