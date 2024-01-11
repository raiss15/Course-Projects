/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import Business.UserAccount.UserAccount;
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.Organization.PoliceDepartmentOrganization;
import javax.swing.JPanel;

/**
 *
 * @author bhagyatrivedi
 */
public class PoliceRole extends Role {
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new PoliceWorkAreaJPanel(userProcessContainer,account,(PoliceDepartmentOrganization)organization,enterprise,business,network);
    }
}
