/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import business.Education.Professor;
import business.Education.Student;
import business.Employee.Employee;
import business.Profiles.Profile;
import business.Role.Role;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bhagyatrivedi
 */
public class UserAccountDirectory {
    
    ArrayList<UserAccount> userAccountList = new ArrayList();
    
    public UserAccountDirectory(){
        userAccountList = new ArrayList();
    }
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    public UserAccount newUserAccount(Profile profile, String username, String password){
        try {
            MessageDigest messageDigest =  MessageDigest.getInstance("SHA-256");
            byte[] md = messageDigest.digest(password.getBytes());
            BigInteger bigInt = new BigInteger(1, md);
            String hashedPassword = bigInt.toString(16);
            Student sp;
            Professor pp;
            if(profile instanceof Student){
                sp = (Student) profile;
                sp.setUsername(username);
                sp.setPassword(hashedPassword);
            }
                
            if(profile instanceof Professor){
                pp = (Professor) profile;
                pp.setUsername(username);
                pp.setPassword(hashedPassword);
            }

            UserAccount userAccount = new UserAccount(profile, username, hashedPassword);
            
            userAccountList.add(userAccount);
            return userAccount;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UserAccountDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
       return null; 
    }
    
    public UserAccount findUserAccount(String id){
        for(UserAccount userAccount : userAccountList){
            if(userAccount.isMatch(id)){
                return userAccount;
            }
        }
        return null;
    }
    
    public UserAccount AuthenticateUser(String username, String password){
        for(UserAccount userAccount : userAccountList){
            if(userAccount.isValidUser(username, password)){
                return userAccount;
            }
        }
        return null;
    }
    
    public ArrayList<UserAccount> getUserAccountList(){
        return userAccountList;
    }
    public void updateUserName(String username, Profile profile){
          Student sp;
          Professor pp;
            if(profile instanceof Student){
                sp = (Student) profile;
                sp.setUsername(username);
                UserAccountDirectory uad = new UserAccountDirectory();
                UserAccount user = uad.findUserAccount("Stu-"+sp.getFirstName());
                user.setUserName(username);
                
            }
                
            if(profile instanceof Professor){
                pp = (Professor) profile;
                pp.setUsername(username);
                UserAccountDirectory uad = new UserAccountDirectory();
                UserAccount user = uad.findUserAccount("Prof-"+pp.getFirstName());
                user.setUserName(username);
            }
//            if(profile instanceof Employer){
//                ep = (EmployerProfile) profile;
//                ep.setUsername(username);
//                UserAccountDirectory uad = new UserAccountDirectory();
//                UserAccount user = uad.findUserAccount("Emp-"+ep.getEmployerName());
//                user.setUserName(username);
//            }      
    }
     public UserAccount createUserAccount(String username, String password, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUserName().equals(username))
                return false;
        }
        return true;
    }
    public void updatePassword(String password, Profile profile){
        try {
            MessageDigest messageDigest =  MessageDigest.getInstance("SHA-256");
            byte[] md = messageDigest.digest(password.getBytes());
            BigInteger bigInt = new BigInteger(1, md);
            String hashedPassword = bigInt.toString(16);
            Student sp;
            Professor pp;
            if(profile instanceof Student){
                sp = (Student) profile;
                sp.setPassword(hashedPassword);
                UserAccountDirectory uad = new UserAccountDirectory();
                UserAccount user = uad.findUserAccount("Stu-"+sp.getFirstName());
                user.setPassword(hashedPassword);
                
            }
                
            if(profile instanceof Professor){
                pp = (Professor) profile;
                pp.setPassword(hashedPassword);
                UserAccountDirectory uad = new UserAccountDirectory();
                UserAccount user = uad.findUserAccount("Prof-"+pp.getFirstName());
                user.setPassword(hashedPassword);
            }
            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UserAccountDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
