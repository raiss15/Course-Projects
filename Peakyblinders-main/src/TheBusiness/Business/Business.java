/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.Business;

import MarketingManagement.MarketingPersonDirectory;
import TheBusiness.MarketModel.ChannelCatalog;
import java.util.ArrayList;
import TheBusiness.CustomerManagement.CustomerDirectory;
import TheBusiness.MarketModel.MarketCatalog;
import TheBusiness.MarketModel.MarketChannelComboCatalog;
import TheBusiness.OrderManagement.MasterOrderList;
import TheBusiness.Personnel.PersonDirectory;
import TheBusiness.ProductManagement.ProductSummary;
import TheBusiness.ProductManagement.ProductsReport;
import TheBusiness.MarketModel.SolutionOfferCatalog;
import TheBusiness.Personnel.EmployeeDirectory;
import TheBusiness.SolutionOrders.MasterSolutionOrderList;
import TheBusiness.SalesManagement.SalesPersonDirectory;
import TheBusiness.Supplier.Supplier;
import TheBusiness.Supplier.SupplierDirectory;
import TheBusiness.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class Business {

    String name;
    PersonDirectory personDirectory; //all people profiles regardless of the role
    MasterOrderList masterOrderList;
    CustomerDirectory customers;
    SupplierDirectory suppliers;
    MarketCatalog marketCatalog;
    ChannelCatalog channelCatalog;
    MarketChannelComboCatalog marketChannelComboCatalog;
    SolutionOfferCatalog solutionOfferCatalog;
    CustomerDirectory customerDirectory;
    EmployeeDirectory employeeDirectory;
    SalesPersonDirectory salesPersonDirectory;
    UserAccountDirectory userAccountDirectory;
    MarketingPersonDirectory marketingPersonDirectory;
    MasterSolutionOrderList masterSolutionOrderList;


    public Business(String n) {
        name = n;
        masterOrderList = new MasterOrderList();
        suppliers = new SupplierDirectory();

        personDirectory = new PersonDirectory();
        customerDirectory = new CustomerDirectory(this);
        salesPersonDirectory = new SalesPersonDirectory(this);
        userAccountDirectory = new UserAccountDirectory();
        marketingPersonDirectory = new MarketingPersonDirectory(this);

        marketCatalog = new MarketCatalog();

        channelCatalog = new ChannelCatalog();

//        Channel c = channelcatalog.newChannel("tv");
//        market.addValidChannel(c);
//        c = channelcatalog.newChannel("");

        marketChannelComboCatalog = new MarketChannelComboCatalog();
//        MarketChannelAssignment mca2 = marketChannelComboCatalog.newMarketChannelCombo(market, c);

        solutionOfferCatalog = new SolutionOfferCatalog();
        masterSolutionOrderList  = new MasterSolutionOrderList();
        employeeDirectory = new EmployeeDirectory(this);
    }
  
    public int getSalesVolume() {
        return masterOrderList.getSalesVolume();

    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public MarketingPersonDirectory getMarketingPersonDirectory() {
        return marketingPersonDirectory;
    }

    public SupplierDirectory getSupplierDirectory() {
        return suppliers;
    }

    public ProductsReport getSupplierPerformanceReport(String n) {
        Supplier supplier = suppliers.findSupplier(n);
        if (supplier == null) {
            return null;
        }
        return supplier.prepareProductsReport();

    }

    public ArrayList<ProductSummary> getSupplierProductsAlwaysAboveTarget(String n) {

        ProductsReport productsreport = getSupplierPerformanceReport(n);
        return productsreport.getProductsAlwaysAboveTarget();

    }

    public int getHowManySupplierProductsAlwaysAboveTarget(String n) {
        ProductsReport productsreport = getSupplierPerformanceReport(n); // see above
        int i = productsreport.getProductsAlwaysAboveTarget().size(); //return size of the arraylist
        return i;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public SalesPersonDirectory getSalesPersonDirectory() {
        return salesPersonDirectory;
    }

    public MasterOrderList getMasterOrderList() {
        return masterOrderList;
    }
    public void setMasterOrderList(MasterOrderList mol){
        this.masterOrderList = mol;
    }
    public MarketCatalog getMarketCatalog() {
        return marketCatalog;
    }

    public ChannelCatalog getChannelCatalog() {
        return channelCatalog;
    }
    public SolutionOfferCatalog getSolutionOfferCatalog(){
        return solutionOfferCatalog;
    }
    public MarketChannelComboCatalog getMarketChannelComboCatalog() {

        return marketChannelComboCatalog;
    }
    public MasterSolutionOrderList getMasterSolutionOrderList(){
        return masterSolutionOrderList;
    }
    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

}
