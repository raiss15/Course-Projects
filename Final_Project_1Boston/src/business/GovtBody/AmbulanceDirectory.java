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
public class AmbulanceDirectory {
      ArrayList<Ambulance> AmbulanceList;
     
      public AmbulanceDirectory (){
        AmbulanceList = new ArrayList();
    }
        public Ambulance newAmbulanceProfile(Person person){
        Ambulance AmbulanceProfile = new Ambulance(person);
        AmbulanceList.add(AmbulanceProfile);
        return AmbulanceProfile;
    }
    
  
    public Ambulance findAmbulance(String id){
        for(Ambulance profile : AmbulanceList){
            if(profile.isMatch(id)){
                return profile;
            }
        }
        return null;
    }

    public ArrayList<Ambulance> getAmbulanceList() {
        return AmbulanceList;
    }

    public void StudentList(ArrayList<Ambulance> AmbulanceList) {
        this.AmbulanceList = AmbulanceList;
    }
    

    
}
