/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import Business.UserAccount.UserAccount;
import UserInterface.GovtBody.FireFighterWorkAreaJPanel;
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.FireDepartmentOrganization;
import business.Organization.Organization;
import javax.swing.JPanel;

/**
 *
 * @author bhagyatrivedi
 */
public class FireFighterRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new FireFighterWorkAreaJPanel(userProcessContainer,account,(FireDepartmentOrganization)organization,enterprise,business,network);
    }
}
