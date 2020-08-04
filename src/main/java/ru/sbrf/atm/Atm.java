package ru.sbrf.atm;

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

    public int getAttendance(){
        return attendance;
    }

    public boolean plusAttendance(){
        if (attendance >= MAX)
            return false;
        attendance++;
        return true;
    }
}
