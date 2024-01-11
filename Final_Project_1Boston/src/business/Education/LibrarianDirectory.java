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
public class LibrarianDirectory {
     ArrayList<Librarian> LibrarianList;
     
      public LibrarianDirectory (){
        LibrarianList = new ArrayList();
    }
      public Librarian newLibrarianProfile(Person person){
        Librarian LibrarianProfile = new Librarian(person);
        LibrarianList.add(LibrarianProfile);
        return LibrarianProfile;
    }
    
  
    public Librarian findLibrarian(String id){
        for(Librarian profile : LibrarianList){
            if(profile.isMatch(id)){
                return profile;
            }
        }
        return null;
    }

    public ArrayList<Librarian> getLibrarianList() {
        return LibrarianList;
    }

    public void setLibrarianList(ArrayList<Librarian> LibrarianList) {
        this.LibrarianList = LibrarianList;
    }
    
}

    

