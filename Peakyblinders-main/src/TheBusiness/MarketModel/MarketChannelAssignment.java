/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.MarketModel;

import TheBusiness.SolutionOrders.SolutionOrder;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class MarketChannelAssignment {

    Market market;
    Channel channel;
    int adbudget;
    //int targetrevenue;
    ArrayList<SolutionOffer> solutionOfferList = new ArrayList<>();
    ArrayList<SolutionOrder> solutionOrderList = new ArrayList<>();
    
    public MarketChannelAssignment(Market m, Channel c) {

        market = m;
        channel = c;
        solutionOfferList = new ArrayList();
        solutionOrderList = new ArrayList();

    }
    public void addSolutionOffer(SolutionOffer soffer){
        
        solutionOfferList.add(soffer);
        
    }    
    public void addSolutionOrder(SolutionOrder so){
        
        solutionOrderList.add(so);
        
    }
    
    public int getRevenues(){
        int sum = 0;
        for(SolutionOrder so: solutionOrderList){
            sum = sum + so.getSolutionPrice();
            
        }
        return sum;
    }
    
    public boolean matches(Market m, Channel c) {

        if (market == m && channel == c) {
            return true;
        } else {
            return false;
        }
    }


    public boolean isMarketMatch(Market m) {

        if (market == m) {
            return true;
        }
        
        return false;
    }

    public Market getMarket() {
        return market;
    }
    public void setMarket(Market m){
        this.market = m;
    }
    public void setChannel(Channel c){
        this.channel = c;
    }
    public Channel getChannel() {
        return channel;
    }

    public boolean isChannelMatch(Channel c) {

        if (channel == c) {
            return true;
        }
        return false;
    }

    public int getAdbudget() {
        return adbudget;
    }

    public void setAdbudget(int adbudget) {
        this.adbudget = adbudget;
    }

    public ArrayList<SolutionOffer> getSolutionOfferList() {
        return solutionOfferList;
    }

    public void setSolutionOfferList(ArrayList<SolutionOffer> solutionOfferList) {
        this.solutionOfferList = solutionOfferList;
    }

    public ArrayList<SolutionOrder> getSolutionOrderList() {
        return solutionOrderList;
    }

    public void setSolutionOrderList(ArrayList<SolutionOrder> solutionOrderList) {
        this.solutionOrderList = solutionOrderList;
    }

    @Override
    public String toString() {
        return "MarketChannelAssignment{" + "market=" + market + ", channel=" + channel + ", adbudget=" + adbudget + ", solutionOfferList=" + solutionOfferList + ", solutionOrderList=" + solutionOrderList + '}';
    }
    
    
}
