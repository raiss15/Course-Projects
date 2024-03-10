/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.BioChemicalCompound.BioChemicalCompoundList;
import Business.DrugRegulator.DrugRegulatorList;
import Business.DrugCompounds.DrugCompoundsHistory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author bhagyatrivedi
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private BioChemicalCompoundList chemicalList;
    private DrugRegulatorList drugRegulatorList;
    private DrugCompoundsHistory geneList;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
        drugRegulatorList = new DrugRegulatorList();
        chemicalList = new BioChemicalCompoundList();
        geneList = new DrugCompoundsHistory();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
    
    public DrugRegulatorList getDrugList() {
        return drugRegulatorList;
    }

    public void setDrugList(DrugRegulatorList drugList) {
        this.drugRegulatorList = drugList;
    }

    public BioChemicalCompoundList getChemicalList() {
        return chemicalList;
    }

    public void setChemicalList(BioChemicalCompoundList chemicalList) {
        this.chemicalList = chemicalList;
    }
    

    public DrugCompoundsHistory getGeneList() {
        return geneList;
    }

    public void setGeneList(DrugCompoundsHistory geneList) {
        this.geneList = geneList;
    }
    
  
    
   
}
