package com.mehrde.DrugStore2;

public class POS {

    private String bankName;

    public POS (String bankName){
        setBankName(bankName);
    }

    public  POS (){

    }

    public boolean withdraw (Account account , double amount){
        if (isAmountValid(amount,account)){
            account.setBalance(account.getBalance()-amount);
            System.out.println("Your bank account balance withdraw " + amount + " tomans");
            return true;
        } else {
            System.out.println("Your bank account balance is not enough !");
            return false;
        }
    }


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public boolean isAmountValid (double amount , Account account){
        return amount <= account.getBalance();
    }
}
