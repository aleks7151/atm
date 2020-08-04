package ru.sbrf.back_office;

import static ru.sbrf.back_office.Currency.RUR;

public class Bank {
    private Client client;
    private Currency currency;

    public Bank(){
        this(new Client(), RUR);
    }

    public Bank(Client client){
        this(client, RUR);
    }

    public Bank(Currency currency){
        this(new Client(), currency);
    }

    public Bank(Client client, Currency currency){
        this.client = client;
        this.currency = currency;
    }

    public boolean changeCurrency(Currency currency){
        if (this.currency == currency)
            return false;
        this.currency = currency;
        return true;
    }
}
