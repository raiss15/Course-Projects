/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.RealEstate;
import business.Person.Person;
import business.Profiles.Profile;

/**
 *
 * @author sanatpopli
 */
public class Commercial extends Profile{
    String shoptype;
    String salespermonth;
    String tax;
    String uniqueid;

    public Commercial(Person person) {
        super(person);
    }

    public String getShoptype() {
        return shoptype;
    }

    public void setShoptype(String shoptype) {
        this.shoptype = shoptype;
    }

    public String getSalespermonth() {
        return salespermonth;
    }

    public void setSalespermonth(String salespermonth) {
        this.salespermonth = salespermonth;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }

    @Override
    public String getRole() {
  return "Commercial";  }
    
    
    
}
