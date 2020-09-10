package ru.sbrf.atm;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Atm {
    private static final int MAX;
    static {
        MAX = 1000;
    }

    private int attendance;

    public Atm(){
        attendance = 0;
    }

    public Atm(int attendance){
        this.attendance = attendance;
    }

    public boolean plusAttendance(){
        if (attendance >= MAX)
            return false;
        attendance++;
        return true;
    }
}
