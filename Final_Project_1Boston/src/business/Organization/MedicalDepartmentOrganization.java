/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import Business.UserAccount.UserAccount;
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Role.MedicalRole;
import business.Role.Role;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author bhagyatrivedi
 */
public class MedicalDepartmentOrganization extends Organization{
     public MedicalDepartmentOrganization() {
        super(Organization.Type.MedicalDepartment.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MedicalRole());
        return roles;
    }
}
