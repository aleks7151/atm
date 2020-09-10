package ru.sbrf.back_office;

import static ru.sbrf.back_office.Currency.RUR;

public class Bank {
    private Client<String> client;
    private Currency currency;

    public Bank(){
        this(new Client<String>(), RUR);
    }

    public Bank(Client<String> client){
        this(client, RUR);
    }

    public Bank(Currency currency){
        this(new Client<String>(), currency);
    }

    public Bank(Client<String> client, Currency currency){
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
