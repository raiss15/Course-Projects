/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * 
 */
public class PasswordHistoryList {
    
    ArrayList<PasswordHistory> passwordList;

    
    public PasswordHistoryList(){
    
       passwordList = new ArrayList<>();
    }
    
    public ArrayList<PasswordHistory> getPasswordList() {
        return passwordList;
    }

    public void setPasswordList(ArrayList<PasswordHistory> passwordList) {
        this.passwordList = passwordList;
    }
    
     public PasswordHistory addPasswordHistory(PasswordHistory password){
    
       // User user = new User();
        passwordList.add(password);
        return password;
    }
     
      public PasswordHistory searchOldPassword(String neuId){
        String nuId = neuId;
       for(PasswordHistory u: passwordList){
           if(nuId.equalsIgnoreCase(u.getNeuId())){
           return u;
           }
       }
        return null;
   }
}