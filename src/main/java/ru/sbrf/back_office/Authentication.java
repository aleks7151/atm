package ru.sbrf.back_office;

public class Authentication {
    private String numberCard;
    private String scanerFinger;
    private String clock;

    public Authentication(String numberCard, String scanerFinger, String clock){
        this.numberCard = validateNC(numberCard);
        this.scanerFinger = validateSF(scanerFinger);
        this.clock = validateC(clock);
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
