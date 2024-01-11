/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Education;
import business.Person.Person;
import business.Profiles.Profile;
/**
 *
 * @author sanatpopli
 */
public class UniAdmin extends Profile{
    
    String username;
    String Password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    
     public UniAdmin(Person person ){
        super(person);
        
        
    }
    


   @Override
    public String getRole() {
        return "UniAdmin"; 
    }
}
