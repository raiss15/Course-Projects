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
public class RehabSuperVisor extends Profile {
     String name;
     String nodh; //no of drugies treated
     String Schedule;
     String uniqueid;
     String Tax;

    public RehabSuperVisor(Person person) {
        super(person);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNodh() {
        return nodh;
    }

    public void setNodh(String nodh) {
        this.nodh = nodh;
    }

    public String getSchedule() {
        return Schedule;
    }

    public void setSchedule(String Schedule) {
        this.Schedule = Schedule;
    }

    public String getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }

    public String getTax() {
        return Tax;
    }

    public void setTax(String Tax) {
        this.Tax = Tax;
    }

    @Override
    public String getRole() {
 return "RehabSuperVisor"; }
     
     

    
}
