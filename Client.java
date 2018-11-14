package com.mehrde.DrugStore2;

public class Client {
    private Account account;

    public Client (Account account){
        setAccount(account);
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
