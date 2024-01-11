/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.ProductManagement;

import java.util.ArrayList;
import TheBusiness.OrderManagement.OrderItem;

/**
 *
 * @author kal bugrara
 */
public class Product {
    private String name;
    private int floorPrice;
    private int ceilingPrice;
    private int targetPrice;
    private int actualPrice;
    ArrayList<OrderItem> orderItems = new ArrayList<>();
    
    public Product(){};
    public Product(String n, int fp, int cp, int tp){
        name = n;
        floorPrice = fp;
        ceilingPrice = cp;
        targetPrice = tp;
        orderItems = new ArrayList();
    }
    
    public Product( int fp, int cp, int tp, int ap) {
        actualPrice = ap;    
        floorPrice = fp;
        ceilingPrice = cp;
        targetPrice = tp;
        orderItems = new ArrayList();
    }
    public Product(String n, int fp, int cp, int tp, int ap) {
        name = n;
        floorPrice = fp;
        ceilingPrice = cp;
        targetPrice = tp;
        actualPrice = ap;
        orderItems = new ArrayList();
    }
        public Product updateProduct(int fp, int cp, int tp, int ap) {
        floorPrice = fp;
        ceilingPrice = cp;
        targetPrice = tp;
        actualPrice = ap;
        return this; //returns itself
    }
    public int getActualPrice(){return actualPrice;}
    public void setActualPrice(int ap){
        actualPrice = ap;
    }
    public int getTargetPrice() {return targetPrice;}
    public void setTargetPrice(int tp){targetPrice = tp;}
    public void addOrderItem(OrderItem oi){     
        orderItems.add(oi);
    }
    public void removeOrderItem(OrderItem oi){
        orderItems.remove(oi);
    }
    //Number of item sales above target 
    public int getNumberOfProductSalesAboveTarget(){
        int sum = 0;
        for (OrderItem oi: orderItems){
            if(oi.isActualAboveTarget()==true) sum = sum +1;
        }
        return sum;
    }
    public int getNumberOfProductSalesBelowTarget(){
        int sum = 0;
        for (OrderItem oi: orderItems){
            if(oi.isActualBelowTarget()==true) sum = sum +1;
        }
        return sum;
    }    
    
        public boolean isProductAlwaysAboveTarget(){
        
        for (OrderItem oi: orderItems){
            if(oi.isActualAboveTarget()==false) return false; //
        }
        return true;
    }
    //calculates the revenues gained or lost (in relation to the target)
    //For example, if target is at $2000 and actual is $2500 then revenue gained
    // is $500 above the expected target. If the actual is $1800 then the lose will be $200
    // Add all these difference to get the total including wins and loses
    
        public int getOrderPricePerformance() {
        int sum = 0;
        for (OrderItem oi : orderItems) {
            sum = sum + oi.calculatePricePerformance();     //positive and negative values       
        }
        return sum;
    }
        public int getSalesVolume() {
        int sum = 0;
        for (OrderItem oi : orderItems) {
            sum = sum + oi.getOrderItemTotal();     //positive and negative values       
        }
        return sum;
    }
    public void setName(String n){
        name = n;
    }
    @Override
    public String toString(){
        return name;
    }
    public int getFloorPrice(){
        return floorPrice;
    }
    public void setFloorPrice(int fp){
        floorPrice = fp;
    }
    public int getCeilingPrice(){
        return ceilingPrice;
    }
    public void setCeilingPrice(int cp){
        ceilingPrice = cp;
    }

}
