/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.Role;
import business.Role.YouthRole;
import java.util.ArrayList;

/**
 *
 * @author bhagyatrivedi
 */
public class YouthOrganization extends Organization {
     public YouthOrganization() {
        super(Organization.Type.YouthOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new YouthRole());
        return roles;
    }
}
