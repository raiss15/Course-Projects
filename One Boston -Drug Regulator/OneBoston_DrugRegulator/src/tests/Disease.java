/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

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
