/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Disease;

import Business.DrugCompounds.DrugCompounds;
import java.util.List;

/**
 *
 * @author bhagyatrivedi
 */
public class Disease {
    private int diseaseId;
    private String disease;
    private List<DrugCompounds> diseaseDrug;

    public int getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(int diseaseId) {
        this.diseaseId = diseaseId;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public List<DrugCompounds> getDiseaseDrug() {
        return diseaseDrug;
    }

    public void setDiseaseDrug(List<DrugCompounds> diseaseDrug) {
        this.diseaseDrug = diseaseDrug;
    }
    
}
