/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BioChemicalCompoundInventory;

import java.util.Date;

/**
 *
 * @author nisha
 */
public class BioChemicalCompoundInventory {
    
    private String bioChemCompound;
    private int reordering;
    private int minQuantity;
    private int maxQuantity;
    private Date DateOfExpiry;
    private String pharma;
    private int totalAvailableQuantity;
    private double priceOfPurchase;
    private double priceAtSell;
    private int productId;
    private int serialNumber;
    private int totalRequirement;
    private String reorderingProgress="N";

    public String getBioChemCompound() {
        return bioChemCompound;
    }

    public void setBioChemCompound(String bioChemCompound) {
        this.bioChemCompound = bioChemCompound;
    }

    public int getReordering() {
        return reordering;
    }

    public void setReordering(int reordering) {
        this.reordering = reordering;
    }

    public int getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(int minQuantity) {
        this.minQuantity = minQuantity;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public Date getDateOfExpiry() {
        return DateOfExpiry;
    }

    public void setDateOfExpiry(Date DateOfExpiry) {
        this.DateOfExpiry = DateOfExpiry;
    }

    public String getPharma() {
        return pharma;
    }

    public void setPharma(String pharma) {
        this.pharma = pharma;
    }

    public int getTotalAvailableQuantity() {
        return totalAvailableQuantity;
    }

    public void setTotalAvailableQuantity(int totalAvailableQuantity) {
        this.totalAvailableQuantity = totalAvailableQuantity;
    }

    public double getPriceOfPurchase() {
        return priceOfPurchase;
    }

    public void setPriceOfPurchase(double priceOfPurchase) {
        this.priceOfPurchase = priceOfPurchase;
    }

    public double getPriceAtSell() {
        return priceAtSell;
    }

    public void setPriceAtSell(double priceAtSell) {
        this.priceAtSell = priceAtSell;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getTotalRequirement() {
        return totalRequirement;
    }

    public void setTotalRequirement(int totalRequirement) {
        this.totalRequirement = totalRequirement;
    }

    public String getReorderingProgress() {
        return reorderingProgress;
    }

    public void setReorderingProgress(String reorderingProgress) {
        this.reorderingProgress = reorderingProgress;
    }
    
        @Override
     public String toString(){
       return this.bioChemCompound;
        }  
    
    
    
}
