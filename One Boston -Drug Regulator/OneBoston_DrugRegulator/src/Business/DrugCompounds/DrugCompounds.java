/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DrugCompounds;

/**
 *
 * @author bhagyatrivedi
 */
public class DrugCompounds {
    private String drugCompound;
    private int id;
    private static int count = 1;

    public DrugCompounds() {
         id = count;
         count++;
    }
    
    public int getId() {
        return id;
    }

    public String getDrugCompound() {
        return drugCompound;
    }

    public void setDrugCompound(String drugCompound) {
        this.drugCompound = drugCompound;
    }

    @Override
    public String toString() {
        return "DrugCompound{" + "drugCompound =" + drugCompound + ", id=" + id + '}';
    }

}
