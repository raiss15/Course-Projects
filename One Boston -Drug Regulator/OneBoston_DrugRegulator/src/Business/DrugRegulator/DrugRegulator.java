/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DrugRegulator;

import Business.BioChemicalCompound.BioChemicalCompoundList;
import Business.DrugCompounds.DrugCompoundsHistory;

/**
 *
 * @author bhagyatrivedi
 */
public class DrugRegulator {
   
    private int drugId;
    private String drug;
    private BioChemicalCompoundList bioChemList;
    private DrugCompoundsHistory drugCompoundList;
    private static int counter=0;
    
    public DrugRegulator(){
        bioChemList = new BioChemicalCompoundList();
        drugCompoundList = new DrugCompoundsHistory();
        drugId = counter;
        ++counter;
         
    }

    public int getDrugId() {
        return drugId;
    }
    
    public String getDrug() {
        return drug;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }

    public BioChemicalCompoundList getBioChemList() {
        return bioChemList;
    }

    public void setBioChemList(BioChemicalCompoundList bioChemList) {
        this.bioChemList = bioChemList;
    }

    public DrugCompoundsHistory getDrugCompoundList() {
        return drugCompoundList;
    }

    public void setDrugCompoundList(DrugCompoundsHistory drugCompoundList) {
        this.drugCompoundList = drugCompoundList;
    }
    
    
    
    @Override
     public String toString(){
       return this.drug;
        }  
    
}
