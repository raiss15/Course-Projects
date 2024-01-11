/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Education;

import business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author sanatpopli
 */
public class ProfessorDirectory {
    ArrayList<Professor> professorList;
     
      public ProfessorDirectory (){
        professorList = new ArrayList();
    }
      public Professor newProfessorProfile(Person person){
        Professor professorProfile = new Professor(person);
        professorList.add(professorProfile);
        return professorProfile;
    }
    
  
    public Professor findProfessor(String id){
        for(Professor profile : professorList){
            if(profile.isMatch(id)){
                return profile;
            }
        }
        return null;
    }

    public ArrayList<Professor> getProfessorList() {
        return professorList;
    }

    public void setProfessorList(ArrayList<Professor> professorList) {
        this.professorList = professorList;
    }
    
}
