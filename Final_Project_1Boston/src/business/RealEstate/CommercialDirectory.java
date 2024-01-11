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
public class CommercialDirectory {
     ArrayList<Commercial> CommercialList;
     
      public CommercialDirectory (){
        CommercialList = new ArrayList();
    }
        public Commercial newCommercialProfile(Person person){
        Commercial CommercialProfile = new Commercial(person);
        CommercialList.add(CommercialProfile);
        return CommercialProfile;
    }
    
  
    public Commercial findCommercial(String id){
        for(Commercial profile : CommercialList){
            if(profile.isMatch(id)){
                return profile;
            }
        }
        return null;
    }

    public ArrayList<Commercial> getCommercialList() {
        return CommercialList;
    }

    public void CommercialList(ArrayList<Commercial> CommercialList) {
        this.CommercialList = CommercialList;
    }
    

    
}
