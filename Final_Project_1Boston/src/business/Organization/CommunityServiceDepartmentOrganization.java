/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.CommunityServiceRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhagyatrivedi
 */
public class CommunityServiceDepartmentOrganization extends Organization{
    public CommunityServiceDepartmentOrganization(){
        super(Organization.Type.CommunityService.getValue());
    }
    @Override 
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CommunityServiceRole());
        return roles;
    }
}
