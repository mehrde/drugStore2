package com.mftvanak.j2se.alizadeh.drugStore;

public class Account {

    private String name;
    private String family;
    private double balance;

    public Account(String name, String family , double balance ){
        setName(name);
        setFamily(family);
        setBalance(balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
