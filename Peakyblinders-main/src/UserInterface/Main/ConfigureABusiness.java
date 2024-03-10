/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Main;

import MarketingManagement.MarketingPersonDirectory;
import MarketingManagement.MarketingPersonProfile;
import TheBusiness.Business.Business;
import TheBusiness.CustomerManagement.CustomerDirectory;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.MarketModel.Channel;
import TheBusiness.MarketModel.ChannelCatalog;
import TheBusiness.MarketModel.Market;
import TheBusiness.MarketModel.MarketCatalog;
import TheBusiness.MarketModel.MarketChannelAssignment;
import TheBusiness.MarketModel.MarketChannelComboCatalog;
import TheBusiness.MarketModel.SolutionOffer;
import TheBusiness.MarketModel.SolutionOfferCatalog;
import TheBusiness.OrderManagement.MasterOrderList;
import TheBusiness.OrderManagement.MasterOrderReport;
import TheBusiness.OrderManagement.Order;
import TheBusiness.OrderManagement.OrderItem;
import TheBusiness.Personnel.EmployeeDirectory;
import TheBusiness.Personnel.EmployeeProfile;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.PersonDirectory;
import TheBusiness.ProductManagement.Product;
import TheBusiness.ProductManagement.ProductCatalog;
import TheBusiness.SalesManagement.SalesPersonDirectory;
import TheBusiness.SalesManagement.SalesPersonProfile;
import TheBusiness.SolutionOrders.MasterSolutionOrderList;
import TheBusiness.SolutionOrders.SolutionOrder;
import TheBusiness.Supplier.Supplier;
import TheBusiness.Supplier.SupplierDirectory;
import TheBusiness.UserAccountManagement.UserAccount;
import TheBusiness.UserAccountManagement.UserAccountDirectory;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {
    static String fileName = "./AEDCustomerSheet-Sheet1.csv";
    static DataReader datareader;
    static List<String[]> content = new ArrayList<>();
    static Business initialize() {
        
        readData();
        Business business = new Business("Xerox");
        SupplierDirectory suplierdirectory = business.getSupplierDirectory();

        Supplier supplier1 = suplierdirectory.newSupplier("Lenovo");
        ProductCatalog productcatalog = supplier1.getProductCatalog();
        Product products1p1 = productcatalog.newProduct("Scanner 3  1", 2000, 16500, 10000, 11000);
        Product products1p2 = productcatalog.newProduct("Scanner 4", 10000, 25000, 16500,20000);
        Product products1p3 = productcatalog.newProduct("Printer 2", 22000, 40000, 36500,34000);
        Product products1p4 = productcatalog.newProduct("Photocopier 2 ", 30000, 70000, 50000, 50000);
        Product products1p5 = productcatalog.newProduct("Scanner  5", 19000, 36500, 25000,20000);
        Product products1p6 = productcatalog.newProduct("Scanner 6", 90000, 125000, 105000, 105000);
        Product products1p7 = productcatalog.newProduct("Printer 3", 22000, 60000, 36500,40000);
        Product products1p8 = productcatalog.newProduct("Photocopier 3", 30000, 70000, 50000,40000);

        //       SupplierDirectory suplierdirectory = business.getSupplierDirectory();
        Supplier supplier2 = suplierdirectory.newSupplier("Epson");
        productcatalog = supplier2.getProductCatalog();
        Product products2p1 = productcatalog.newProduct("Scanner 13  1", 12000, 26000, 18500,20000);
        Product products2p2 = productcatalog.newProduct("Scanner 14", 90000, 165000, 125000,100000);
        Product products2p3 = productcatalog.newProduct("Color Printer 112", 422000, 540000, 495000, 500000);
        Product products2p4 = productcatalog.newProduct("Photocopier 922 ", 430000, 890000, 550000,500000);
        Product products2p5 = productcatalog.newProduct("Low toner Scanner  102", 195000, 500100, 365102, 375102);
        Product products2p6 = productcatalog.newProduct("Speedy color Scanner 611", 900000, 125000, 1650000,1660000);
        Product products2p7 = productcatalog.newProduct("Premier Printer 300", 322000, 470000, 736500,780000);
        Product products2p8 = productcatalog.newProduct("Color Photocopier 500", 350000, 580000, 780000,800000);

// Create Persons
        PersonDirectory persondirectory = business.getPersonDirectory();
// person representing sales organization        
        Person xeroxsalesperson001 = persondirectory.newPerson("Sales Person 1");
        Person xeroxsalesperson002 = persondirectory.newPerson("Sales Person 2");
        Person xeroxsalesperson003 = persondirectory.newPerson("Sales Person 3");
        Person xeroxmarketingperson001 = persondirectory.newPerson("Xerox marketing");
        Person xeroxadminperson001 = persondirectory.newPerson("Xerox admin");


// Create person objects to represent customer organizations. 
        Person personB2b1 = persondirectory.newPerson("Dell");
        Person personB2b2 = persondirectory.newPerson("Microsoft");
        Person personB2b3 = persondirectory.newPerson("Google");
        Person personB2b4 = persondirectory.newPerson("JP Morgan");
        Person personB2b5 = persondirectory.newPerson("State street"); //we use this as customer
        Person personTeen1 = persondirectory.newPerson("teen1"); //we use this as customer
        Person personTeen2 = persondirectory.newPerson("teen2"); //we use this as customer
        Person personTeen3 = persondirectory.newPerson("teen3"); //we use this as customer
        Person personCollege1 = persondirectory.newPerson("college1"); //we use this as customer
        Person personCollege2 = persondirectory.newPerson("college2"); //we use this as customer
        Person personCollege3 = persondirectory.newPerson("college3"); //we use this as customer
        Person personMill1 = persondirectory.newPerson("millenial1"); //we use this as customer
        Person personMill2 = persondirectory.newPerson("millenial2"); //we use this as customer
        Person personMill3 = persondirectory.newPerson("millenial3"); //we use this as customer
        Person personGen1 = persondirectory.newPerson("genz1"); //we use this as customer
        Person personGen2 = persondirectory.newPerson("genz2"); //we use this as customer
        Person personGen3 = persondirectory.newPerson("genz3"); //we use this as customer
        Person personSenior1 = persondirectory.newPerson("senior1"); //we use this as customer
        Person personSenior2 = persondirectory.newPerson("senior2"); //we use this as customer
        Person personSenior3 = persondirectory.newPerson("senior3"); //we use this as customer


// Create Customers
        CustomerDirectory customedirectory = business.getCustomerDirectory();
        CustomerProfile custB2b1 = customedirectory.newCustomerProfile(personB2b1);
        CustomerProfile custB2b2 = customedirectory.newCustomerProfile(personB2b2);
        CustomerProfile custB2b3 = customedirectory.newCustomerProfile(personB2b3);
        CustomerProfile custB2b4 = customedirectory.newCustomerProfile(personB2b4);
        CustomerProfile custB2b5 = customedirectory.newCustomerProfile(personB2b5);
        CustomerProfile custTeen1 = customedirectory.newCustomerProfile(personTeen1);
        CustomerProfile custTeen2 = customedirectory.newCustomerProfile(personTeen2);
        CustomerProfile custTeen3 = customedirectory.newCustomerProfile(personTeen3);
        CustomerProfile custCollege1 = customedirectory.newCustomerProfile(personCollege1);
        CustomerProfile custCollege2 = customedirectory.newCustomerProfile(personCollege2);
        CustomerProfile custCollege3 = customedirectory.newCustomerProfile(personCollege3);
        CustomerProfile custMill1 = customedirectory.newCustomerProfile(personMill1);
        CustomerProfile custMill2 = customedirectory.newCustomerProfile(personMill2);
        CustomerProfile custMill3 = customedirectory.newCustomerProfile(personMill3);
        CustomerProfile custGen1 = customedirectory.newCustomerProfile(personGen1);
        CustomerProfile custGen2 = customedirectory.newCustomerProfile(personGen2);
        CustomerProfile custGen3 = customedirectory.newCustomerProfile(personGen3);
        CustomerProfile custSenior1 = customedirectory.newCustomerProfile(personSenior1);
        CustomerProfile custSenior2 = customedirectory.newCustomerProfile(personSenior2);
        CustomerProfile custSenior3 = customedirectory.newCustomerProfile(personSenior3);

// Create Sales people
        SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory();
        SalesPersonProfile salespersonprofile1 = salespersondirectory.newSalesPersonProfile(xeroxsalesperson001);
        SalesPersonProfile salespersonprofile2 = salespersondirectory.newSalesPersonProfile(xeroxsalesperson002);
        SalesPersonProfile salespersonprofile3 = salespersondirectory.newSalesPersonProfile(xeroxsalesperson003);

// Create Marketing people
        MarketingPersonDirectory marketingpersondirectory = business.getMarketingPersonDirectory();
        MarketingPersonProfile marketingpersonprofile0 = marketingpersondirectory.newMarketingPersonProfile(xeroxmarketingperson001);

// Create Admins to manage the business
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);

// Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount ua1 = uadirectory.newUserAccount(salespersonprofile1, "Sales1", "XXXX"); /// order products for one of the customers and performed by a sales person
        UserAccount ua4 = uadirectory.newUserAccount(salespersonprofile2, "Sales2", "XXXX"); /// order products for one of the customers and performed by a sales person
        UserAccount ua5 = uadirectory.newUserAccount(salespersonprofile3, "Sales3", "XXXX"); /// order products for one of the customers and performed by a sales person
        UserAccount ua2 = uadirectory.newUserAccount(marketingpersonprofile0, "Marketing", "XXXX"); /// order products for one of the customers and performed by a sales person
        UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "Admin", "XXXX"); /// order products for one of the customers and performed by a sales person

// Process Orders on behalf of sales person and customer
        MasterOrderList masterorderlist = business.getMasterOrderList();
        Order order1 = masterorderlist.newOrder(custB2b4, salespersonprofile1);
        OrderItem oi1 = order1.newOrderItem(products1p1, 18000, 1);
        OrderItem oi2 = order1.newOrderItem(products1p2, 19500, 4);
        OrderItem oi3 = order1.newOrderItem(products1p3, 36500, 10);
        OrderItem oi4 = order1.newOrderItem(products1p4, 50000, 1);
        OrderItem oi5 = order1.newOrderItem(products1p5, 25000, 3);
        OrderItem oi6 = order1.newOrderItem(products1p6, 105000, 2);
        OrderItem oi7 = order1.newOrderItem(products1p7, 36500, 3);
        OrderItem oi8 = order1.newOrderItem(products1p8, 50000, 2);

        Order order12 = masterorderlist.newOrder(custB2b4, salespersonprofile1);
        OrderItem oi112 = order1.newOrderItem(products1p1, 17000, 1);
        OrderItem oi12 = order1.newOrderItem(products1p2, 9500, 4);
        OrderItem oi13 = order1.newOrderItem(products1p3, 29500, 10);
        OrderItem oi14 = order1.newOrderItem(products1p4, 30000, 1);
        OrderItem oi15 = order1.newOrderItem(products1p5, 2000, 3);
        OrderItem oi16 = order1.newOrderItem(products1p6, 95000, 2);
        OrderItem oi17 = order1.newOrderItem(products1p7, 26500, 3);
        OrderItem oi18 = order1.newOrderItem(products1p8, 40000, 2);
        
        
        
        //=============== Define markets and channels...

        MarketCatalog mc = business.getMarketCatalog();
        Market teenMarket = mc.newMarket("Teen");
        Market collegeMarket = mc.newMarket("College Student");
        Market millenialsMarket = mc.newMarket("Millennials");
        Market genzMarket = mc.newMarket("Genz");
        Market b2bMarket = mc.newMarket("B2B");

        ChannelCatalog channelCatalog = business.getChannelCatalog();

        Channel tvChannel = channelCatalog.newChannel("tv");
        Channel webChannel = channelCatalog.newChannel("web");
        Channel adChannel = channelCatalog.newChannel("ad");
        Channel radioChannel = channelCatalog.newChannel("radio");

        MarketChannelComboCatalog mccc = business.getMarketChannelComboCatalog();

        MarketChannelAssignment tvChannelTeenMarket = mccc.newMarketChannelCombo(teenMarket, tvChannel);
        MarketChannelAssignment webChannelTeenMarket = mccc.newMarketChannelCombo(teenMarket, webChannel);
        MarketChannelAssignment webChannelCollegeMarket = mccc.newMarketChannelCombo(collegeMarket, webChannel);
        MarketChannelAssignment adChannelCollegeMarket = mccc.newMarketChannelCombo(collegeMarket, adChannel);
        MarketChannelAssignment tvChannelCollegeMarket = mccc.newMarketChannelCombo(collegeMarket, tvChannel);
        MarketChannelAssignment collegeChannelCollegeMarket = mccc.newMarketChannelCombo(collegeMarket, webChannel);

        SolutionOfferCatalog solutionoffercatalog = business.getSolutionOfferCatalog();

        SolutionOffer solutionTvTeen = solutionoffercatalog.newSolutionOffer(tvChannelTeenMarket);
        solutionTvTeen.addProduct(products2p2);
        solutionTvTeen.addProduct(products2p1);
        solutionTvTeen.setTotalPrice(1000);

        SolutionOffer solutionWebTeen = solutionoffercatalog.newSolutionOffer(webChannelTeenMarket
        );
        solutionWebTeen.addProduct(products2p2);
        solutionWebTeen.addProduct(products2p1);
        solutionWebTeen.setTotalPrice(500);

        MasterSolutionOrderList msol = business.getMasterSolutionOrderList();

        SolutionOrder so = msol.newSolutionOrder(solutionTvTeen, tvChannelTeenMarket);
        
        SolutionOrder so2 = msol.newSolutionOrder(solutionWebTeen, webChannelTeenMarket);
        
        msol.getRevenueByMarketChannelCombo(tvChannelTeenMarket);
        msol.getRevenueByChannel(tvChannel);

        MasterOrderList masterOrderList = business.getMasterOrderList();
        
        int x=0,z=0;
        for(String [] a : content){
            x++;
            for(String s : a){
                
                z++;
                System.out.println("*************");
                System.out.println(s);
            }
        }
        String[][] row = new String[x][z];
//        int k=0,l=0;
         for (int i = 0; i < content.size(); i++) {
            row[i] = content.get(i);
        }
        
        for(int i=0;i<row.length;i++){
            for(int j=0;j<row[i].length;j++){
            if(i==0)
                continue;
            
        
            Order order = new Order();
//            MasterOrderReport masterOrderReport = new MasterOrderReport();
            
//            Product p = new Product();
            
            if(j==0){
                if(row[i][0].equals('1')){
                order.setCust("1");
            }
            if(row[i][0].equals('2')){
                order.setCust("2");
            }
            if(row[i][0].equals('3')){
                order.setCust("3");
            }
            if(row[i][0].equals('4')){
                order.setCust("4");
            }
            if(row[i][0].equals('5')){
                order.setCust("5");
            }
            if(row[i][0].equals('6')){
                order.setCust("6");
            }
            if(row[i][0].equals('7')){
                order.setCust("7");
            }
            if(row[i][0].equals('8')){
                order.setCust("8");
            }
            if(row[i][0].equals('9')){
                order.setCust("9");
            }
            if(row[i][0].equals("10")){
                order.setCust("10");
            }
            if(row[i][0].equals("11")){
                order.setCust("11");
            }
            if(row[i][0].equals("12")){
                order.setCust("12");
            }
            if(row[i][0].equals("13")){
                order.setCust("13");
            }
            if(row[i][0].equals("14")){
                order.setCust("14");
            }
            if(row[i][0].equals("15")){
                order.setCust("15");
            }
            if(row[i][0].equals("16")){
                order.setCust("16");
            }
            if(row[i][0].equals("17")){
                order.setCust("17");
            }
            if(row[i][0].equals("18")){
                order.setCust("18");
            }
            if(row[i][0].equals("19")){
                order.setCust("19");
            }
            if(row[i][0].equals("20")){
                order.setCust("20");
            }
            }
            
            
            
            if(row[i][4].equals("1")){
                Product p001 = new Product("printer 4",1099,1199, 1069);
                Product p002 = new Product("printer 5",1429, 1799, 1459);
                Product p003 = new Product("Scanner 3",144,169,149);
                Product p004 = new Product("Scanner 4", 219, 299, 249);
                Product p005 = new Product("Scanner 5",329,449,379);
                Product p006 = new Product("Ink bw", 12,18,14);
                Product p007 = new Product("Ink color",43,59,48);
                Product p008 = new Product("Fax inkjet",479,699,500);
                Product p009 = new Product("Fax laser",749,999,800);
                Product p010 = new Product("Paper a4",15,20,16);
                Product p011 = new Product("Paper a3",10,18,12);
                Product p012 = new Product("Paper bond",20,30,22);
                Product p013 = new Product("Photocopier 2",716,816,756);
                Product p014 = new Product("Photocopier 3",840,1099,890);
                OrderItem oi001 = new OrderItem(p001);
                OrderItem oi002 = new OrderItem(p002);
                OrderItem oi003 = new OrderItem(p003);
                OrderItem oi004 = new OrderItem(p004);
                OrderItem oi005 = new OrderItem(p005);
                OrderItem oi006 = new OrderItem(p006);
                OrderItem oi007 = new OrderItem(p007);
                OrderItem oi008 = new OrderItem(p008);
                OrderItem oi009 = new OrderItem(p009);
                OrderItem oi010 = new OrderItem(p010);
                OrderItem oi011 = new OrderItem(p011);
                OrderItem oi012 = new OrderItem(p012);
                OrderItem oi013 = new OrderItem(p013);
                OrderItem oi014 = new OrderItem(p014);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
            }
              if(row[i][4].equals("2")){
                Product p1 = new Product("printer 3",249,399, 299);
                Product p2 = new Product("printer 4",1099,1199, 1069);
                Product p3 = new Product("printer 5",1099,1199, 1069);
                Product p4 = new Product("Scanner 4",219, 2999, 249);
                Product p5 = new Product("Scanner 5",329,449,379);
                Product p6 = new Product("Ink bw", 12,18,14);
                Product p7 = new Product("Ink Color",43,59,48);
                Product p8 = new Product("Fax InkJet", 479,699,500);
                Product p9 = new Product("Fax Laser",749,999,800);
                
                Product p10 = new Product("Paper a4",15,20,16);
                Product p11 = new Product("Paper a3",10,18,12);
                Product p12 = new Product("Paper bond",20,30,22);
                Product p13 = new Product("Photocopier 2",420,500,450);
                Product p14 = new Product("Photocopier 3",840,1099,890);
                Product p15 = new Product("Photocopier 1",840,1099,890);
                
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
                OrderItem oi015 = new OrderItem(p15);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
                order.getOrderItems().add(oi015);
                
            }
            if(row[i][4].equals("3")){
                Product p1 = new Product("printer 2",249,399, 299);
                Product p2 = new Product("printer 3",649,800, 699);
                Product p3 = new Product("printer 4",1099,1199, 1069);
                Product p4 = new Product("Scanner 2",109, 149,119);
                Product p5 = new Product("Scanner 3",144, 169, 149);
                Product p6 = new Product("Scanner 4",219, 299, 249);
                
                Product p7 = new Product("Ink bw", 12,18,14);
                Product p8 = new Product("Ink Color",43,59,48);
                Product p9 = new Product("Fax InkJet", 479,699,500);
                
                
                Product p10 = new Product("Paper a4",15,20,16);
                Product p11 = new Product("Paper a3",10,18,12);
                Product p12 = new Product("Paper bond",20,30,22);
                Product p13 = new Product("Photocopier 1",420,500,450);
               
                Product p14 = new Product("Photocopier 2",716,816,856);
                
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
               
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
               
                
                
            }
            if(row[i][4].equals("4")){
                 
                Product p1 = new Product("printer 4",1049,1199, 1069);
                Product p2 = new Product("printer 5",1429,1799, 1459);
               
                Product p3 = new Product("Scanner 4",219, 299, 249);
                Product p4 = new Product("Scanner 5",329, 449, 3799);
                
                Product p5 = new Product("Ink bw", 12,18,14);
                Product p6 = new Product("Ink Color",43,59,48);
                Product p7 = new Product("Fax InkJet", 479,699,500);
                Product p8 = new Product("Fax Laser", 749,999,800);
                
                
                Product p9 = new Product("Paper a4",15,20,16);
                Product p10 = new Product("Paper a3",10,18,12);
                Product p11 = new Product("Paper bond",20,30,22);
                Product p12 = new Product("Photocopier 1",420,500,450);
               
                Product p13 = new Product("Photocopier 2",716,816,856);
                Product p14 = new Product("Photocopier 3",840,1099,900);
                
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
                
               
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
                

                
            }
            if(row[i][4].equals("5")){
                Product p1 = new Product("printer 3",249,399, 299);
                Product p2 = new Product("printer 4",1049,1199, 1069);
                Product p3 = new Product("printer 5",1429,1799, 1459);
               
                Product p4 = new Product("Scanner 4",219, 299, 249);
                Product p5 = new Product("Scanner 5",329, 449, 3799);
                
                Product p6 = new Product("Ink bw", 12,18,14);
                Product p7 = new Product("Ink Color",43,59,48);
                Product p8 = new Product("Fax InkJet", 479,699,500);
                
                
                
                Product p9 = new Product("Paper a4",15,20,16);
                Product p10 = new Product("Paper a3",10,18,12);
                Product p11 = new Product("Paper bond",20,30,22);
                Product p12 = new Product("Photocopier 1",420,500,450);
               
                Product p13 = new Product("Photocopier 2",716,816,856);
                Product p14 = new Product("Photocopier 3",840,1099,900);
                Product p15 = new Product("Fax Laser", 749,999,800);
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
                 OrderItem oi015 = new OrderItem(p15);
                
               
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
                order.getOrderItems().add(oi015);

                
            }
            if(row[i][4].equals("6")){
                Product p1 = new Product("printer 3",249,399, 299);
                Product p2 = new Product("printer 4",1049,1199, 1069);
                Product p3 = new Product("printer 2",649,800, 699);
               
                Product p4 = new Product("Scanner 4",219, 299, 249);
                Product p5 = new Product("Scanner 3",329, 449, 3799);
                Product p6 = new Product("Scanner 2",109, 149, 119);
                Product p7 = new Product("Ink bw", 12,18,14);
                Product p8 = new Product("Ink Color",43,59,48);
                Product p9 = new Product("Fax InkJet", 479,699,500);
                
                
                
                Product p10 = new Product("Paper a4",15,20,16);
                Product p11 = new Product("Paper a3",10,18,12);
                Product p12 = new Product("Paper bond",20,30,22);
                Product p13 = new Product("Photocopier 1",420,500,450);
               
                Product p14 = new Product("Photocopier 2",716,816,856);
                
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
                
                
               
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
                
                
            }
            if(row[i][4].equals("7")){
                
                Product p1 = new Product("printer 4",1049,1199, 1069);
                Product p2 = new Product("printer 5",1429,1799, 1459);
                
                
               
                Product p3 = new Product("Scanner 4",219, 299, 249);
                Product p4 = new Product("Scanner 5",329, 449, 3799);
                
                Product p5 = new Product("Ink bw", 12,18,14);
                Product p6 = new Product("Ink Color",43,59,48);
                Product p7 = new Product("Fax InkJet", 479,699,500);
                
                
                
                Product p8 = new Product("Paper a4",15,20,16);
                Product p9 = new Product("Paper a3",10,18,12);
                Product p10 = new Product("Paper bond",20,30,22);
                Product p11 = new Product("Photocopier 3",840,1099,890);
               
                Product p12 = new Product("Photocopier 2",716,816,856);
                Product p13 = new Product("Fax Laser", 749,999,800);
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                
                
                
               
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                

                
            }
            if(row[i][4].equals("8")){
                
                Product p1 = new Product("printer 4",1049,1199, 1069);
                Product p2 = new Product("printer 5",1429,1799, 1459);
                Product p3 = new Product("printer 3",249,399, 299);

                
                
                Product p4 = new Product("Scanner 4",219, 299, 249);
                Product p5 = new Product("Scanner 5",329, 449, 3799);
                
                Product p6 = new Product("Ink bw", 12,18,14);
                Product p7 = new Product("Ink Color",43,59,48);
                Product p8 = new Product("Fax InkJet", 479,699,500);
                
                
                
                Product p9 = new Product("Paper a4",15,20,16);
                Product p10 = new Product("Paper a3",10,18,12);
                Product p11 = new Product("Paper bond",20,30,22);
                Product p12 = new Product("Photocopier 3",840,1099,890);
               
                Product p13 = new Product("Photocopier 2",716,816,856);
                Product p14 = new Product("Fax Laser", 749,999,800);
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
                
                
                
               
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
                

                
                
            }
            if(row[i][4].equals("9")){
                Product p1 = new Product("printer 4",1049,1199, 1069);
                Product p2 = new Product("printer 2",649,800, 699);
                Product p3 = new Product("printer 3",249,399, 299);

                
                
                Product p4 = new Product("Scanner 4",219, 299, 249);
                Product p5 = new Product("Scanner 3",329, 449, 3799);
                
                Product p6 = new Product("Ink bw", 12,18,14);
                Product p7 = new Product("Ink Color",43,59,48);
                Product p8 = new Product("Fax InkJet", 479,699,500);
                
                
                
                Product p9 = new Product("Paper a4",15,20,16);
                Product p10 = new Product("Paper a3",10,18,12);
                Product p11 = new Product("Paper bond",20,30,22);
                Product p12 = new Product("Photocopier 1",420,500,450);
               
                Product p13 = new Product("Photocopier 2",716,816,856);
                Product p14 = new Product("Scanner 2",109, 149, 119);
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
                
                
                
               
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);

                
            }
            if(row[i][4].equals("10")){
                
		Product p1 = new Product("printer 4",1049,1199,1069);
		Product p2 = new Product("printer 5",1429,1799,1459);
		
                Product p3 = new Product("Scanner 4",219,299,249);
		Product p4 = new Product("Scanner 5",329,449,379);
                Product p5 = new Product("Ink bw", 12,18,14);
                Product p6 = new Product("Ink color",43,59,48);
                Product p7 = new Product("Fax inkjet",479,699,500);
                Product p8 = new Product("Fax laser",749,999,800);
                Product p9 = new Product("Paper a4",15,20,16);
                Product p10 = new Product("Paper a3",10,18,12);
                
		Product p11 = new Product("Paper bond",20,30,22);
		
                Product p12 = new Product("Photocopier 2",716,816,756);
                Product p13 = new Product("Photocopier 3",840,1099,890);
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                
            }
            if(row[i][4].equals("11")){
               
                Product p1 = new Product("printer 3",249,399,299);
		Product p2 = new Product("printer 4",1049,1199,1069);
		Product p3 = new Product("printer 5",1429,1799,1459);
		
                Product p4 = new Product("Scanner 4",219,299,249);
		Product p5 = new Product("Scanner 5",329,449,379);
                Product p6 = new Product("Ink bw", 12,18,14);
                Product p7 = new Product("Ink color",43,59,48);
                Product p8 = new Product("Fax inkjet",479,699,500);
                Product p9 = new Product("Fax laser",749,999,800);
                Product p10 = new Product("Paper a4",15,20,16);
                Product p11 = new Product("Paper a3",10,18,12);
                
		Product p12 = new Product("Paper bond",20,30,22);
		Product p13 = new Product("Photocopier 1",420,500,450);
                Product p14 = new Product("Photocopier 2",716,816,756);
                Product p15 = new Product("Photocopier 3",840,1099,890);
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
                OrderItem oi015 = new OrderItem(p15);
                
                
                
               
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
                order.getOrderItems().add(oi015);
                

                
            }
            if(row[i][4].equals("12")){
                	
		Product p1 = new Product("printer 2",649,800,699);
                Product p2 = new Product("printer 3",249,399,299);
		Product p3 = new Product("printer 4",1049,1199,1069);
		
		
		Product p4 = new Product("Scanner 2",109,149,119);
                Product p5 = new Product("Scanner 3",144,169,149);
                Product p6 = new Product("Scanner 4",219,299,249);
		
                Product p7 = new Product("Ink bw", 12,18,14);
                Product p8 = new Product("Ink color",43,59,48);
                Product p9 = new Product("Fax inkjet",479,699,500); 
                Product p10 = new Product("Paper a4",15,20,16);
                Product p11 = new Product("Paper a3",10,18,12);
               
		Product p12 = new Product("Paper bond",20,30,22);
		Product p13= new Product("Photocopier 1",420,500,450);
                Product p14 = new Product("Photocopier 2",716,816,756);
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
                
                
            }
            if(row[i][4].equals("13")){
		Product p1 = new Product("printer 2",649,800,699);
                Product p2 = new Product("printer 3",249,399,299);
		Product p3 = new Product("printer 4",1049,1199,1069);
		
		
		Product p4 = new Product("Scanner 2",109,149,119);
                Product p5 = new Product("Scanner 3",144,169,149);
                Product p6= new Product("Scanner 4",219,299,249);
		
                Product p7 = new Product("Ink bw", 12,18,14);
                Product p8 = new Product("Ink color",43,59,48);
                Product p9 = new Product("Fax inkjet",479,699,500);
                Product p10 = new Product("Fax laser",749,999,800);
                Product p11 = new Product("Paper a4",15,20,16);
                Product p12 = new Product("Paper a3",10,18,12);
                Product p13 = new Product("Paper a2",12,25,14);
		
		
                Product p14 = new Product("Photocopier 2",716,816,756);
                Product p15 = new Product("Photocopier 3",840,1099,890); 
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
                OrderItem oi015 = new OrderItem(p15);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
                order.getOrderItems().add(oi015);
                
                
            }
            if(row[i][4].equals("14")){
                
		

		Product p1 = new Product("printer 2",649,800,699);

                Product p2 = new Product("printer 3",249,399,299);

		Product p3 = new Product("Scanner 2",109,149,119);

                Product p4 = new Product("Scanner 3",144,169,149);

                Product p5 = new Product("Ink bw", 12,18,14);

                Product p6 = new Product("Ink color",43,59,48);

                

                
                Product p7 = new Product("Paper a3",10,18,12);

                Product p8 = new Product("Paper a2",12,25,14);

		

		Product p9 = new Product("Photocopier 1",420,500,450);

                Product p10 = new Product("Photocopier 2",716,816,756);

                
                 OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
               
                
                
            }
            if(row[i][4].equals("15")){
              
		Product p1 = new Product("printer 1",349,499,399);
                
                Product p2 = new Product("printer 2",649,800,699);

               

		Product p3 = new Product("Scanner 1",89,129,99);

		Product p4 = new Product("Scanner 2",109,149,119);

                

                Product p5 = new Product("Ink bw", 12,18,14);

                Product p6 = new Product("Ink color",43,59,48);

               
                

                Product p7 = new Product("Paper a3",10,18,12);

                Product p8 = new Product("Paper a2",12,25,14);

		

		Product p9 = new Product("Photocopier 1",420,500,450);

               
                 OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                
                
                
            }
            if(row[4].equals("16")){
               
		

		Product p1 = new Product("printer 2",649,800,699);

                Product p2 = new Product("printer 3",249,399,299);

		Product p3 = new Product("printer 4",1049,1199,1069);

		
		Product p4 = new Product("Scanner 2",109,149,119);

                Product p5 = new Product("Scanner 3",144,169,149);

                Product p6 = new Product("Scanner 4",219,299,249);

		
                Product p7 = new Product("Ink bw", 12,18,14);

                Product p8 = new Product("Ink color",43,59,48);

                
                Product p9 = new Product("Paper a4",15,20,16);

                Product p10 = new Product("Paper a3",10,18,12);

                Product p11 = new Product("Paper a2",12,25,14);


                Product p12 = new Product("Photocopier 2",716,816,756);

                Product p13 = new Product("Photocopier 3",840,1099,890);
                 OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                
                
                
            }
            if(row[4].equals("17")){
                

		Product p1 = new Product("printer 2",649,800,699);

                Product p2 = new Product("printer 3",249,399,299);


		
		Product p3 = new Product("Scanner 2",109,149,119);

                Product p4 = new Product("Scanner 3",144,169,149);

               
                Product p5 = new Product("Ink bw", 12,18,14);

                Product p6 = new Product("Ink color",43,59,48);

                Product p7 = new Product("Paper a4",15,20,16);

                Product p8 = new Product("Paper a3",10,18,12);

                Product p9 = new Product("Paper a2",12,25,14);


		Product p10 = new Product("Photocopier 1",420,500,450);

                Product p11 = new Product("Photocopier 2",716,816,756);

                 OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                
                
            }
            if(row[i][4].equals("18")){
               
		Product p1 = new Product("printer 1",349,499,399);

		Product p2 = new Product("printer 2",649,800,699);

		Product p3 = new Product("Scanner 1",89,129,99);

		Product p4 = new Product("Scanner 2",109,149,119);

                Product p5 = new Product("Ink bw", 12,18,14);

                Product p6 = new Product("Ink color",43,59,48);

                Product p7 = new Product("Paper a4",15,20,16);

                Product p8 = new Product("Paper a3",10,18,12);

		Product p9 = new Product("Photocopier 1",420,500,450);

                 OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
               
                
            }
            if(row[4].equals("19")){
              

		Product p1 = new Product("printer 2",649,800,699);

                Product p2 = new Product("printer 3",249,399,299);

		Product p3 = new Product("printer 4",1049,1199,1069);

		Product p4 = new Product("Scanner 1",89,129,99);

		Product p5 = new Product("Scanner 2",109,149,119);

                Product p6 = new Product("Scanner 3",144,169,149);

                Product p7 = new Product("Scanner 4",219,299,249);

                Product p8 = new Product("Ink bw", 12,18,14);

                Product p9 = new Product("Ink color",43,59,48);

                Product p10 = new Product("Paper a4",15,20,16);

                Product p11 = new Product("Paper a3",10,18,12);

                Product p12 = new Product("Paper a2",12,25,14);

		

		

                Product p13 = new Product("Photocopier 2",716,816,756);

                Product p14 = new Product("Photocopier 3",840,1099,890);
                 OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
               
                
                
            }
            if(row[4].equals("20")){

		Product p1 = new Product("printer 2",649,800,699);

                Product p2 = new Product("printer 3",249,399,299);

		
		

		Product p3 = new Product("Scanner 2",109,149,119);

                Product p4 = new Product("Scanner 3",144,169,149);

                

                Product p5 = new Product("Ink bw", 12,18,14);

                Product p6 = new Product("Ink color",43,59,48);

                

                Product p7 = new Product("Paper a4",15,20,16);

                Product p8 = new Product("Paper a3",10,18,12);

                Product p9 = new Product("Paper a2",12,25,14);

		

		Product p10 = new Product("Photocopier 1",420,500,450);

                Product p11 = new Product("Photocopier 2",716,816,756);

                
                 OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                
                
                
            }
            if(row[i][4].equals("21")){
                
		Product p1 = new Product("printer 1",349,499,399);

		Product p2 = new Product("printer 2",649,800,699);

                

		Product p3 = new Product("Scanner 1",89,129,99);

		Product p4 = new Product("Scanner 2",109,149,119);

                

                Product p5 = new Product("Ink bw", 12,18,14);

                Product p6 = new Product("Ink color",43,59,48);

                
                Product p7 = new Product("Paper a4",15,20,16);

                Product p8 = new Product("Paper a3",10,18,12);

                Product p9 = new Product("Paper a2",12,25,14);

		

		Product p10 = new Product("Photocopier 1",420,500,450);

               
                 OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                
                
                
            }
            if(row[i][4].equals("22")){
                
		

		Product p1 = new Product("printer 2",649,800,699);

                Product p2 = new Product("printer 3",249,399,299);

		Product p3 = new Product("printer 4",1049,1199,1069);

		

		Product p4 = new Product("Scanner 1",89,129,99);

		Product p5 = new Product("Scanner 2",109,149,119);

                

                Product p6 = new Product("Ink bw", 12,18,14);

                Product p7 = new Product("Ink color",43,59,48);

                

                Product p8 = new Product("Paper a4",15,20,16);

                Product p9 = new Product("Paper a3",10,18,12);

                Product p10 = new Product("Paper a2",12,25,14);

		Product p11 = new Product("Photocopier 1",420,500,450);

                
                 OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                
                
                
            }
            if(row[i][4].equals("23")){
                
		

		Product p1 = new Product("printer 2",649,800,699);

                Product p2 = new Product("printer 3",249,399,299);


		Product p3 = new Product("Scanner 2",109,149,119);

                Product p4 = new Product("Scanner 3",144,169,149);


                Product p5 = new Product("Ink bw", 12,18,14);

                Product p6 = new Product("Ink color",43,59,48);

                Product p7 = new Product("Paper a4",15,20,16);

                Product p8 = new Product("Paper a3",10,18,12);

                Product p9 = new Product("Paper a2",12,25,14);

		

		Product p10 = new Product("Photocopier 1",420,500,450);

                Product p11 = new Product("Photocopier 2",716,816,756);

                
                 OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                
                
                
            }
            if(row[i][4].equals("24")){
                
		Product p1 = new Product("printer 1",349,499,399);

		Product p2 = new Product("printer 2",649,800,699);

                

		Product p3 = new Product("Scanner 1",89,129,99);

		Product p4 = new Product("Scanner 2",109,149,119);

               

                Product p5 = new Product("Ink bw", 12,18,14);

                Product p6 = new Product("Ink color",43,59,48);


                Product p7 = new Product("Paper a3",10,18,12);

                Product p8 = new Product("Paper a2",12,25,14);

		Product p9 = new Product("Photocopier 1",420,500,450);

                 OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                
                
            }
            if(row[i][4].equals("25")){
              

		Product p1 = new Product("printer 2",649,800,699);

                Product p2 = new Product("printer 3",249,399,299);

		Product p3 = new Product("printer 4",1049,1199,1069);

		Product p4 = new Product("Scanner 2",109,149,119);

                Product p5 = new Product("Scanner 3",144,169,149);

                Product p6 = new Product("Scanner 4",219,299,249);

                Product p7 = new Product("Ink bw", 12,18,14);

                Product p8 = new Product("Ink color",43,59,48);

                Product p9 = new Product("Fax inkjet",479,699,500);

                Product p10 = new Product("Fax laser",749,999,800);

                Product p11 = new Product("Paper a4",15,20,16);

                Product p12 = new Product("Paper a3",10,18,12);

                Product p13 = new Product("Paper a2",12,25,14);

                Product p14 = new Product("Photocopier 2",716,816,756);

                Product p15 = new Product("Photocopier 3",840,1099,890);
                 OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
                OrderItem oi015 = new OrderItem(p15);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
                order.getOrderItems().add(oi015);
                
                
            }
            if(row[i][4].equals("26")){
                
		

		Product p1 = new Product("printer 2",649,800,699);

                Product p2 = new Product("printer 3",249,399,299);

		

		Product p3 = new Product("Scanner 2",109,149,119);

                Product p4 = new Product("Scanner 3",144,169,149);

                

                Product p5 = new Product("Ink bw", 12,18,14);

                Product p6 = new Product("Ink color",43,59,48);

                Product p7 = new Product("Fax inkjet",479,699,500);

                

                Product p8 = new Product("Paper a4",15,20,16);

                Product p9 = new Product("Paper a3",10,18,12);

                Product p10 = new Product("Paper a2",12,25,14);

		

		Product p11 = new Product("Photocopier 1",420,500,450);

                Product p12 = new Product("Photocopier 2",716,816,756);

                Product p13 = new Product("Photocopier 3",840,1099,890);
                 OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
               
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                
                
                
            }
            if(row[i][4].equals("27")){
                
		Product p1 = new Product("printer 1",349,499,399);

		Product p2 = new Product("printer 2",649,800,699);

               

		Product p3 = new Product("Scanner 1",89,129,99);

		Product p4 = new Product("Scanner 2",109,149,119);

                

                Product p5 = new Product("Ink bw", 12,18,14);

                Product p6 = new Product("Ink color",43,59,48);

                

                
                Product p7 = new Product("Paper a3",10,18,12);

                Product p8 = new Product("Paper a2",12,25,14);

		

		Product p9 = new Product("Photocopier 1",420,500,450);

                Product p10 = new Product("Photocopier 2",716,816,756);

                
                 OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                
                
                
            }
            if(row[i][4].equals("28")){
                
		
		Product p1 = new Product("printer 2",649,800,699);

                Product p2 = new Product("printer 3",249,399,299);

		Product p3 = new Product("printer 4",1049,1199,1069);

		Product p4 = new Product("Scanner 2",109,149,119);

                Product p5 = new Product("Scanner 3",144,169,149);

                Product p6 = new Product("Scanner 4",219,299,249);

		

                Product p7 = new Product("Ink bw", 12,18,14);

                Product p8 = new Product("Ink color",43,59,48);

                Product p9 = new Product("Fax inkjet",479,699,500);

                Product p10 = new Product("Fax laser",749,999,800);

                Product p11 = new Product("Paper a4",15,20,16);

                Product p12 = new Product("Paper a3",10,18,12);

                Product p13 = new Product("Paper a2",12,25,14);

		
                Product p14 = new Product("Photocopier 2",716,816,756);

                Product p15 = new Product("Photocopier 3",840,1099,890);
                 OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
                OrderItem oi015 = new OrderItem(p15);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
                order.getOrderItems().add(oi015);
                
                
            }
            if(row[i][4].equals("29")){
                
		

		Product p1 = new Product("printer 2",649,800,699);

                Product p2 = new Product("printer 3",249,399,299);


		Product p3 = new Product("Scanner 2",109,149,119);

                Product p4 = new Product("Scanner 3",144,169,149);


                Product p5 = new Product("Ink bw", 12,18,14);

                Product p6 = new Product("Ink color",43,59,48);

                Product p7 = new Product("Fax inkjet",479,699,500);


                Product p8 = new Product("Paper a4",15,20,16);

                Product p9 = new Product("Paper a3",10,18,12);

                Product p10 = new Product("Paper a2",12,25,14);


		Product p11 = new Product("Photocopier 1",420,500,450);

                Product p12 = new Product("Photocopier 2",716,816,756);

                Product p13 = new Product("Photocopier 3",840,1099,890);
                 OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                
                
            }
            if(row[i][4].equals("30")){
                
		Product p1 = new Product("printer 1",349,499,399);

		Product p2 = new Product("printer 2",649,800,699);

               

		Product p3 = new Product("Scanner 1",89,129,99);

		Product p4 = new Product("Scanner 2",109,149,119);

                

                Product p5 = new Product("Ink bw", 12,18,14);

                Product p6 = new Product("Ink color",43,59,48);

                

                

                Product p7 = new Product("Paper a3",10,18,12);

                Product p8 = new Product("Paper a2",12,25,14);

		

		Product p9 = new Product("Photocopier 1",420,500,450);

                Product p10 = new Product("Photocopier 2",716,816,756);

                
                 OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
               
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
            }

          
            if(row[i][4].equals("31")){
                Product p1 = new Product("printer 2",649,800,699);
                Product p2 = new Product("printer 3",249,399,299);
 		Product p3 = new Product("printer 4",1049,1199,1069);
		Product p4 = new Product("Scanner 2",109,149,119);
                Product p5 = new Product("Scanner 3",144,169,149);
                Product p6 = new Product("Scanner 4",219,299,249);
                Product p7 = new Product("Ink bw", 12,18,14);
                Product p8 = new Product("Ink color",43,59,48);
                Product p9 = new Product("Fax inkjet",479,699,500);
		Product p10 = new Product("Fax laser",749,999,800);
                Product p11 = new Product("Paper a4",15,20,16);
                Product p12 = new Product("Paper a3",10,18,12);
                Product p13 = new Product("Paper a2",12,25,14);
                Product p14 = new Product("Photocopier 2",716,816,756);
                Product p15 = new Product("Photocopier 3",840,1099,890);
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
		OrderItem oi015 = new OrderItem(p15);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
		order.getOrderItems().add(oi015);
            }
if(row[i][4].equals("32")){
                Product p1 = new Product("printer 2",649,800,699);
                Product p2 = new Product("printer 3",249,399,299);
		Product p3 = new Product("Scanner 2",109,149,119);
                Product p4 = new Product("Scanner 3",144,169,149);
                Product p5 = new Product("Ink bw", 12,18,14);
                Product p6 = new Product("Ink color",43,59,48);
                Product p7 = new Product("Fax inkjet",479,699,500);
                Product p8 = new Product("Paper a4",15,20,16);
                Product p9 = new Product("Paper a3",10,18,12);
                Product p10 = new Product("Paper a2",12,25,14);
		Product p11 = new Product("Photocopier 1",420,500,450);
                Product p12 = new Product("Photocopier 2",716,816,756);
                Product p13 = new Product("Photocopier 3",840,1099,890);
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
            }
if(row[i][4].equals("33")){
                Product p1 = new Product("printer 1",349,499,399);
		Product p2 = new Product("printer 2",649,800,699);
		Product p3 = new Product("Scanner 1",89,129,99);
		Product p4 = new Product("Scanner 2",109,149,119);
                Product p5 = new Product("Ink bw", 12,18,14);
                Product p6 = new Product("Ink color",43,59,48);
                Product p7 = new Product("Paper a3",10,18,12);
                Product p8 = new Product("Paper a2",12,25,14);
		Product p9 = new Product("Photocopier 1",420,500,450);
                Product p10 = new Product("Photocopier 2",716,816,756);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
            }
if(row[i][4].equals("34")){
                Product p1 = new Product("printer 2",649,800,699);
                Product p2 = new Product("printer 3",249,399,299);
 		Product p3 = new Product("printer 4",1049,1199,1069);
		Product p4 = new Product("Scanner 2",109,149,119);
                Product p5 = new Product("Scanner 3",144,169,149);
                Product p6 = new Product("Scanner 4",219,299,249);
                Product p7 = new Product("Ink bw", 12,18,14);
                Product p8 = new Product("Ink color",43,59,48);
                Product p9 = new Product("Fax inkjet",479,699,500);
		Product p10 = new Product("Fax laser",749,999,800);
                Product p11 = new Product("Paper a4",15,20,16);
                Product p12 = new Product("Paper a3",10,18,12);
                Product p13 = new Product("Paper a2",12,25,14);
                Product p14 = new Product("Photocopier 2",716,816,756);
                Product p15 = new Product("Photocopier 3",840,1099,890);
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
		OrderItem oi015 = new OrderItem(p15);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
		order.getOrderItems().add(oi015);
            }
if(row[i][4].equals("35")){
                Product p1 = new Product("printer 2",649,800,699);
                Product p2 = new Product("printer 3",249,399,299);
		Product p3 = new Product("Scanner 2",109,149,119);
                Product p4 = new Product("Scanner 3",144,169,149);
                Product p5 = new Product("Ink bw", 12,18,14);
                Product p6 = new Product("Ink color",43,59,48);
                Product p7 = new Product("Fax inkjet",479,699,500);
                Product p8 = new Product("Paper a4",15,20,16);
                Product p9 = new Product("Paper a3",10,18,12);
                Product p10 = new Product("Paper a2",12,25,14);
		Product p11 = new Product("Photocopier 1",420,500,450);
                Product p12 = new Product("Photocopier 2",716,816,756);
                Product p13 = new Product("Photocopier 3",840,1099,890);
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
            }
if(row[i][4].equals("36")){
                Product p1 = new Product("printer 1",349,499,399);
		Product p2 = new Product("printer 2",649,800,699);
		Product p3 = new Product("Scanner 1",89,129,99);
		Product p4 = new Product("Scanner 2",109,149,119);
                Product p5 = new Product("Ink bw", 12,18,14);
                Product p6 = new Product("Ink color",43,59,48);
                Product p7 = new Product("Paper a3",10,18,12);
                Product p8 = new Product("Paper a2",12,25,14);
		Product p9 = new Product("Photocopier 1",420,500,450);
                Product p10 = new Product("Photocopier 2",716,816,756);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
            }
if(row[i][4].equals("37")){
		Product p1 = new Product("printer 2",649,800,699);
                Product p2 = new Product("printer 3",249,399,299);
 		Product p3 = new Product("printer 4",1049,1199,1069);
		Product p4 = new Product("printer 5",1429,1799,1459);
		Product p5 = new Product("Scanner 2",109,149,119);
                Product p6 = new Product("Scanner 3",144,169,149);
                Product p7 = new Product("Scanner 4",219,299,249);
		Product p8 = new Product("Scanner 5",329,449,379);
                Product p9 = new Product("Ink bw", 12,18,14);
                Product p10 = new Product("Ink color",43,59,48);
                Product p11 = new Product("Fax inkjet",479,699,500);
                Product p12 = new Product("Fax laser",749,999,800);
                Product p13 = new Product("Paper a4",15,20,16);
                Product p14 = new Product("Paper a3",10,18,12);
                Product p15 = new Product("Paper a2",12,25,14);
		Product p16 = new Product("Paper bond",20,30,22);
                Product p17 = new Product("Photocopier 2",716,816,756);
                Product p18 = new Product("Photocopier 3",840,1099,890);
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
		OrderItem oi015 = new OrderItem(p15);
		OrderItem oi016 = new OrderItem(p16);
                OrderItem oi017 = new OrderItem(p17);
		OrderItem oi018 = new OrderItem(p18);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
		order.getOrderItems().add(oi015);
		order.getOrderItems().add(oi016);
                order.getOrderItems().add(oi017);
		order.getOrderItems().add(oi018);
            }
if(row[i][4].equals("38")){
		Product p1 = new Product("printer 2",649,800,699);
                Product p2 = new Product("printer 3",249,399,299);
 		Product p3 = new Product("printer 4",1049,1199,1069);
		Product p4 = new Product("Scanner 2",109,149,119);
                Product p5 = new Product("Scanner 3",144,169,149);
                Product p6 = new Product("Scanner 4",219,299,249);
                Product p7 = new Product("Ink bw", 12,18,14);
                Product p8 = new Product("Ink color",43,59,48);
                Product p9 = new Product("Fax inkjet",479,699,500);
                Product p10 = new Product("Fax laser",749,999,800);
                Product p11 = new Product("Paper a4",15,20,16);
                Product p12 = new Product("Paper a3",10,18,12);
                Product p13 = new Product("Paper a2",12,25,14);
		Product p14 = new Product("Paper bond",20,30,22);
		Product p15 = new Product("Photocopier 1",420,500,450);
                Product p16 = new Product("Photocopier 2",716,816,756);
                Product p17 = new Product("Photocopier 3",840,1099,890);
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
		OrderItem oi015 = new OrderItem(p15);
		OrderItem oi016 = new OrderItem(p16);
                OrderItem oi017 = new OrderItem(p17);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
		order.getOrderItems().add(oi015);
		order.getOrderItems().add(oi016);
                order.getOrderItems().add(oi017);
            }
if(row[i][4].equals("39")){
		Product p1 = new Product("printer 1",349,499,399);
		Product p2 = new Product("printer 2",649,800,699);
                Product p3 = new Product("printer 3",249,399,299);
		Product p4 = new Product("Scanner 1",89,129,99);
		Product p5 = new Product("Scanner 2",109,149,119);
                Product p6 = new Product("Scanner 3",144,169,149);
                Product p7 = new Product("Ink bw", 12,18,14);
                Product p8 = new Product("Ink color",43,59,48);
                Product p9 = new Product("Fax inkjet",479,699,500);
                Product p10 = new Product("Paper a4",15,20,16);
                Product p11 = new Product("Paper a3",10,18,12);
                Product p12 = new Product("Paper a2",12,25,14);
		Product p13 = new Product("Photocopier 1",420,500,450);
                Product p14 = new Product("Photocopier 2",716,816,756);                			
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
            }
if(row[i][4].equals("40")){
		Product p1 = new Product("printer 2",649,800,699);
                Product p2 = new Product("printer 3",249,399,299);
 		Product p3 = new Product("printer 4",1049,1199,1069);
		Product p4 = new Product("printer 5",1429,1799,1459);
		Product p5 = new Product("Scanner 2",109,149,119);
                Product p6 = new Product("Scanner 3",144,169,149);
                Product p7 = new Product("Scanner 4",219,299,249);
		Product p8 = new Product("Scanner 5",329,449,379);
                Product p9 = new Product("Ink bw", 12,18,14);
                Product p10 = new Product("Ink color",43,59,48);
                Product p11 = new Product("Fax inkjet",479,699,500);
                Product p12 = new Product("Fax laser",749,999,800);
                Product p13 = new Product("Paper a4",15,20,16);
                Product p14 = new Product("Paper a3",10,18,12);
                Product p15 = new Product("Paper a2",12,25,14);
		Product p16 = new Product("Paper bond",20,30,22);
                Product p17 = new Product("Photocopier 2",716,816,756);
                Product p18 = new Product("Photocopier 3",840,1099,890);
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
		OrderItem oi015 = new OrderItem(p15);
		OrderItem oi016 = new OrderItem(p16);
                OrderItem oi017 = new OrderItem(p17);
		OrderItem oi018 = new OrderItem(p18);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
		order.getOrderItems().add(oi015);
		order.getOrderItems().add(oi016);
                order.getOrderItems().add(oi017);
		order.getOrderItems().add(oi018);
            }
if(row[i][4].equals("41")){
		Product p1 = new Product("printer 2",649,800,699);
                Product p2 = new Product("printer 3",249,399,299);
 		Product p3 = new Product("printer 4",1049,1199,1069);
		Product p4 = new Product("Scanner 2",109,149,119);
                Product p5 = new Product("Scanner 3",144,169,149);
                Product p6 = new Product("Scanner 4",219,299,249);
                Product p7 = new Product("Ink bw", 12,18,14);
                Product p8 = new Product("Ink color",43,59,48);
                Product p9 = new Product("Fax inkjet",479,699,500);
                Product p10 = new Product("Fax laser",749,999,800);
                Product p11 = new Product("Paper a4",15,20,16);
                Product p12 = new Product("Paper a3",10,18,12);
                Product p13 = new Product("Paper a2",12,25,14);
		Product p14 = new Product("Paper bond",20,30,22);
		Product p15 = new Product("Photocopier 1",420,500,450);
                Product p16 = new Product("Photocopier 2",716,816,756);
                Product p17 = new Product("Photocopier 3",840,1099,890);
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
		OrderItem oi015 = new OrderItem(p15);
		OrderItem oi016 = new OrderItem(p16);
                OrderItem oi017 = new OrderItem(p17);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
		order.getOrderItems().add(oi015);
		order.getOrderItems().add(oi016);
                order.getOrderItems().add(oi017);
            }
if(row[i][4].equals("42")){
		Product p1 = new Product("printer 1",349,499,399);
		Product p2 = new Product("printer 2",649,800,699);
                Product p3 = new Product("printer 3",249,399,299);
		Product p4 = new Product("Scanner 1",89,129,99);
		Product p5 = new Product("Scanner 2",109,149,119);
                Product p6 = new Product("Scanner 3",144,169,149);
                Product p7 = new Product("Ink bw", 12,18,14);
                Product p8 = new Product("Ink color",43,59,48);
                Product p9 = new Product("Fax inkjet",479,699,500);
                Product p10 = new Product("Paper a4",15,20,16);
                Product p11 = new Product("Paper a3",10,18,12);
                Product p12 = new Product("Paper a2",12,25,14);
		Product p13 = new Product("Photocopier 1",420,500,450);
                Product p14 = new Product("Photocopier 2",716,816,756);                			
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
            }
if(row[i][4].equals("43")){
		Product p1 = new Product("printer 2",649,800,699);
                Product p2 = new Product("printer 3",249,399,299);
 		Product p3 = new Product("printer 4",1049,1199,1069);
		Product p4 = new Product("printer 5",1429,1799,1459);
		Product p5 = new Product("Scanner 2",109,149,119);
                Product p6 = new Product("Scanner 3",144,169,149);
                Product p7 = new Product("Scanner 4",219,299,249);
		Product p8 = new Product("Scanner 5",329,449,379);
                Product p9 = new Product("Ink bw", 12,18,14);
                Product p10 = new Product("Ink color",43,59,48);
                Product p11 = new Product("Fax inkjet",479,699,500);
                Product p12 = new Product("Fax laser",749,999,800);
                Product p13 = new Product("Paper a4",15,20,16);
                Product p14 = new Product("Paper a3",10,18,12);
                Product p15 = new Product("Paper a2",12,25,14);
		Product p16 = new Product("Paper bond",20,30,22);
                Product p17 = new Product("Photocopier 2",716,816,756);
                Product p18 = new Product("Photocopier 3",840,1099,890);
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
		OrderItem oi015 = new OrderItem(p15);
		OrderItem oi016 = new OrderItem(p16);
                OrderItem oi017 = new OrderItem(p17);
		OrderItem oi018 = new OrderItem(p18);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
		order.getOrderItems().add(oi015);
		order.getOrderItems().add(oi016);
                order.getOrderItems().add(oi017);
		order.getOrderItems().add(oi018);
            }
if(row[i][4].equals("44")){
		Product p1 = new Product("printer 2",649,800,699);
                Product p2 = new Product("printer 3",249,399,299);
 		Product p3 = new Product("printer 4",1049,1199,1069);
		Product p4 = new Product("Scanner 2",109,149,119);
                Product p5 = new Product("Scanner 3",144,169,149);
                Product p6 = new Product("Scanner 4",219,299,249);
                Product p7 = new Product("Ink bw", 12,18,14);
                Product p8 = new Product("Ink color",43,59,48);
                Product p9 = new Product("Fax inkjet",479,699,500);
                Product p10 = new Product("Fax laser",749,999,800);
                Product p11 = new Product("Paper a4",15,20,16);
                Product p12 = new Product("Paper a3",10,18,12);
                Product p13 = new Product("Paper a2",12,25,14);
		Product p14 = new Product("Paper bond",20,30,22);
		Product p15 = new Product("Photocopier 1",420,500,450);
                Product p16 = new Product("Photocopier 2",716,816,756);
                Product p17 = new Product("Photocopier 3",840,1099,890);
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
		OrderItem oi015 = new OrderItem(p15);
		OrderItem oi016 = new OrderItem(p16);
                OrderItem oi017 = new OrderItem(p17);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
		order.getOrderItems().add(oi015);
		order.getOrderItems().add(oi016);
                order.getOrderItems().add(oi017);
            }
if(row[i][4].equals("45")){
		Product p1 = new Product("printer 1",349,499,399);
		Product p2 = new Product("printer 2",649,800,699);
                Product p3 = new Product("printer 3",249,399,299);
		Product p4 = new Product("Scanner 1",89,129,99);
		Product p5 = new Product("Scanner 2",109,149,119);
                Product p6 = new Product("Scanner 3",144,169,149);
                Product p7 = new Product("Ink bw", 12,18,14);
                Product p8 = new Product("Ink color",43,59,48);
                Product p9 = new Product("Fax inkjet",479,699,500);
                Product p10 = new Product("Paper a4",15,20,16);
                Product p11 = new Product("Paper a3",10,18,12);
                Product p12 = new Product("Paper a2",12,25,14);
		Product p13 = new Product("Photocopier 1",420,500,450);
                Product p14 = new Product("Photocopier 2",716,816,756);                			
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
            }
if(row[i][4].equals("46")){
		Product p1 = new Product("printer 2",649,800,699);
                Product p2 = new Product("printer 3",249,399,299);
 		Product p3 = new Product("printer 4",1049,1199,1069);
		Product p4 = new Product("printer 5",1429,1799,1459);
		Product p5 = new Product("Scanner 2",109,149,119);
                Product p6 = new Product("Scanner 3",144,169,149);
                Product p7 = new Product("Scanner 4",219,299,249);
		Product p8 = new Product("Scanner 5",329,449,379);
                Product p9 = new Product("Ink bw", 12,18,14);
                Product p10 = new Product("Ink color",43,59,48);
                Product p11 = new Product("Fax inkjet",479,699,500);
                Product p12 = new Product("Fax laser",749,999,800);
                Product p13 = new Product("Paper a4",15,20,16);
                Product p14 = new Product("Paper a3",10,18,12);
                Product p15 = new Product("Paper a2",12,25,14);
		Product p16 = new Product("Paper bond",20,30,22);
                Product p17 = new Product("Photocopier 2",716,816,756);
                Product p18 = new Product("Photocopier 3",840,1099,890);
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
		OrderItem oi015 = new OrderItem(p15);
		OrderItem oi016 = new OrderItem(p16);
                OrderItem oi017 = new OrderItem(p17);
		OrderItem oi018 = new OrderItem(p18);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
		order.getOrderItems().add(oi015);
		order.getOrderItems().add(oi016);
                order.getOrderItems().add(oi017);
		order.getOrderItems().add(oi018);
            }
if(row[i][4].equals("47")){
		Product p1 = new Product("printer 2",649,800,699);
                Product p2 = new Product("printer 3",249,399,299);
 		Product p3 = new Product("printer 4",1049,1199,1069);
		Product p4 = new Product("Scanner 2",109,149,119);
                Product p5 = new Product("Scanner 3",144,169,149);
                Product p6 = new Product("Scanner 4",219,299,249);
                Product p7 = new Product("Ink bw", 12,18,14);
                Product p8 = new Product("Ink color",43,59,48);
                Product p9 = new Product("Fax inkjet",479,699,500);
                Product p10 = new Product("Fax laser",749,999,800);
                Product p11 = new Product("Paper a4",15,20,16);
                Product p12 = new Product("Paper a3",10,18,12);
                Product p13 = new Product("Paper a2",12,25,14);
		Product p14 = new Product("Paper bond",20,30,22);
		Product p15 = new Product("Photocopier 1",420,500,450);
                Product p16 = new Product("Photocopier 2",716,816,756);
                Product p17 = new Product("Photocopier 3",840,1099,890);
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
		OrderItem oi015 = new OrderItem(p15);
		OrderItem oi016 = new OrderItem(p16);
                OrderItem oi017 = new OrderItem(p17);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
		order.getOrderItems().add(oi015);
		order.getOrderItems().add(oi016);
                order.getOrderItems().add(oi017);
            }
if(row[i][4].equals("48")){
		Product p1 = new Product("printer 1",349,499,399);
		Product p2 = new Product("printer 2",649,800,699);
                Product p3 = new Product("printer 3",249,399,299);
		Product p4 = new Product("Scanner 1",89,129,99);
		Product p5 = new Product("Scanner 2",109,149,119);
                Product p6 = new Product("Scanner 3",144,169,149);
                Product p7 = new Product("Ink bw", 12,18,14);
                Product p8 = new Product("Ink color",43,59,48);
                Product p9 = new Product("Fax inkjet",479,699,500);
                Product p10 = new Product("Paper a4",15,20,16);
                Product p11 = new Product("Paper a3",10,18,12);
                Product p12 = new Product("Paper a2",12,25,14);
		Product p13 = new Product("Photocopier 1",420,500,450);
                Product p14 = new Product("Photocopier 2",716,816,756);                			
                OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
            }
if(row[i][4].equals("49")){
 		Product p1 = new Product("printer 4",1049,1199,1069);
		Product p2 = new Product("printer 5",1429,1799,1459);
                Product p3 = new Product("Scanner 3",144,169,149);
                Product p4 = new Product("Scanner 4",219,299,249);
                Product p5 = new Product("Ink bw", 12,18,14);
                Product p6 = new Product("Ink color",43,59,48);
                Product p7 = new Product("Fax inkjet",479,699,500);
                Product p8 = new Product("Fax laser",749,999,800);
                Product p9 = new Product("Paper a4",15,20,16);
                Product p10 = new Product("Paper a3",10,18,12);
		Product p11 = new Product("Paper bond",20,30,22);
                Product p12 = new Product("Photocopier 2",716,816,756);
                Product p13 = new Product("Photocopier 3",840,1099,890);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
            }
if(row[i][4].equals("50")){
		Product p1 = new Product("printer 1",349,499,399);
		Product p2 = new Product("Scanner 2",109,149,119);
                Product p3 = new Product("Ink bw", 12,18,14);
                Product p4 = new Product("Ink color",43,59,48);
                Product p5 = new Product("Fax laser",749,999,800);
                Product p6 = new Product("Paper a4",15,20,16);
                Product p7 = new Product("Photocopier 3",840,1099,890);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
		order.getOrderItems().add(oi007);
            }
if(row[i][4].equals("51")){
		Product p1 = new Product("printer 2",649,800,699);
 		Product p2 = new Product("printer 4",1049,1199,1069);
		Product p3 = new Product("Scanner 2",109,149,119);
                Product p4 = new Product("Scanner 3",144,169,149);
                Product p5 = new Product("Ink bw", 12,18,14);
                Product p6 = new Product("Ink color",43,59,48);
                Product p7 = new Product("Fax laser",749,999,800);
                Product p8 = new Product("Paper a3",10,18,12);
                Product p9 = new Product("Paper a2",12,25,14);
                Product p10 = new Product("Photocopier 2",716,816,756);
                Product p11 = new Product("Photocopier 3",840,1099,890);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
            }
if(row[i][4].equals("52")){
		Product p1 = new Product("printer 1",349,499,399);
                Product p2 = new Product("printer 3",249,399,299);
 		Product p3 = new Product("printer 4",1049,1199,1069);
                Product p4 = new Product("Scanner 3",144,169,149);
                Product p5 = new Product("Scanner 4",219,299,249);
                Product p6 = new Product("Ink bw", 12,18,14);
                Product p7 = new Product("Ink color",43,59,48);
                Product p8 = new Product("Fax laser",749,999,800);
                Product p9 = new Product("Paper a4",15,20,16);
		Product p10 = new Product("Paper bond",20,30,22);
		Product p11 = new Product("Photocopier 1",420,500,450);
                Product p12 = new Product("Photocopier 2",716,816,756);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
            }
if(row[i][4].equals("53")){
		Product p1 = new Product("printer 1",349,499,399);
		Product p2 = new Product("printer 2",649,800,699);
                Product p3 = new Product("printer 3",249,399,299);
                Product p4 = new Product("Scanner 3",144,169,149);
                Product p5 = new Product("Ink bw", 12,18,14);
                Product p6 = new Product("Ink color",43,59,48);
                Product p7 = new Product("Fax laser",749,999,800);
                Product p8 = new Product("Paper a4",15,20,16);
		Product p9 = new Product("Paper a3",10,18,12);
		Product p10 = new Product("Photocopier 1",420,500,450);
                Product p11 = new Product("Photocopier 2",716,816,756);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
            }
if(row[i][4].equals("54")){
		Product p1 = new Product("printer 2",649,800,699);
		Product p2 = new Product("Scanner 1",89,129,99);
		Product p3 = new Product("Scanner 2",109,149,119);
                Product p4 = new Product("Ink bw", 12,18,14);
                Product p5 = new Product("Ink color",43,59,48);
                Product p6 = new Product("Fax laser",749,999,800);
                Product p7 = new Product("Paper a4",15,20,16);
                Product p8 = new Product("Photocopier 2",716,816,756);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                order.getOrderItems().add(oi001);
		order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
		order.getOrderItems().add(oi008);
            }
if(row[i][4].equals("55")){
		Product p1 = new Product("printer 2",649,800,699);
                Product p2 = new Product("printer 3",249,399,299);
 		Product p3 = new Product("printer 4",1049,1199,1069);
		Product p4 = new Product("printer 5",1429,1799,1459);
		Product p5 = new Product("Scanner 5",329,449,379);
                Product p6 = new Product("Ink bw", 12,18,14);
                Product p7 = new Product("Ink color",43,59,48);
                Product p8 = new Product("Fax inkjet",479,699,500);
                Product p9 = new Product("Fax laser",749,999,800);
                Product p10 = new Product("Paper a4",15,20,16);
                Product p11 = new Product("Paper a3",10,18,12);
                Product p12 = new Product("Paper a2",12,25,14);
		Product p13 = new Product("Paper bond",20,30,22);
                Product p14 = new Product("Photocopier 2",716,816,756);
                Product p15 = new Product("Photocopier 3",840,1099,890);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
                OrderItem oi015 = new OrderItem(p15);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
		order.getOrderItems().add(oi015);
            }
if(row[i][4].equals("56")){
		Product p1 = new Product("printer 2",649,800,699);
                Product p2 = new Product("printer 3",249,399,299);
 		Product p3 = new Product("printer 4",1049,1199,1069);
                Product p4 = new Product("Scanner 4",219,299,249);
                Product p5 = new Product("Ink bw", 12,18,14);
                Product p6 = new Product("Ink color",43,59,48);
                Product p7 = new Product("Fax laser",749,999,800);
                Product p8 = new Product("Paper a4",15,20,16);
		Product p9 = new Product("Paper bond",20,30,22);
                Product p10 = new Product("Photocopier 2",716,816,756);
                Product p11 = new Product("Photocopier 3",840,1099,890);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
            }
if(row[i][4].equals("57")){
		Product p1 = new Product("printer 1",349,499,399);
                Product p2 = new Product("printer 3",249,399,299);
		Product p3 = new Product("Scanner 2",109,149,119);
                Product p4 = new Product("Scanner 4",219,299,249);
                Product p5 = new Product("Ink bw", 12,18,14);
                Product p6 = new Product("Ink color",43,59,48);
                Product p7 = new Product("Fax laser",749,999,800);
                Product p8 = new Product("Paper a4",15,20,16);
                Product p9 = new Product("Paper a3",10,18,12);
		Product p10 = new Product("Photocopier 1",420,500,450);
                Product p11 = new Product("Photocopier 3",840,1099,890);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
            }
if(row[i][4].equals("58")){
		Product p1 = new Product("printer 2",649,800,699);
                Product p2 = new Product("printer 3",249,399,299);
 		Product p3 = new Product("printer 4",1049,1199,1069);
                Product p4 = new Product("Scanner 4",219,299,249);
		Product p5 = new Product("Scanner 5",329,449,379);
                Product p6 = new Product("Ink bw", 12,18,14);
                Product p7 = new Product("Ink color",43,59,48);
                Product p8 = new Product("Fax inkjet",479,699,500);
                Product p9 = new Product("Fax laser",749,999,800);
                Product p10 = new Product("Paper a4",15,20,16);
                Product p11 = new Product("Paper a3",10,18,12);
                Product p12 = new Product("Photocopier 3",840,1099,890);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
            }
if(row[i][4].equals("59")){
		Product p1 = new Product("printer 2",649,800,699);
                Product p2 = new Product("printer 3",249,399,299);
		Product p3 = new Product("Scanner 1",89,129,99);
                Product p4 = new Product("Scanner 3",144,169,149);
                Product p5 = new Product("Ink bw", 12,18,14);
                Product p6 = new Product("Ink color",43,59,48);
                Product p7 = new Product("Fax laser",749,999,800);
                Product p8 = new Product("Paper a4",15,20,16);
		Product p9 = new Product("Photocopier 1",420,500,450);
                Product p10 = new Product("Photocopier 3",840,1099,890);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
            }
if(row[i][4].equals("60")){
                Product p1 = new Product("printer 3",249,399,299);
		Product p2 = new Product("Scanner 1",89,129,99);
		Product p3 = new Product("Scanner 2",109,149,119);
                Product p4 = new Product("Ink bw", 12,18,14);
                Product p5 = new Product("Ink color",43,59,48);
                Product p6 = new Product("Fax laser",749,999,800);
                Product p7 = new Product("Paper a2",12,25,14);
		Product p8 = new Product("Photocopier 1",420,500,450);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
            }
if(row[i][4].equals("61")){
		Product p1 = new Product("printer 1",349,499,399);
		Product p2 = new Product("printer 2",649,800,699);
 		Product p3 = new Product("printer 4",1049,1199,1069);
		Product p4 = new Product("printer 5",1429,1799,1459);
                Product p5 = new Product("Scanner 3",144,169,149);
                Product p6 = new Product("Scanner 4",219,299,249);
                Product p7 = new Product("Ink bw", 12,18,14);
                Product p8 = new Product("Ink color",43,59,48);
                Product p9 = new Product("Fax inkjet",479,699,500);
                Product p10 = new Product("Fax laser",749,999,800);
                Product p11 = new Product("Paper a4",15,20,16);
                Product p12 = new Product("Paper a3",10,18,12);
                Product p13 = new Product("Paper a2",12,25,14);
		Product p14 = new Product("Photocopier 1",420,500,450);
                Product p15 = new Product("Photocopier 2",716,816,756);
                Product p16 = new Product("Photocopier 3",840,1099,890);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
                OrderItem oi015 = new OrderItem(p15);
                OrderItem oi016 = new OrderItem(p16);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
                order.getOrderItems().add(oi015);
                order.getOrderItems().add(oi016);
            }
if(row[i][4].equals("62")){
		Product p1 = new Product("printer 1",349,499,399);
		Product p2 = new Product("printer 2",649,800,699);
                Product p3 = new Product("printer 3",249,399,299);
                Product p4 = new Product("Scanner 3",144,169,149);
                Product p5 = new Product("Scanner 4",219,299,249);
                Product p6 = new Product("Ink bw", 12,18,14);
                Product p7 = new Product("Ink color",43,59,48);
                Product p8 = new Product("Fax inkjet",479,699,500);
                Product p9 = new Product("Fax laser",749,999,800);
                Product p10 = new Product("Paper a4",15,20,16);
		Product p11 = new Product("Paper bond",20,30,22);
                Product p12 = new Product("Photocopier 2",716,816,756);
                Product p13 = new Product("Photocopier 3",840,1099,890);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
		order.getOrderItems().add(oi013);
            }
if(row[i][4].equals("63")){
		Product p1 = new Product("printer 2",649,800,699);
		Product p2 = new Product("Scanner 2",109,149,119);
                Product p3 = new Product("Ink bw", 12,18,14);
                Product p4 = new Product("Ink color",43,59,48);
                Product p5 = new Product("Fax laser",749,999,800);
                Product p6 = new Product("Paper a4",15,20,16);
		Product p7 = new Product("Photocopier 1",420,500,450);
                Product p8 = new Product("Photocopier 2",716,816,756);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
            }
if(row[i][4].equals("64")){
		Product p1 = new Product("printer 1",349,499,399);
		Product p2 = new Product("printer 2",649,800,699);
                Product p3 = new Product("printer 3",249,399,299);
                Product p4 = new Product("Scanner 3",144,169,149);
                Product p5 = new Product("Scanner 4",219,299,249);
                Product p6 = new Product("Ink bw", 12,18,14);
                Product p7 = new Product("Ink color",43,59,48);
                Product p8 = new Product("Fax laser",749,999,800);
                Product p9 = new Product("Paper a4",15,20,16);
		Product p10 = new Product("Paper bond",20,30,22);
                Product p11 = new Product("Photocopier 2",716,816,756);
                Product p12 = new Product("Photocopier 3",840,1099,890);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
            }
if(row[i][4].equals("65")){
		Product p1 = new Product("printer 1",349,499,399);
		Product p2 = new Product("printer 2",649,800,699);
		Product p3 = new Product("printer 5",1429,1799,1459);
                Product p4 = new Product("Scanner 3",144,169,149);
                Product p5 = new Product("Scanner 4",219,299,249);
                Product p6 = new Product("Ink bw", 12,18,14);
                Product p7 = new Product("Ink color",43,59,48);
                Product p8 = new Product("Fax laser",749,999,800);
                Product p9 = new Product("Paper a4",15,20,16);
                Product p10 = new Product("Paper a3",10,18,12);
                Product p11 = new Product("Paper a2",12,25,14);
		Product p12 = new Product("Photocopier 1",420,500,450);
                Product p13 = new Product("Photocopier 2",716,816,756);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                OrderItem oi013 = new OrderItem(p13);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
		order.getOrderItems().add(oi013);
            }
if(row[i][4].equals("66")){
		Product p1 = new Product("printer 2",649,800,699);
                Product p2 = new Product("printer 3",249,399,299);
		Product p3 = new Product("Scanner 1",89,129,99);
                Product p4 = new Product("Scanner 3",144,169,149);
                Product p5 = new Product("Ink bw", 12,18,14);
                Product p6 = new Product("Ink color",43,59,48);
                Product p7 = new Product("Fax laser",749,999,800);
                Product p8 = new Product("Paper a4",15,20,16);
                Product p9 = new Product("Paper a3",10,18,12);
                Product p10 = new Product("Paper a2",12,25,14);
                Product p11 = new Product("Photocopier 2",716,816,756);
                Product p12 = new Product("Photocopier 3",840,1099,890);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
            }
if(row[i][4].equals("67")){
		Product p1 = new Product("printer 1",349,499,399);
		Product p2 = new Product("printer 2",649,800,699);
                Product p3 = new Product("printer 3",249,399,299);
 		Product p4 = new Product("printer 4",1049,1199,1069);
                Product p5 = new Product("Scanner 4",219,299,249);
		Product p6 = new Product("Scanner 5",329,449,379);
                Product p7 = new Product("Ink bw", 12,18,14);
                Product p8 = new Product("Ink color",43,59,48);
                Product p9 = new Product("Fax inkjet",479,699,500);
                Product p10 = new Product("Fax laser",749,999,800);
                Product p11 = new Product("Paper a4",15,20,16);
                Product p12 = new Product("Paper a3",10,18,12);
		Product p13 = new Product("Paper bond",20,30,22);
                Product p14 = new Product("Photocopier 2",716,816,756);
                Product p15 = new Product("Photocopier 3",840,1099,890);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
		OrderItem oi013 = new OrderItem(p13);
                OrderItem oi014 = new OrderItem(p14);
                OrderItem oi015 = new OrderItem(p15);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
                order.getOrderItems().add(oi013);
                order.getOrderItems().add(oi014);
                order.getOrderItems().add(oi015);
            }
if(row[i][4].equals("68")){
		Product p1 = new Product("printer 1",349,499,399);
		Product p2 = new Product("printer 2",649,800,699);
 		Product p3 = new Product("printer 4",1049,1199,1069);
		Product p4 = new Product("Scanner 2",109,149,119);
                Product p5 = new Product("Scanner 4",219,299,249);
                Product p6 = new Product("Ink bw", 12,18,14);
                Product p7 = new Product("Ink color",43,59,48);
                Product p8 = new Product("Fax inkjet",479,699,500);
                Product p9 = new Product("Fax laser",749,999,800);
                Product p10 = new Product("Paper a4",15,20,16);
		Product p11 = new Product("Paper bond",20,30,22);
                Product p12 = new Product("Photocopier 2",716,816,756);
                Product p13 = new Product("Photocopier 3",840,1099,890);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                OrderItem oi012 = new OrderItem(p12);
		OrderItem oi013 = new OrderItem(p13);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
                order.getOrderItems().add(oi012);
		order.getOrderItems().add(oi013);
            }
if(row[i][4].equals("69")){
		Product p1 = new Product("printer 1",349,499,399);
                Product p2 = new Product("printer 3",249,399,299);
		Product p3 = new Product("Scanner 1",89,129,99);
		Product p4 = new Product("Scanner 2",109,149,119);
                Product p5 = new Product("Ink bw", 12,18,14);
                Product p6 = new Product("Ink color",43,59,48);
                Product p7 = new Product("Fax laser",749,999,800);
                Product p8 = new Product("Paper a4",15,20,16);
		Product p9 = new Product("Photocopier 1",420,500,450);
                Product p10 = new Product("Photocopier 3",840,1099,890);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
            }
if(row[i][4].equals("70")){
		Product p1 = new Product("printer 1",349,499,399);
		Product p2 = new Product("printer 2",649,800,699);
		Product p3 = new Product("Scanner 1",89,129,99);
		Product p4 = new Product("Scanner 2",109,149,119);
                Product p5 = new Product("Ink bw", 12,18,14);
                Product p6 = new Product("Ink color",43,59,48);
                Product p7 = new Product("Fax laser",749,999,800);
                Product p8 = new Product("Paper a4",15,20,16);
                Product p9 = new Product("Photocopier 2",716,816,756);
                Product p10 = new Product("Photocopier 3",840,1099,890);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
            }
if(row[i][4].equals("71")){
		Product p1 = new Product("printer 1",349,499,399);
		Product p2 = new Product("printer 2",649,800,699);
		Product p3 = new Product("Scanner 2",109,149,119);
                Product p4 = new Product("Scanner 3",144,169,149);
                Product p5 = new Product("Ink bw", 12,18,14);
                Product p6 = new Product("Ink color",43,59,48);
                Product p7 = new Product("Fax laser",749,999,800);
                Product p8 = new Product("Paper a4",15,20,16);
		Product p9 = new Product("Photocopier 1",420,500,450);
                Product p10 = new Product("Photocopier 2",716,816,756);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
            }
if(row[i][4].equals("72")){
		Product p1 = new Product("printer 1",349,499,399);
		Product p2 = new Product("Scanner 1",89,129,99);
		Product p3 = new Product("Scanner 2",109,149,119);
                Product p4 = new Product("Ink bw", 12,18,14);
                Product p5 = new Product("Ink color",43,59,48);
                Product p6 = new Product("Fax laser",749,999,800);
                Product p7 = new Product("Paper a4",15,20,16);
                Product p8 = new Product("Paper a3",10,18,12);
                Product p9 = new Product("Paper a2",12,25,14);
                Product p10 = new Product("Photocopier 2",716,816,756);
                Product p11 = new Product("Photocopier 3",840,1099,890);
		OrderItem oi001 = new OrderItem(p1);
                OrderItem oi002 = new OrderItem(p2);
                OrderItem oi003 = new OrderItem(p3);
                OrderItem oi004 = new OrderItem(p4);
                OrderItem oi005 = new OrderItem(p5);
                OrderItem oi006 = new OrderItem(p6);
                OrderItem oi007 = new OrderItem(p7);
                OrderItem oi008 = new OrderItem(p8);
                OrderItem oi009 = new OrderItem(p9);
                OrderItem oi010 = new OrderItem(p10);
                OrderItem oi011 = new OrderItem(p11);
                order.getOrderItems().add(oi001);
                order.getOrderItems().add(oi002);
                order.getOrderItems().add(oi003);
                order.getOrderItems().add(oi004);
                order.getOrderItems().add(oi005);
                order.getOrderItems().add(oi006);
                order.getOrderItems().add(oi007);
                order.getOrderItems().add(oi008);
                order.getOrderItems().add(oi009);
                order.getOrderItems().add(oi010);
                order.getOrderItems().add(oi011);
            }
            
            
          
            Channel c = new Channel();
            c.setChanneltype(row[i][1]);

                String name = row[i][2];
            Market m = new Market(name);

            MarketChannelAssignment mca = new MarketChannelAssignment(m,c);

            order.setMarketChannelAssingment(mca);
            order.setMarket(name);
            order.setSalesPerson(row[i][9]);
              order.setOrderTargetPrice(row[i][7]);
          
              order.setOrderPrice(row[i][5]);
         
          String sp =  row[i][9];
          order.setSalesPerson(sp);
          
         
          masterOrderList.setOrders(order);
          business.setMasterOrderList(masterOrderList);
        }
    
        
        }
        
        return business;
    }
    
     public static List<String[]> readData() {
        try {
            datareader = new DataReader(fileName);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConfigureABusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            content = datareader.getData();
//            System.out.println(content.toString());
            for (String[] row : content) {
            for (String value : row) {
                System.out.println(value);
            }
            }
            return content;
        } catch (IOException ex) {
            Logger.getLogger(ConfigureABusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
