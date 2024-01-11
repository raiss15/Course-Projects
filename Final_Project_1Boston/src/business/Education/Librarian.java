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
public class Librarian extends Profile{
      String name;
      String nohoursduty; //no of hours
      String salary;
      String uniqueid;
      String Tax;
      
       public Librarian(Person person ){
        super(person);
    }
    
    @Override
    public String getRole(){
        return "Professor";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNohoursduty() {
        return nohoursduty;
    }

    public void setNohoursduty(String nohoursduty) {
        this.nohoursduty = nohoursduty;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
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
      
      
    
}
