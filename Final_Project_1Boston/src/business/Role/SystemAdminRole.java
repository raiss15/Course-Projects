/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import Business.UserAccount.UserAccount;
import UserInterface.SytemAdminWorkArea.SystemAdminWorkAreaJPanel;
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import javax.swing.JPanel;

/**
 *
 * @author bhagyatrivedi
 */
public class SystemAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system,Network network) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
}
