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
public class PlumberDirectory {
    ArrayList<Plumber> PlumberList;
     
      public PlumberDirectory (){
        PlumberList = new ArrayList();
    }
        public  Plumber newPlumberProfile(Person person){
        Plumber PlumberProfile = new Plumber(person);
        PlumberList.add(PlumberProfile);
        return PlumberProfile;
    }
    
  
    public Plumber findPlumber(String id){
        for(Plumber profile : PlumberList){
            if(profile.isMatch(id)){
                return profile;
            }
        }
        return null;
    }

    public ArrayList<Plumber> getPlumberList() {
        return PlumberList;
    }

    public void PlumberList(ArrayList<Plumber> PlumberList) {
        this.PlumberList = PlumberList;
    }
    
    
}
