/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Maintainence;

import business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author sanatpopli
 */
public class ElectricianDirectory {
     ArrayList<Electrician> ElectricianList;
     
      public ElectricianDirectory (){
        ElectricianList = new ArrayList();
    }
        public Electrician newElectricianProfile(Person person){
        Electrician ElectricianProfile = new Electrician(person);
        ElectricianList.add(ElectricianProfile);
        return ElectricianProfile;
    }
    
  
    public Electrician findElectrician(String id){
        for(Electrician profile : ElectricianList){
            if(profile.isMatch(id)){
                return profile;
            }
        }
        return null;
    }

    public ArrayList<Electrician> getElectricianList() {
        return ElectricianList;
    }

    public void ElectricianList(ArrayList<Electrician> ElectricianList) {
        this.ElectricianList = ElectricianList;
    }
    
    
}
