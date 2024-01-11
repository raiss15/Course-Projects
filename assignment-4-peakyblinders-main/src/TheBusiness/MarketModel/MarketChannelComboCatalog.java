/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.MarketModel;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class MarketChannelComboCatalog {
    
    ArrayList<MarketChannelAssignment> marketChannelAssingmentList ;
    
   public MarketChannelComboCatalog() {
       
       marketChannelAssingmentList = new ArrayList();
       
   }
   
   public MarketChannelAssignment newMarketChannelCombo(Market m, Channel c){
       MarketChannelAssignment mcc = new MarketChannelAssignment(m, c);
       marketChannelAssingmentList.add(mcc);
       return mcc;
       
   }
   public MarketChannelAssignment finMarketChannelCombo(Market m, Channel c){
       
       for( MarketChannelAssignment mca: marketChannelAssingmentList){
           if(mca.matches(m,c)) return mca;
       }
       return null;
       
   }
}
