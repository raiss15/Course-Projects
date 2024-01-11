/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.GovtBody;

import business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author sanatpopli
 */
public class PoliceDirectory {
     ArrayList<Police> PoliceList;
     
      public PoliceDirectory (){
        PoliceList = new ArrayList();
    }
        public Police newPoliceProfile(Person person){
        Police PoliceProfile = new Police(person);
        PoliceList.add(PoliceProfile);
        return PoliceProfile;
    }
    
  
    public Police findPolice(String id){
        for(Police profile : PoliceList){
            if(profile.isMatch(id)){
                return profile;
            }
        }
        return null;
    }

    public ArrayList<Police> getPoliceList() {
        return PoliceList;
    }

    public void PoliceList(ArrayList<Police> PoliceList) {
        this.PoliceList = PoliceList;
    }
    
    
}
