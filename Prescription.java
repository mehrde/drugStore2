package com.mftvanak.j2se.alizadeh.drugStore;

public class Prescription {

    private Drug[] prescription;
    private double prescriptionPrice;

    public Drug[] getPrescription() {
        return prescription;
    }

    public void setPrescription(Drug[] prescription) {
        this.prescription = prescription;
    }

    public double getPrescriptionPrice() {
        return prescriptionPrice;
    }

    public void setPrescriptionPrice(double prescriptionDrugsPrice) {
        this.prescriptionPrice = prescriptionDrugsPrice;
    }
}
