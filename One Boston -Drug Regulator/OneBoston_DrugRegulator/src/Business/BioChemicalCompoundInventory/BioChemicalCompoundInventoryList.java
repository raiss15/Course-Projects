/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BioChemicalCompoundInventory;
import java.util.ArrayList;

/**
 *
 * @author nisha
 */
public class BioChemicalCompoundInventoryList {
    
    private ArrayList<BioChemicalCompoundInventory> bioChemicalCompoundList;

    public BioChemicalCompoundInventoryList() {
        bioChemicalCompoundList =  new ArrayList<BioChemicalCompoundInventory>();
    }

    public ArrayList<BioChemicalCompoundInventory> getBioChemicalCompoundList() {
        return bioChemicalCompoundList;
    }

    public void setBioChemicalCompoundList(ArrayList<BioChemicalCompoundInventory> bioChemicalCompoundList) {
        this.bioChemicalCompoundList = bioChemicalCompoundList;
    }
    
    public BioChemicalCompoundInventory addChemial()
    {
        BioChemicalCompoundInventory bioChemComp = new BioChemicalCompoundInventory();
        bioChemicalCompoundList.add(bioChemComp);
        return bioChemComp;
    }
    
    public void deleteChemical(BioChemicalCompoundInventory bioChemComp){
     bioChemicalCompoundList.remove(bioChemComp);
    }
    
    
    
}
