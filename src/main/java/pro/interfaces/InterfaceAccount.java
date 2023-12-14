package pro.interfaces;

public interface InterfaceAccount {

    void withdraw(double value);

    void deposit(double value);

    void transfer(double value, InterfaceAccount destinationAccount);

    void printStatement();
}