/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DrugCompounds;

import java.util.ArrayList;

/**
 *
 * @author vgout
 */
public class DrugCompoundsHistory {
    
      private ArrayList<DrugCompounds> drugCompoundHistory;

    public DrugCompoundsHistory() {
        
        drugCompoundHistory = new ArrayList<DrugCompounds>();
        
    }

    public ArrayList<DrugCompounds> getDrugCompoundHistory() {
        return drugCompoundHistory;
    }

    public void setDrugCompoundHistory(ArrayList<DrugCompounds> drugCompoundHistory) {
        this.drugCompoundHistory = drugCompoundHistory;
    }
    
    public DrugCompounds addDrugCompoundList()
   {
       DrugCompounds drugCompound = new DrugCompounds();
       drugCompoundHistory.add(drugCompound);
       return drugCompound;
       
   }
      
      
    
}
