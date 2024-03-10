/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.BioChemicalCompound.BioChemicalCompoundList;
import Business.BioChemicalCompoundInventory.BioChemicalCompoundInventory;
import Business.DrugRegulator.DrugRegulatorList;
import Business.DrugCompounds.DrugCompoundsHistory;
import Business.Role.DrugRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nisha
 */
public class DrugOrganization extends Organization{
    
  private ArrayList<BioChemicalCompoundInventory> chemList;

    public DrugOrganization() {
        
        super(Organization.Type.Drug.getValue());
        chemList =  new ArrayList<BioChemicalCompoundInventory>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DrugRole());
        return roles;
    }

    
    public ArrayList<BioChemicalCompoundInventory> getChemList() {
        return chemList;
    }

    public void setChemList(ArrayList<BioChemicalCompoundInventory> chemList) {
        this.chemList = chemList;
    }

    
    
    public void addChemical(BioChemicalCompoundInventory cdi)
    {
       
        chemList.add(cdi);
        
    }
    
   
    
}
