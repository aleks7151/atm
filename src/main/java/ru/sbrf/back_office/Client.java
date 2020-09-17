package ru.sbrf.back_office;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Client<P> {
    private Account account;
    private int solvency;
    Map<String,P> accS;
    Map<String,P> accC;


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
        save(accS);
        current(accC);
    }

    private void save(Map<String, P> accS){
        //Действия
    }

    private void current(Map<String, P> accC){
        //Действия
    }
}
