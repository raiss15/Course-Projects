/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.BioChemicalCompound.BioChemicalCompound;
import Business.Doctor.Patient;
import Business.DrugRegulator.DrugRegulator;
import Business.DrugCompounds.DrugCompounds;
import java.util.List;
import java.util.Map;

/**
 *
 * @author sanatpopli
 */
public class DrugWorkRequest extends WorkRequest{
    
    private String drugName;
    private int Quantity;
    private String deliveryTime;
    private Patient patient;
    private Map<DrugCompounds,BioChemicalCompound>drugCompoundChemical;
    private Map<DrugRegulator,List<BioChemicalCompound>>drugChemical;
   
    
   
   
    

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Map<DrugCompounds, BioChemicalCompound> getDrugCompoundChemical() {
        return drugCompoundChemical;
    }

    public void setDrugCompoundChemical(Map<DrugCompounds, BioChemicalCompound> drugCompoundChemical) {
        this.drugCompoundChemical = drugCompoundChemical;
    }

    public Map<DrugRegulator, List<BioChemicalCompound>> getDrugChemical() {
        return drugChemical;
    }

    public void setDrugChemical(Map<DrugRegulator, List<BioChemicalCompound>> drugChemical) {
        this.drugChemical = drugChemical;
    }

    
    @Override
     public String toString(){
       return this.drugName;
        }  
    

    
    
    
    
}
