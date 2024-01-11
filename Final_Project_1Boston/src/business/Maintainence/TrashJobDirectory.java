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
public class TrashJobDirectory {
    ArrayList<TrashJob> TrashJobList;
     
      public TrashJobDirectory (){
        TrashJobList = new ArrayList();
    }
        public TrashJob newTrashJobProfile(Person person){
        TrashJob TrashJobProfile = new TrashJob(person);
        TrashJobList.add(TrashJobProfile);
        return TrashJobProfile;
    }
    
  
    public TrashJob findTrashJob(String id){
        for(TrashJob profile : TrashJobList){
            if(profile.isMatch(id)){
                return profile;
            }
        }
        return null;
    }

    public ArrayList<TrashJob> getTrashJobList() {
        return TrashJobList;
    }

    public void TrashJobList(ArrayList<TrashJob> TrashJobList) {
        this.TrashJobList = TrashJobList;
    }
    
    
}
