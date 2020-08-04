package ru.sbrf.atm;

public class User {
    private static final int MAX_AGE;
    static{
        MAX_AGE = 122;
    }
    private String name;
    private int age;

    public User(){
        this("default", 18);
    }

    public User(String name){
        this(name, 18);
    }

    public User(int age){
        this("default", age);
    }

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean birthday(){
        if (age >= MAX_AGE)
            return false;
        age++;
        return true;
    }
}
