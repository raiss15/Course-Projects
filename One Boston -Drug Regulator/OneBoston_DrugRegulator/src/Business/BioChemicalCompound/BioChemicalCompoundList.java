/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BioChemicalCompound;

import java.util.ArrayList;

/**
 *
 * @author sohni
 */
public class BioChemicalCompoundList {
     private ArrayList<BioChemicalCompound> bioChemicalCompoundList;

    public BioChemicalCompoundList() {
        this.bioChemicalCompoundList = new ArrayList<BioChemicalCompound>();
    }

    public ArrayList<BioChemicalCompound> getBioChemicalCompoundList() {
        return bioChemicalCompoundList;
    }

    public void setBioChemicalCompoundList(ArrayList<BioChemicalCompound> bioChemicalCompoundList) {
        this.bioChemicalCompoundList = bioChemicalCompoundList;
    }
   
    
   
    
     public BioChemicalCompound addChemicalList()
   {
       BioChemicalCompound c = new BioChemicalCompound();
       bioChemicalCompoundList.add(c);
       return c;
       
   }
}
