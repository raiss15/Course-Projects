/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarketAnalytics;

import TheBusiness.MarketModel.MarketChannelAssignment;

/**
 *
 * @author kal bugrara
 */
public class MarketChannelSummary {
    MarketChannelAssignment marketChannelAssignment;
    int revenues;
    public MarketChannelSummary(MarketChannelAssignment mc){
        
        marketChannelAssignment = mc;        
        revenues = mc.getRevenues();        
    }

    public MarketChannelAssignment getMarketChannelAssignment() {
        return marketChannelAssignment;
    }

    public void setMarketChannelAssignment(MarketChannelAssignment marketChannelAssignment) {
        this.marketChannelAssignment = marketChannelAssignment;
    }

    public int getRevenues() {
        return revenues;
    }

    public void setRevenues(int revenues) {
        this.revenues = revenues;
    }
    

}
