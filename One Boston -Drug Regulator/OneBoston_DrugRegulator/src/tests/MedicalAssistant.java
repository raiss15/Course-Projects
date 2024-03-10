/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

import Business.Doctor.PrescriptionList;

/**
 *
 * @author bhagyatrivedi
 */
public class MedicalAssistant {
    private String name;
    private PrescriptionList prescriptionList;

      
    public MedicalAssistant(){
        prescriptionList= new PrescriptionList();
    }  
      
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PrescriptionList getPrescriptionList() {
        return prescriptionList;
    }

    public void setPrescriptionList(PrescriptionList prescriptionList) {
        this.prescriptionList = prescriptionList;
    }
      
      
    
    
}
