package com.mehrde.DrugStore2;

public class DrugStore {

    private String name;

    POS pos = new POS("Melli");

    Employee employee1 = new Employee("Vahidi");

    public DrugStore(String name){
        setName(name);
    }

    public void withdrawDrugsPrice(Client client , Prescription prescription){
        boolean isWithdrawSuccess = pos.withdraw(client.getAccount(),prescription.getPrescriptionPrice());
        if (isWithdrawSuccess){
            System.out.println("Withdraw is successful . This is your drugs ! Take them!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
