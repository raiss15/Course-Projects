/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.DrugCompounds.DrugCompoundsHistory;

/**
 *
 * @author sohni
 */
public class Patient {
    
    private int patientId;
    private String patientName;
    private int age;
    private String sex;
    private String drugNewCompound;
    private String clinicalProgressBar;
    private String Gender;
    private String examinationOfPatient;
    private DrugCompoundsHistory drugHistory;

    
    public Patient() {
    
        drugHistory = new DrugCompoundsHistory();
    }

    public String getClinicalProgressBar() {
        return clinicalProgressBar;
    }

    public void setClinicalProgressBar(String clinicalProgressBar) {
        this.clinicalProgressBar = clinicalProgressBar;
    }
    
    public String getDrugNewCompound() {
        return drugNewCompound;
    }

    public void setDrugNewCompound(String drugNewCompound) {
        this.drugNewCompound = drugNewCompound;
    }
    
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    
    public String getExaminationOfPatient() {
        return examinationOfPatient;
    }

    public void setExaminationOfPatient(String examinationOfPatient) {
        this.examinationOfPatient = examinationOfPatient;
    }
    
    
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public DrugCompoundsHistory getDrugHistory() {
        return drugHistory;
    }

    public void setDrugHistory(DrugCompoundsHistory drugHistory) {
        this.drugHistory = drugHistory;
    }
    
      @Override
     public String toString(){
       return this.patientName;
        }  
    

}
