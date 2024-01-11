/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Maintainence;
import business.Person.Person;
import business.Profiles.Profile;
/**
 *
 * @author sanatpopli
 */
public class Electrician extends Profile {
    String name;
    String jdpm;  //job done per month
    String payscale;
    String tax;

    public Electrician(Person person) {
        super(person);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJdpm() {
        return jdpm;
    }

    public void setJdpm(String jdpm) {
        this.jdpm = jdpm;
    }

    public String getPayscale() {
        return payscale;
    }

    public void setPayscale(String payscale) {
        this.payscale = payscale;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    @Override
    public String getRole() {
   return "Electrician";
    }
    
    
    
}
