package ru.sbrf.back_office;

import ru.sbrf.atm.User;

public class Account {
    private User user;
    private String mail;

    public Account(){
        this(new User(), "default@mail.ru");
    }

    public Account(User user){
        this(user, "default@mail.ru");
    }

    public Account(String mail){
        this(new User(), mail);
    }

    public Account(User user, String mail){
        this.user = user;
        this.mail = mail;
    }
}
