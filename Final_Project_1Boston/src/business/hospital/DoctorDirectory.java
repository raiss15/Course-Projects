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
public class DoctorDirectory {
     ArrayList<Doctor> DoctorList;
     
      public DoctorDirectory (){
        DoctorList = new ArrayList();
    }
        public Doctor newDoctorProfile(Person person){
        Doctor DoctorProfile = new Doctor(person);
        DoctorList.add(DoctorProfile);
        return DoctorProfile;
    }
    
  
    public Doctor findStudent(String id){
        for(Doctor profile : DoctorList){
            if(profile.isMatch(id)){
                return profile;
            }
        }
        return null;
    }

    public ArrayList<Doctor> getDoctorList() {
        return DoctorList;
    }

    public void DoctorList(ArrayList<Doctor> DoctorList) {
        this.DoctorList = DoctorList;
    }
    
    
    
    }

    
        
    
    
    

