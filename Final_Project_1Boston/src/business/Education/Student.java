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
public class Student extends Profile {
      
    private String firstName;
    private String lastName;
    private String emailId;
    private String age;
    private String illegalJob; 
    private String fee;
    private String uniqueId;
    private String edTax;
    private String degree;
    private String college;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
      
      
    public Student(Person person ){
           super(person);
       }
    
    @Override
    public String getRole(){
        return "Student";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIllegalJob() {
        return illegalJob;
    }

    public void setIllegalJob(String illegalJob) {
        this.illegalJob = illegalJob;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getEdTax() {
        return edTax;
    }

    public void setEdTax(String edTax) {
        this.edTax = edTax;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
    
    
           
}
