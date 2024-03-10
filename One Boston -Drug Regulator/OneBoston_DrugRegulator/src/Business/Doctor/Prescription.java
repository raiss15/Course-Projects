/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import java.util.Date;

/**
 *
 * @author nisha
 */
public class Prescription {
    private int numberOfDosesInDay;
    private int numberOfDays;
    private String diagnoseOfDisease;
    private String medicine;

    private Date dateOfPrescription;
    private String network;

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }
    
    

    public Date getDateOfPrescription() {
        return dateOfPrescription;
    }

    public void setDateOfPrescription(Date dateOfPrescription) {
        this.dateOfPrescription = dateOfPrescription;
    }
    
    

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
    
    

    public String getDiagnoseOfDisease() {
        return diagnoseOfDisease;
    }

    public void setDiagnoseOfDisease(String diagnoseOfDisease) {
        this.diagnoseOfDisease = diagnoseOfDisease;
    }
    

   
    public int getNumberOfDosesInDay() {
        return numberOfDosesInDay;
    }

    public void setNumberOfDosesInDay(int numberOfDosesInDay) {
        this.numberOfDosesInDay = numberOfDosesInDay;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
    
}
