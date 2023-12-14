package pro.entities;

import pro.interfaces.InterfaceAccount;

public abstract class Account implements InterfaceAccount {

    private static final int DEFAULT_BRANCH = 1;
    private static int SEQUENTIAL = 1;

    protected int branch;
    protected int number;
    protected double balance;
    protected Client client;

    public Account(Client client) {
        this.branch = Account.DEFAULT_BRANCH;
        this.number = SEQUENTIAL++;
        this.client = client;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void transfer(double amount, InterfaceAccount destinationAccount) {
        this.withdraw(amount);
        destinationAccount.deposit(amount);
    }

    public int getBranch() {
        return branch;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    protected void printCommonInfo() {
        System.out.println(String.format("Titular: %s", this.client.getName()));
        System.out.println(String.format("Agencia: %d", this.branch));
        System.out.println(String.format("Numero: %d", this.number));
        System.out.println(String.format("Saldo: %.2f", this.getBalance()));
    }

}
