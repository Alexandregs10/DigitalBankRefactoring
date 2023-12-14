package pro;

import pro.entities.Client;
import pro.entities.Account;
import pro.entities.CurrentAccount;
import pro.entities.SavingsAccount;

public class Main {

    public static void main(String[] args) {
        Client user = new Client();
        user.setName("Venilton");

        Account cc = new CurrentAccount(user);
        Account savings = new SavingsAccount(user);

        cc.deposit(100);
        cc.transfer(100, savings);

        cc.printStatement();
        savings.printStatement();
    }

}
