/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarketingManagement;

import java.util.ArrayList;
import TheBusiness.OrderManagement.Order;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.Profile;

/**
 *
 * @author kal bugrara
 */
public class MarketingPersonProfile extends Profile {
    ArrayList<Order> salesOrders;


    public MarketingPersonProfile(Person p) {

        super(p); 
        salesOrders = new ArrayList();

    }
    public void addSalesOrder(Order o){
        salesOrders.add(o);
    }
    @Override
    public String getRole(){
        return  "Marketing";
    }

}
