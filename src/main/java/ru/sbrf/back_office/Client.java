package ru.sbrf.back_office;

public class Client {
    private Account account;
    private int solvency;


    public Client(){
        this(new Account(), 0);
    }

    public Client(Account account){
        this(account, 0);
    }

    public Client(int solvency){
        this(new Account(), solvency);
    }

    public Client(Account account, int solvency){
        this.account = account;
        this.solvency = solvency;
    }
}
