/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.ProductManagement;

/**
 *
 * @author kal bugrara
 */
//this class will extract summary data from the product
public class ProductSummary {

    Product subjectProduct;
    int numberOfSalesAboveTarget;
    int numberOfSalesBelowTarget;
    int productPricePerformance; //total profit above target --could be negative too
    int acutalSalesVolume;
    int rank; // will be done later

    public ProductSummary(Product p) {
        
        subjectProduct = p; //keeps track of the product itself not as well;
        numberOfSalesAboveTarget = p.getNumberOfProductSalesAboveTarget();
        productPricePerformance = p.getOrderPricePerformance();
        acutalSalesVolume = p.getSalesVolume();
        numberOfSalesBelowTarget = p.getNumberOfProductSalesBelowTarget();
    }

    public int getSalesRevenues() {
        return acutalSalesVolume;
    }

    public int getNumberAboveTarget() {
        return numberOfSalesAboveTarget;
    }

    public int getProductPricePerformance() {
        return productPricePerformance;
    }

    public int getNumberBelowTarget() {
        return numberOfSalesBelowTarget;
    }

    public boolean isProductAlwaysAboveTarget() {
        return false; // to be implemented
    }
}
