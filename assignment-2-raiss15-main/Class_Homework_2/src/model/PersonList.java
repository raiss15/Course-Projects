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
public class PersonList {
    
   
    ArrayList<Person> userList = null;
    
     public PersonList(){
    
        this.userList = new ArrayList<Person>();
        Person user1 = new Person();
        user1.setNuId(null);
        user1.setUserId("admin");
        user1.setUserName("admin");
        user1.setPassword("admin");
        user1.setEnabled("YES");
        userList.add(user1);
        System.out.print(userList);
    }
    

    public ArrayList<Person> getUser() {
        return userList;
    }

    public void setUser(ArrayList<Person> userList) {
        this.userList = userList;
    }
    
    public Person addUser(Person user){
    
       // Person user = new Person();
        userList.add(user);
        return user;
    }
    
    public void deleteUser(Person user){    
        userList.remove(user);
    } 
    
    
   public Person searchUser(String nueId){
    String nuId = nueId;
       for(Person u: userList){
           if(nuId.equalsIgnoreCase(u.getNuId())){
           return u;
           }
       }
   return null;
   }
   
   public Person searchUserByUserId(String userId){
    String nuId = userId;
       for(Person u: userList){
           if(nuId.equalsIgnoreCase(u.getUserId())){
           return u;
           }
       }
   return null;
   }
    
}
