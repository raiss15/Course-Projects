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
public class FireBrigadeDirectory {
     ArrayList<FireBrigade> FireBrigadeList;
     
      public FireBrigadeDirectory (){
        FireBrigadeList = new ArrayList();
    }
        public FireBrigade newFireBrigadeProfile(Person person){
        FireBrigade FireBrigadeProfile = new FireBrigade(person);
        FireBrigadeList.add(FireBrigadeProfile);
        return FireBrigadeProfile;
    }
    
  
    public FireBrigade findFireBrigade(String id){
        for(FireBrigade profile : FireBrigadeList){
            if(profile.isMatch(id)){
                return profile;
            }
        }
        return null;
    }

    public ArrayList<FireBrigade> getFireBrigadeList() {
        return FireBrigadeList;
    }

    public void FireBrigadeList(ArrayList<FireBrigade> FireBrigadeList) {
        this.FireBrigadeList = FireBrigadeList;
    }
    
}
