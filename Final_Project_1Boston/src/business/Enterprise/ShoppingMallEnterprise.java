/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhagyatrivedi
 */
public class ShoppingMallEnterprise extends Enterprise{
    
    public ShoppingMallEnterprise(String name){
        super(name, EnterpriseType.ShoppingMall);
    }
    @Override
    public ArrayList<Role> getSupportedRole(){
        return null;
    }
}
