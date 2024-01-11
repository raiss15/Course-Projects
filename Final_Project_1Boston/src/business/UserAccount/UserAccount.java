/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import business.Employee.Employee;
import business.Profiles.Profile;
import business.Role.Role;


/**
 *
 * @author Bhagya
 */
public class UserAccount {
    Profile profile;
    String userName;
    String password;
    Employee employee;
    Role role;

    public UserAccount() {
    }
    
    
    public UserAccount (Profile profile,String userName, String password){
        this.userName = userName;
        this.password = password;
        this.profile = profile;
    }
    
    public UserAccount (String userName, String password, Role role){
        this.userName = userName;
        this.password = password;
        this.role = role;
    }
    
    public String getPersonId(){
        return profile.getPerson().getPersonId();
    }
    
    public String getUserLoginName(){
        return userName;
    }
    public boolean isMatch(String id){
        if(getPersonId().equals(id))
            return true;
        return false;
    }
    public boolean isValidUser(String uname, String pwd){
        if(userName.equals(uname) && password.equals(pwd))
            return true;
        return false;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    public Profile getAssociatedPersonProfile(){
        return profile;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return getUserLoginName();
    }
    
    
}
