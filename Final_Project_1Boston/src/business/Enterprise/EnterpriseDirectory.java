/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author bhagyatrivedi
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
//          Hospital("Hospital"),
//        University("University"),
//        ShoppingMall("ShoppingMall"),
//        Restaurant("Restaurant");
        
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
         else if (type==Enterprise.EnterpriseType.University){
            enterprise= new UniversityEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if (type==Enterprise.EnterpriseType.ShoppingMall){
            enterprise=new ShoppingMallEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if (type==Enterprise.EnterpriseType.Restaurant){
                
            enterprise=new RestaurantEnterprise(name);
            enterpriseList.add(enterprise);
           
        }
        return enterprise;
    }
}
