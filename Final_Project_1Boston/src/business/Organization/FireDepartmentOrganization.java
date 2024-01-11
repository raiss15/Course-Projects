/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.FireFighterRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhagyatrivedi
 */
public class FireDepartmentOrganization extends Organization {
    
    public FireDepartmentOrganization(){
        super(Organization.Type.FireDepartment.getValue());
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FireFighterRole());
        return roles;
    }
}
