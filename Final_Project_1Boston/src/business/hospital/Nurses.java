/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.hospital;
import business.Person.Person;
import business.Profiles.Profile;

/**
 *
 * @author sanatpopli
 */
public class Nurses extends Profile{
    
    String name;
    String age; 
    String dutyhours;
    String uniqueid;
    String noofpatients;
    String Tax;

    public Nurses(Person person) {
        super(person);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDutyhours() {
        return dutyhours;
    }

    public void setDutyhours(String dutyhours) {
        this.dutyhours = dutyhours;
    }

    public String getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }

    public String getNoofpatients() {
        return noofpatients;
    }

    public void setNoofpatients(String noofpatients) {
        this.noofpatients = noofpatients;
    }

    public String getTax() {
        return Tax;
    }

    public void setTax(String Tax) {
        this.Tax = Tax;
    }

    @Override
    public String getRole() {
return "Nurses";  }
    
    
    
}
