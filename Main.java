package com.mehrde.DrugStore2;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Ali" , "Javadi" , 10000);
        Client client = new Client(account);


        Store store = new Store(100);

        Doctor doctor = new Doctor("Abdi");

        DrugStore drugStore = new DrugStore("Vanak Drug Store");

        Drug drug1 = new Drug("antihistamine" , 1000);
        Drug drug2 = new Drug("acetaminophen" , 2000);
        Drug drug3 = new Drug("Lorazepam",1500);

        store.setDrugs(drug1);
        store.setDrugs(drug2);
        store.setDrugs(drug3);

        System.out.println(store.getDrugs()[0].getName() + " price is : "
                            + store.getDrugs()[0].getPrice());
        System.out.println(store.getDrugs()[1].getName() + " price is : "
                + store.getDrugs()[1].getPrice());
        System.out.println(store.getDrugs()[2].getName() + " price is : "
                + store.getDrugs()[2].getPrice());

        Prescription prescription = doctor.writePrescriptions(drug1,drug3);

        drugStore.employee1.calculatePrescriptionPrice(prescription);

        drugStore.withdrawDrugsPrice(client,prescription);

        System.out.println("bye");
    }
}
