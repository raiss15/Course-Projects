/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.MedicalInventory.MedicalInventory;
import Business.Role.PharmaRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhagyatrivedi
 */
public class PharmaOrganization extends Organization{

    private ArrayList<MedicalInventory> medList;
    public PharmaOrganization() {
     
       super(Organization.Type.Pharmacy.getValue());
        medList=new ArrayList<MedicalInventory>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmaRole());
        return roles;
    }

    public ArrayList<MedicalInventory> getMedList() {
        return medList;
    }

    public void setMedList(ArrayList<MedicalInventory> medList) {
        this.medList = medList;
    }
    
     public void addMedicine(MedicalInventory mi)
    {
       
        medList.add(mi);
        
    }
    
    
    
}
