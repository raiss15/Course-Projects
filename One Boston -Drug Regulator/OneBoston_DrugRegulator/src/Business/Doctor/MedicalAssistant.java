/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

/**
 *
 * @author sanatpopli
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
