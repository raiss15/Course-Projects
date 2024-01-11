package business.Role;

import Business.UserAccount.UserAccount;
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import javax.swing.JPanel;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bhagyatrivedi
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Professor("Professor"),
        Student("Student"),
        Librarian("Librarian"),
        Police("Police Officer");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }
        public String getValue(){
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }
    public abstract JPanel createWorkArea(JPanel workArea, 
            UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network);
    
    
    @Override
    public String toString(){
        return this.getClass().getName();
    }
}
