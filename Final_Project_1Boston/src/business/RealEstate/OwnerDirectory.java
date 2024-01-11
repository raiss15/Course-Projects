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
public class OwnerDirectory {
    ArrayList<Owner> OwnerList;
     
      public OwnerDirectory (){
        OwnerList = new ArrayList();
    }
        public Owner newOwnerProfile(Person person){
        Owner OwnerProfile = new Owner(person);
        OwnerList.add(OwnerProfile);
        return OwnerProfile;
    }
    
  
    public Owner findOwner(String id){
        for(Owner profile : OwnerList){
            if(profile.isMatch(id)){
                return profile;
            }
        }
        return null;
    }

    public ArrayList<Owner> getOwnerList() {
        return OwnerList;
    }

    public void OwnerList(ArrayList<Owner> OwnerList) {
        this.OwnerList = OwnerList;
    }
    
    
}
