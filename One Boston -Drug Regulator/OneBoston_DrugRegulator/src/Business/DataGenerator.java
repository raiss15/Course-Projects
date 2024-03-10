/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Doctor.Prescription;
import Business.Organization.AdminOrganization;
import java.util.Random;

/**
 *
 * @author bhagyatrivedi
 */
public class DataGenerator {
    
    private static Random rand = new Random();
    private static String[] network = {"Roxbury", "Mass Avenue", "Dorchester"};
    private static String[] hospitals = {"Mass general","Boston Medical Center","Tuft's Medical"};
    private static String[] orgs = {"Doctor", "Lab", "Pharmacy", "Drug", "Chemical"};
    private static String[] medicines = {"atorvastatin", "levothyroxine", "lisinopril", "metformin", "metoprolol", "amlodipine", "albuterol", "omeprazole"};
    private static String[] diseaseName = {"diseaseCannbis","diseaseFentanyl","diseaseMDMA","diseaseSteroids","diseaseCocaine","diseaseHeroine","diseaseHallucinogens","diseaseLSD"};
    private static String[] drugCompounds = {"Cannabis","Fentanyl","MDMA","Steroids","Cocaine","Heroine","Hallucinogens","LSD","Benzos","Alcohol"};
    
    public static String generateNetwork() {
        return network[rand.nextInt(network.length)];
    }
    
     public static String createHospitals() {
        return hospitals[rand.nextInt(hospitals.length)];
    }
     
      public static String createOrgs() {
        return orgs[rand.nextInt(orgs.length)];
    }
      
    public static String createMedicines() {

        return medicines[rand.nextInt(medicines.length)];

    }
    
     public static String createDiseases() {

        return diseaseName[rand.nextInt(diseaseName.length)];

    }
     
    public static String createDrugCompounds() {

        return drugCompounds[rand.nextInt(drugCompounds.length)];

    }
     
     public static Prescription initializeMedicines() {
        Prescription prescription = new Prescription();
        prescription.setMedicine(createMedicines());
        prescription.setNetwork(generateNetwork());
        return prescription;
    }
    public static Prescription initializeDiseases() {
        Prescription prescription = new Prescription();
        prescription.setNetwork(generateNetwork());
        prescription.setDiagnoseOfDisease(createDiseases());
        return prescription;
    }
     
     public static AdminOrganization initializeOrgs() {
        AdminOrganization admin = new AdminOrganization();
        admin.setOrganisationName(createOrgs());
        return admin;
    }    
}
