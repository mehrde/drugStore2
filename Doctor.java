package com.mehrde.DrugStore2;

public class Doctor {

    private String name;
    private Drug[] drugs;

    public Doctor (String name){
        setName(name);
    }

    public Prescription writePrescriptions(Drug... drugs){

        Prescription prescription1 = new Prescription();
        prescription1.setPrescription(drugs);
        return prescription1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
