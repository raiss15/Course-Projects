/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DrugRegulator;

import java.util.ArrayList;

/**
 *
 * @author bhagyatrivedi
 */
public class DrugRegulatorList {
    
    private ArrayList<DrugRegulator> drugList;

    public DrugRegulatorList() {
        this.drugList = new ArrayList<DrugRegulator>();
    }

    public ArrayList<DrugRegulator> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<DrugRegulator> drugList) {
        this.drugList = drugList;
    }
    
     public DrugRegulator addDrugList()
   {
       DrugRegulator drug = new DrugRegulator();
       drugList.add(drug);
       return drug;
       
   }
    
}
