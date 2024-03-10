/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.OrderManagement;

import java.util.ArrayList;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.MarketModel.MarketChannelAssignment;
import TheBusiness.ProductManagement.Product;
import TheBusiness.SalesManagement.SalesPersonProfile;

/**
 *
 * @author kal bugrara
 */
public class Order {

    ArrayList<OrderItem> orderItems = new ArrayList<>();
    CustomerProfile customer;
//    SalesPersonProfile salesPerson;
    String salesPerson;
    MarketChannelAssignment marketChannelAssingment;
    String market;
    String channel;
    String status;
    int orderPrice;
    int orderTargetPrice;
    String season;
    String cust;

    public String getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }
    
    
 

    public CustomerProfile getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerProfile customer) {
        this.customer = customer;
    }

    
    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
    
    
    public String getCust() {
        return cust;
    }

    public void setCust(String cust) {
        this.cust = cust;
    }
    
    
    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
    
    public int getOrderTargetPrice() {
        return orderTargetPrice;
    }

    public void setOrderTargetPrice(String orderTargetPrice) {
        this.orderTargetPrice = Integer.valueOf(orderTargetPrice.trim());
    }
    
    
    public int getOrderPrice(){
        return orderPrice;
    }
    public void setOrderPrice(String op){
        orderPrice = Integer.valueOf(op.trim());
    }
    public Order(){
    orderItems = new ArrayList();
    }
    
    public Order(CustomerProfile cp) {
        orderItems = new ArrayList();
        
        status = "in process";
    }
    public Order(CustomerProfile cp, SalesPersonProfile ep) {
        orderItems = new ArrayList();
       
    }
    public OrderItem newOrderItem(Product p, int actualprice, int q) {
        OrderItem oi = new OrderItem(p, actualprice, q);
        orderItems.add(oi);
        return oi;
    }
    //order total is the sumer of the order item totals
    public int getOrderTotal() {
        int sum = 0;
        for (OrderItem oi : orderItems) {
            sum = sum + oi.getOrderItemTotal();
        }
        return sum;
    }

    public int getOrderPricePerformance() {
        int sum = 0;
        for (OrderItem oi : orderItems) {
            sum = sum + oi.calculatePricePerformance();     //positive and negative values       
        }
        return sum;
    }

    public int getNumberOfOrderItemsAboveTarget() {
        int sum = 0;
        for (OrderItem oi : orderItems) {
            if (oi.isActualAboveTarget() == true) {
                sum = sum + 1;
            }
        }
        return sum;
    }
    
    //sum all the item targets and compare to the total of the order 
    public boolean isOrderAboveTotalTarget(){
        int sum = 0;
        for (OrderItem oi: orderItems){
            sum = sum + oi.getOrderItemTargetTotal(); //product targets are added
        }
        if(getOrderTotal()>sum) {return true;}
        else {return false;}
        
    }
public void CancelOrder(){
    status = "Cancelled";
}
public void Submit(){
    status = "Submitted";
}

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }


    public MarketChannelAssignment getMarketChannelAssingment() {
        return marketChannelAssingment;
    }

    public void setMarketChannelAssingment(MarketChannelAssignment marketChannelAssingment) {
        this.marketChannelAssingment = marketChannelAssingment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   
    
}
