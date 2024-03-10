/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Disease.Disease;
import Business.Doctor.Patient;
import Business.DrugCompounds.DrugCompounds;
import java.util.List;
import java.util.Map;

/**
 *
 * @author sanatpopli
 */
public class LabTestWorkRequest extends WorkRequest{
    
    private String testResult;
    private Map<Disease,List<DrugCompounds>>diseaseListGenes;
    private String patientName;
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Map<Disease, List<DrugCompounds>> getDiseaseListGenes() {
        return diseaseListGenes;
    }

    public void setDiseaseListGenes(Map<Disease, List<DrugCompounds>> diseaseListGenes) {
        this.diseaseListGenes = diseaseListGenes;
    }

  

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
      @Override
     public String toString(){
       return this.patientName;
        }  
    
    
}
