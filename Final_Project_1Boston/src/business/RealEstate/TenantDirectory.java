/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.RealEstate;

import business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author sanatpopli
 */
public class TenantDirectory {
     ArrayList<Tenant> TenantList;
     
      public TenantDirectory (){
        TenantList = new ArrayList();
    }
        public Tenant newTenantProfile(Person person){
        Tenant TenantProfile = new Tenant(person);
        TenantList.add(TenantProfile);
        return TenantProfile;
    }
    
  
    public Tenant findTenant(String id){
        for(Tenant profile : TenantList){
            if(profile.isMatch(id)){
                return profile;
            }
        }
        return null;
    }

    public ArrayList<Tenant> getTenantList() {
        return TenantList;
    }

    public void TenantList(ArrayList<Tenant> TenantList) {
        this.TenantList = TenantList;
    }
    

    
}
