/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import Business.UserAccount.UserAccountDirectory;
import business.Person.PersonDirectory;
import business.Role.Role;
import business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author bhagyatrivedi
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter =0;
    
    public enum Type{
        PoliceDepartment("PoliceDepartment"),
        FireDepartment("FireDepartment"),
        CommunityService("CommunityService"),
        MedicalDepartment("MedicalDepartment"),
        YouthOrganization("YouthOrganization"),
        PublicWorksDepartment("PublicWorksDepartment");
        private String value;
        private Type(String value){
            this.value = value;
        }
        public String getValue(){
            return value;
        }
    }
    public Organization(String name){
        this.name = name;
        workQueue = new WorkQueue();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory(){
        return userAccountDirectory;
    }
    public int getOrganizationID(){
        return organizationID;
    }
    public String getName(){
        return name;
    }
    
    public WorkQueue getWorkQueue(){
        return workQueue;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setWorkQueue(WorkQueue workQueue){
        this.workQueue = workQueue;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
