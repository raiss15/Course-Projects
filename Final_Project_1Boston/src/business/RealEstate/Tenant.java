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
public class Tenant extends Profile{
    String name;
    String adress;
    String mail;
    String rent;
    String Fine;

    public Tenant(Person person) {
        super(person);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }

    public String getFine() {
        return Fine;
    }

    public void setFine(String Fine) {
        this.Fine = Fine;
    }

    @Override
    public String getRole() {
   return "Tenant"; }
    
    
    
    
}
