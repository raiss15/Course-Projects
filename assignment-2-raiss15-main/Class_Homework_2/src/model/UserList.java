/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class UserList {
 
    private ArrayList<Admin> history;
    
    public UserList(){
    
        this.history = new ArrayList <Admin>();
  
    }
    
    public ArrayList<Admin> getHistory(){
    return history;
        
    }
    
    public void setHistory(ArrayList<Admin> history) {
        this.history = history;
    }
    
    
    public Admin addNewAdmin(){
      Admin admin=new Admin();
      history.add(admin);
      return admin;
    }

    public void deleteUser(Admin admin) {
        history.remove(admin); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String searchUser(String NEUID){
        for(Admin admin:history){
            if(admin.getNEUID().equals(NEUID)){
                return NEUID;
        }
        
     
    
    
    
}
        return null;

}
}
    
