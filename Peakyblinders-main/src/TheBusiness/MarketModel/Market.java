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
public class Market {

    String name;
    ArrayList<Channel> validChannels = new ArrayList<>();
    ArrayList<String> characteristics = new ArrayList<>(); //a way to describe in plain language what is that group
    ArrayList<Market> subMarkets = new ArrayList<>();
    int size;

    
    public Market(String m) {
        name = m;
        characteristics = new ArrayList();
        subMarkets = new ArrayList();
        validChannels = new ArrayList();
    }

    
    public void addCharactersitic(String c) {
        characteristics.add(c);
    }

    public void addValidChannel(Channel c) {

        validChannels.add(c);
    }
    public void addSubMarkets(Market m){
        subMarkets.add(m);
    }
     public void setName(String name){
         this.name = name;
     }

    public ArrayList<Channel> getValidChannels() {
        return validChannels;
    }

    public void setValidChannels(ArrayList<Channel> validChannels) {
        this.validChannels = validChannels;
    }

    public ArrayList<String> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(ArrayList<String> characteristics) {
        this.characteristics = characteristics;
    }

    public ArrayList<Market> getSubMarkets() {
        return subMarkets;
    }

    public void setSubMarkets(ArrayList<Market> subMarkets) {
        this.subMarkets = subMarkets;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
     

}
