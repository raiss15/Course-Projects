package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author sanatpopli
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        Employee e1 = system.getEmployeeDirectory().createEmployee("admin");
        UserAccount userAccount = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", e1, new SystemAdminRole());
        return system;
    }
    
}
