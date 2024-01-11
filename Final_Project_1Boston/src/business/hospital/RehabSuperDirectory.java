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
public class RehabSuperDirectory {
   
    ArrayList<RehabSuperVisor> supervisorList;
     
      public  RehabSuperDirectory(){
        supervisorList = new ArrayList();
    }
      public RehabSuperVisor newRehabSuperVisorProfile(Person person){
        RehabSuperVisor RehabSuperVisorProfile = new  RehabSuperVisor(person);
        supervisorList.add(RehabSuperVisorProfile);
        return RehabSuperVisorProfile;
    }
    
  
    public RehabSuperVisor findRehabSuperVisor(String id){
        for(RehabSuperVisor profile : supervisorList){
            if(profile.isMatch(id)){
                return profile;
            }
        }
        return null;
    }

    public ArrayList<RehabSuperVisor> getsupervisorList() {
        return supervisorList;
    }

    public void supervisorList(ArrayList<RehabSuperVisor> supervisorList) {
        this.supervisorList = supervisorList;
    }
    
}
