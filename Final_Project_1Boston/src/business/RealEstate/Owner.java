/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.RealEstate;
import business.Person.Person;
import business.Profiles.Profile;

/**
 *
 * @author sanatpopli
 */
public class Owner extends Profile {
    String name;
    String property;
    String rentget;
    String Tax;

    public Owner(Person person) {
        super(person);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getRentget() {
        return rentget;
    }

    public void setRentget(String rentget) {
        this.rentget = rentget;
    }

    public String getTax() {
        return Tax;
    }

    public void setTax(String Tax) {
        this.Tax = Tax;
    }

    @Override
    public String getRole() {
   return "Owner"; }
    
    
    
}
