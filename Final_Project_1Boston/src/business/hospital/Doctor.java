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
public class Doctor extends Profile {
    
    String name;
    String noopd; //no of opd
    String Schedule;
    String uniqueid;
    String Tax;

    public Doctor(Person person) {
        super(person);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchedule() {
        return Schedule;
    }

    public void setSchedule(String Schedule) {
        this.Schedule = Schedule;
    }

    public String getTax() {
        return Tax;
    }

    public void setTax(String Tax) {
        this.Tax = Tax;
    }

    public String getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }

    public String getNoopd() {
        return noopd;
    }

    public void setNoopd(String noopd) {
        this.noopd = noopd;
    }
    
    
    
    @Override
    public String toString() {
        return getUniqueid();
    }

    @Override
    public String getRole() {
  return "Doctor"; }
    
}
