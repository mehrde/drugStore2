package com.mehrde.DrugStore2;

public class Store {
    private int storeCapacity;
    private Drug[] drugs;
    int i = 0;

    public Store (int storeCapacity){
        setStoreCapacity(storeCapacity);
        drugs = new Drug[getStoreCapacity()];
    }

    public Drug[] getDrugs() {
        return drugs;
    }

    public void setDrugs(Drug drug) {
        drugs[i] = drug;
        i++;
    }

    public int getStoreCapacity() {
        return storeCapacity;
    }

    public void setStoreCapacity(int storeCapacity) {
        this.storeCapacity = storeCapacity;
    }
}
