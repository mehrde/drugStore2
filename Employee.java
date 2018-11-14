package com.mehrde.DrugStore2;

public class Employee {

    private String name;

    public Employee(String name){
        setName(name);
    }

    public void calculatePrescriptionPrice(Prescription prescription){
        double totalPrice = 0;
        for (Drug drug : prescription.getPrescription()) {
            totalPrice += drug.getPrice();
        }
        prescription.setPrescriptionPrice(totalPrice);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
