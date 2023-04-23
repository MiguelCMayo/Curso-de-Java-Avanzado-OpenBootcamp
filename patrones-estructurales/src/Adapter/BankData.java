package Adapter;

public class BankData {

    private int account;
    private String name;
    private double balance;

    public BankData(int account, String name, double balance) {
        this.account = account;
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public int getAccount() {
        System.out.println(account);
        return account;
    }

    public double getBalance() {
        System.out.println(balance);
        return balance;
    }

}
