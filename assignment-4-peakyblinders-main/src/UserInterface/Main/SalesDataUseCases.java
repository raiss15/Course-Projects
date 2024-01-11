/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserInterface.Main;

import TheBusiness.Business.Business;
import TheBusiness.OrderManagement.MasterOrderList;
import TheBusiness.OrderManagement.Order;
import TheBusiness.OrderManagement.OrderItem;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author Bhagya
 */
public class SalesDataUseCases {
    Business business;
    
    public LinkedHashSet<Integer> getTop3BestNegotiatedSolutionsAboveTarget(){
        MasterOrderList masterOrderList = business.getMasterOrderList();
        ArrayList<Order> orders = masterOrderList.getOrders();
        
        
        //Market B2b
        int best1 = -1;
        int best2 = -1;
        int best3 = -1;
        for(Order o : orders){
            if((o.getOrderPrice()>best1) && o.getMarketChannelAssingment().getMarket().equals("B2B")){
                best1 = o.getOrderPrice();
            }
        }
        for(Order o : orders){
            if((o.getOrderPrice() > best2) && ((best2<best1) && o.getMarketChannelAssingment().getMarket().equals("B2B") ) ){
                best2 = o.getOrderPrice();
            }
        }
        for(Order o : orders){
            if((o.getOrderPrice() > best3) && ((best3<best2) && o.getMarketChannelAssingment().getMarket().equals("B2B") ) ){
                best3 = o.getOrderPrice();
            }
        }
        //Market Teen
        int bestTeen1 = -1;
        int bestTeen2 = -1;
        int bestTeen3 = -1;
        for(Order o : orders){
            if((o.getOrderPrice()>bestTeen1) && o.getMarketChannelAssingment().getMarket().equals("Teen")){
                bestTeen1 = o.getOrderPrice();
            }
        }
        for(Order o : orders){
            if((o.getOrderPrice() > bestTeen2) && ((bestTeen2<bestTeen1) && o.getMarketChannelAssingment().getMarket().equals("Teen") ) ){
                bestTeen2 = o.getOrderPrice();
            }
        }
        for(Order o : orders){
            if((o.getOrderPrice() > bestTeen3) && ((bestTeen3<bestTeen2) && o.getMarketChannelAssingment().getMarket().equals("Teen") ) ){
                bestTeen3 = o.getOrderPrice();
            }
        }
        //Market CollegeStudent
        int bestStudent1 = -1;
        int bestStudent2 = -1;
        int bestStudent3 = -1;
        for(Order o : orders){
            if((o.getOrderPrice()>bestStudent1) && o.getMarketChannelAssingment().getMarket().equals("College Student")){
                bestStudent1 = o.getOrderPrice();
            }
        }
        for(Order o : orders){
            if((o.getOrderPrice() > bestStudent2) && ((bestStudent2<bestStudent1) && o.getMarketChannelAssingment().getMarket().equals("College Student") ) ){
                bestStudent2 = o.getOrderPrice();
            }
        }
        for(Order o : orders){
            if((o.getOrderPrice() > bestStudent3) && ((bestStudent3<bestStudent2) && o.getMarketChannelAssingment().getMarket().equals("College Student") ) ){
                bestStudent3 = o.getOrderPrice();
            }
        }
        //Market Millenial
        int bestMill1 = -1;
        int bestMill2 = -1;
        int bestMill3 = -1;
        for(Order o : orders){
            if((o.getOrderPrice()>bestMill1) && o.getMarketChannelAssingment().getMarket().equals("Millenial")){
                bestMill1 = o.getOrderPrice();
            }
        }
        for(Order o : orders){
            if((o.getOrderPrice() > bestMill2) && ((bestMill2<bestMill1) && o.getMarketChannelAssingment().getMarket().equals("Millenial") ) ){
                bestMill2 = o.getOrderPrice();
            }
        }
        for(Order o : orders){
            if((o.getOrderPrice() > bestMill3) && ((bestMill3<bestMill2) && o.getMarketChannelAssingment().getMarket().equals("Milleanial") ) ){
                bestMill3 = o.getOrderPrice();
            }
        }
        //Market seniors
        int bestSenior1 = -1;
        int bestSenior2 = -1;
        int bestSenior3 = -1;
        for(Order o : orders){
            if((o.getOrderPrice()>bestSenior1) && o.getMarketChannelAssingment().getMarket().equals("Senior")){
                bestSenior1 = o.getOrderPrice();
            }
        }
        for(Order o : orders){
            if((o.getOrderPrice() > bestSenior2) && ((bestSenior2<bestSenior1) && o.getMarketChannelAssingment().getMarket().equals("Senior") ) ){
                bestSenior2 = o.getOrderPrice();
            }
        }
        for(Order o : orders){
            if((o.getOrderPrice() > bestSenior3) && ((bestSenior3<=bestSenior2) && o.getMarketChannelAssingment().getMarket().equals("Senior") ) ){
                bestSenior3 = o.getOrderPrice();
            }
        }
        //Market genz
        int bestGenz1 = -1;
        int bestGenz2 = -1;
        int bestGenz3 = -1;
        for(Order o : orders){
            if((o.getOrderPrice()>bestGenz1) && o.getMarketChannelAssingment().getMarket().equals("Genz")){
                bestGenz1 = o.getOrderPrice();
            }
        }
        for(Order o : orders){
            if((o.getOrderPrice() > bestGenz2) && ((bestGenz2<bestGenz1) && o.getMarketChannelAssingment().getMarket().equals("Genz") ) ){
                bestGenz2 = o.getOrderPrice();
            }
        }
        for(Order o : orders){
            if((o.getOrderPrice() > bestGenz3) && ((bestGenz3<=bestGenz2) && o.getMarketChannelAssingment().getMarket().equals("Genz") ) ){
                bestGenz3 = o.getOrderPrice();
            }
        }
//        ArrayList<Integer> top3 = new ArrayList<>();
        LinkedHashSet<Integer> top3 = new LinkedHashSet<>();
        top3.add(best1);
        top3.add(best2);
        top3.add(best3);
        top3.add(bestTeen1);
        top3.add(bestTeen2);
        top3.add(bestTeen3);
        top3.add(bestGenz1);
        top3.add(bestGenz2);
        top3.add(bestGenz3);
        top3.add(bestMill1);
        top3.add(bestMill2);
        top3.add(bestMill3);
        top3.add(bestSenior1);
        top3.add(bestSenior2);
        top3.add(bestSenior3);
        top3.add(bestStudent1);
        top3.add(bestStudent2);
        top3.add(bestStudent3);
        return top3;
    }
    
    public ArrayList<Order> getTop3Customers(){
        MasterOrderList masterOrderList = business.getMasterOrderList();
        ArrayList<Order> orders = masterOrderList.getOrders();
        int best1=-1;
        int best2=-1;
        int best3=-1;
        Order o1 = new Order();
        Order o2 = new Order();
        Order o3 = new Order();
        for(Order o : orders){
            if(o.getOrderPrice()> best1 ){
                ArrayList<OrderItem> orderItems = o.getOrderItems();
                int sum=0;
                for(OrderItem oi : orderItems){
                    sum+=oi.getSelectedProduct().getTargetPrice();
                }
                if(sum <= o.getOrderPrice()){
                    best1 = o.getOrderPrice();
                    o1 = o;
                }
                
            }
            if((o.getOrderPrice() > best2 && best2<=best1)){
                 ArrayList<OrderItem> orderItems = o.getOrderItems();
                int sum=0;
                for(OrderItem oi : orderItems){
                    sum+=oi.getSelectedProduct().getTargetPrice();
                }
                if(sum <= o.getOrderPrice()){
                    best2 = o.getOrderPrice();
                    o2 = o;
                }
            }
            
            if((o.getOrderPrice() > best3 && best3<=best2)){
                ArrayList<OrderItem> orderItems = o.getOrderItems();
                int sum=0;
                for(OrderItem oi : orderItems){
                    sum+=oi.getSelectedProduct().getTargetPrice();
                }
                if(sum <= o.getOrderPrice()){
                    best3 = o.getOrderPrice();
                    o3 = o;
                }
            }
        }
        ArrayList<Order> top3Custs = new ArrayList<>();
        top3Custs.add(o1);
        top3Custs.add(o2);
        top3Custs.add(o3);
        return top3Custs;
    }
    
    
    public ArrayList<Order> getTop3SalesPerson(){
        MasterOrderList masterOrderList = business.getMasterOrderList();
        ArrayList<Order> orders = masterOrderList.getOrders();
        int best1=-1;
        int best2=-1;
        int best3=-1;
        Order o1 = new Order();
        Order o2 = new Order();
        Order o3 = new Order();
        for(Order o : orders){
            if(o.getOrderPrice()> best1 ){
                ArrayList<OrderItem> orderItems = o.getOrderItems();
                int sum=0;
                for(OrderItem oi : orderItems){
                    sum+=oi.getSelectedProduct().getTargetPrice();
                }
                if(sum <= o.getOrderPrice()){
                    best1 = o.getOrderPrice();
                    o1 = o;
                }
                
            }
            if((o.getOrderPrice() > best2 && best2<=best1)){
                 ArrayList<OrderItem> orderItems = o.getOrderItems();
                int sum=0;
                for(OrderItem oi : orderItems){
                    sum+=oi.getSelectedProduct().getTargetPrice();
                }
                if(sum <= o.getOrderPrice()){
                    best2 = o.getOrderPrice();
                    o2 = o;
                }
            }
            
            if((o.getOrderPrice() > best3 && best3<=best2)){
                ArrayList<OrderItem> orderItems = o.getOrderItems();
                int sum=0;
                for(OrderItem oi : orderItems){
                    sum+=oi.getSelectedProduct().getTargetPrice();
                }
                if(sum <= o.getOrderPrice()){
                    best3 = o.getOrderPrice();
                    o3 = o;
                }
            }
        }
        ArrayList<Order> top3SalesPeople = new ArrayList<>();
        top3SalesPeople.add(o1);
        top3SalesPeople.add(o2);
        top3SalesPeople.add(o3);
        return top3SalesPeople;
    }
    
    public ArrayList<Integer> totalMarginalRevenueByMarkets(){
        MasterOrderList masterOrderList = business.getMasterOrderList();
        ArrayList<Order> orders = masterOrderList.getOrders();
//        int totalMRTeen = 0, totalMRB2B=0, totalMRCollege=0,totalMRSenior=0,totalMRMill=0;
        int actualSumTeen=0,targetSumTeen=0, actualSumB2b=0, targetSumB2b=0, actualSumCollege=0, targetSumCollege=0, actualSumSenior=0,
                targetSumSenior=0, actualSumMill=0, targetSumMill=0, actualSumGenz=0, targetSumGenz=0;
        for(Order o : orders){
            if(o.getMarketChannelAssingment().getMarket().equals("Teen")){
                actualSumTeen+=o.getOrderPrice();
                targetSumTeen+=o.getOrderTargetPrice();
            }
            if(o.getMarketChannelAssingment().getMarket().equals("B2B")){
                actualSumB2b+=o.getOrderPrice();
                targetSumB2b+=o.getOrderTargetPrice();
            }
            if(o.getMarketChannelAssingment().getMarket().equals("College Student")){
                actualSumCollege+=o.getOrderPrice();
                targetSumCollege+=o.getOrderTargetPrice();
            }
            
            if(o.getMarketChannelAssingment().getMarket().equals("Millenial")){
                actualSumMill+=o.getOrderPrice();
                targetSumMill+=o.getOrderTargetPrice();
            }
            if(o.getMarketChannelAssingment().getMarket().equals("Genz")){
                actualSumGenz+=o.getOrderPrice();
                targetSumGenz+=o.getOrderTargetPrice();
            }
            if(o.getMarketChannelAssingment().getMarket().equals("Senior")){
                actualSumSenior+=o.getOrderPrice();
                targetSumSenior+=o.getOrderTargetPrice();
            }
            
        }
        
        ArrayList<Integer> totalMR = new ArrayList<>();
        totalMR.add(actualSumTeen-targetSumTeen);
        totalMR.add(actualSumB2b-targetSumB2b);
        totalMR.add(actualSumTeen-targetSumTeen);
        totalMR.add(actualSumMill-targetSumMill);
        totalMR.add(actualSumCollege-targetSumCollege);
        totalMR.add(actualSumGenz-targetSumGenz);
        totalMR.add(actualSumSenior-targetSumSenior);
        return totalMR;
    }
    
    public ArrayList<Integer> pricingSolutionsEfficieny(){
        MasterOrderList masterOrderList = business.getMasterOrderList();
        ArrayList<Order> orders = masterOrderList.getOrders();
        int totalMRTeen = 0, totalMRB2B=0, totalMRCollege=0,totalMRSenior=0,totalMRMill=0,totalMRGenz=0;
        int actualSumTeen=0,targetSumTeen=0, actualSumB2b=0, targetSumB2b=0, actualSumCollege=0, targetSumCollege=0, actualSumSenior=0,
                targetSumSenior=0, actualSumMill=0, targetSumMill=0, actualSumGenz=0, targetSumGenz=0;
        for(Order o : orders){
            
            if(o.getMarketChannelAssingment().getMarket().equals("Teen") && (!(o.getSeason().equals("")))){
                actualSumTeen+=o.getOrderPrice();
                targetSumTeen+=o.getOrderTargetPrice();
            }
            if(o.getMarketChannelAssingment().getMarket().equals("B2B") && (!(o.getSeason().equals("")))){
                actualSumB2b+=o.getOrderPrice();
                targetSumB2b+=o.getOrderTargetPrice();
            }
            if(o.getMarketChannelAssingment().getMarket().equals("College Student") && (!(o.getSeason().equals("")))){
                actualSumCollege+=o.getOrderPrice();
                targetSumCollege+=o.getOrderTargetPrice();
            }
            
            if(o.getMarketChannelAssingment().getMarket().equals("Millenial")&& (!(o.getSeason().equals("")))){
                actualSumMill+=o.getOrderPrice();
                targetSumMill+=o.getOrderTargetPrice();
            }
            if(o.getMarketChannelAssingment().getMarket().equals("Genz")&& (!(o.getSeason().equals("")))){
                actualSumGenz+=o.getOrderPrice();
                targetSumGenz+=o.getOrderTargetPrice();
            }
            if(o.getMarketChannelAssingment().getMarket().equals("Senior")&& (!(o.getSeason().equals("")))){
                actualSumSenior+=o.getOrderPrice();
                targetSumSenior+=o.getOrderTargetPrice();
            }
            
            
    }
        totalMRTeen = actualSumTeen-targetSumTeen;
        totalMRB2B = actualSumB2b-targetSumB2b;
        totalMRCollege = actualSumCollege-targetSumCollege;
        totalMRSenior = actualSumSenior-targetSumSenior;
        totalMRGenz = actualSumGenz-targetSumGenz;
        totalMRMill = actualSumMill-targetSumMill;
        ArrayList<Integer> totalMR = new ArrayList<>();
        totalMR.add(totalMRTeen);
        totalMR.add(totalMRB2B);
        totalMR.add(totalMRCollege);
        totalMR.add(totalMRSenior);
        totalMR.add(totalMRGenz);
        totalMR.add(totalMRMill);
        return totalMR;
    }
}
