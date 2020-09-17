package ru.sbrf.back_office;

import org.springframework.stereotype.Component;
import ru.sbrf.atm.User;

@Component
public class Account {
    private User user;
    private String mail;
    private Authentication authentication;

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
        authentication = new Authentication(user, getCard(), null, null);
    }

    private String getCard(){
        return "123";
    }
}
