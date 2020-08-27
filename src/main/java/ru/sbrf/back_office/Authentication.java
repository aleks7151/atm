package ru.sbrf.back_office;

import ru.sbrf.atm.User;

import java.util.HashMap;
import java.util.Map;

public class Authentication {
    private String numberCard;
    private String scanerFinger;
    private String clock;

    public Authentication(User user, String numberCard, String scanerFinger, String clock){
        this.numberCard = validateNC(numberCard);
        this.scanerFinger = validateSF(scanerFinger);
        this.clock = validateC(clock);
        try {
            Map<String, User> map = getMyHashMap();
            map.put(getKey(), user);
        }
        catch (Exception e){System.out.println("No(");}
    }

    private String getKey(){
        String numberCard = "", scanerFinger = "", clock = "";
        if (this.numberCard != null)
            numberCard = this.numberCard;
        if (this.scanerFinger != null)
            scanerFinger = this.scanerFinger;
        if (this.clock != null)
            clock = this.clock;
        return numberCard + "|" + scanerFinger + "|" + clock;
    }

    private Map<String, User> getMyHashMap() throws Exception{
        return new HashMap<String, User>();
    }

    private String validateNC(String numberCard){
        return numberCard;
    }

    private String validateSF(String scanerFinger){
        return scanerFinger;
    }

    private String validateC(String clock){
        return clock;
    }

    public void authentication(){
    }
}
