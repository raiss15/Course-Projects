/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.hospital;
import business.Person.Person;
import java.util.ArrayList;
/**
 *
 * @author sanatpopli
 */
public class NursesDirectory {
    ArrayList<Nurses> NursesList;
     
      public  NursesDirectory(){
        NursesList = new ArrayList();
    }
        public Nurses newNursesProfile(Person person){
        Nurses NursesProfile = new Nurses(person);
        NursesList.add(NursesProfile);
        return NursesProfile;
    }
    
  
    public Nurses findNurses(String id){
        for(Nurses profile : NursesList){
            if(profile.isMatch(id)){
                return profile;
            }
        }
        return null;
    }

    public ArrayList<Nurses> getNursesList() {
        return NursesList;
    }

    public void NursesList(ArrayList<Nurses> NursesList) {
        this.NursesList = NursesList;
    }
    
    
}
