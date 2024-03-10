/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.MarketModel;

import java.util.ArrayList;
import TheBusiness.ProductManagement.Product;
import TheBusiness.SolutionOrders.SolutionOrder;

/**
 *
 * @author kal bugrara
 */
public class SolutionOffer {
    int id;
    ArrayList<Product> products;
 
    //floor, ceiling, and target ideas
    int actualPrice;
    int ceilingPrice;
    int floorPrice;
    int targetPrice;
    String ad;
    MarketChannelAssignment marketChannelComb;
    ArrayList<SolutionOrder> solutionOrders;
    
    public SolutionOffer(MarketChannelAssignment m){
        marketChannelComb = m;
        products = new ArrayList();
        solutionOrders = new ArrayList();
        m.addSolutionOffer(this); 
        
       
    } 
    
    public void addProduct(Product p){
        products.add(p);
    }
    public void setTotalPrice(int p){
        actualPrice = p;
        
    }
    public int getSolutionPrice(){
        int sum = 0;
        for(Product p : products){
            sum+= p.getCeilingPrice();
        }
        return sum;
    }
    
    public int getRevenues(){
        int sum = 0;
        for(SolutionOrder so: solutionOrders){
            sum = sum + so.getSolutionPrice();
            
        }
        return sum;
    }
    
    public void addSolutionOrder(SolutionOrder so){
        solutionOrders.add(so);
    }
    // this will allow one to retrieve all offers meant for this market/channel combo
    public boolean isSolutionOfferMatchMarketChannel(MarketChannelAssignment mca){
        
        if (marketChannelComb==mca) return true;
        else return false;
    }
    public String getAd(){
        return ad;
    }
    public void setAd(String a){ //this an amazing solution for people like
        ad = a;
    }

    
}
