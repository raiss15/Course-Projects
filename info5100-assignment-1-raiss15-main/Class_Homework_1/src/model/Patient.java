/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */


public class Patient {
    
    private String patientid;
    private String primarydoctor;
    private String docdateoflastvisit;
    private String datenextappointment;
    private String allergies;
    private String onmedication;
    private String insurancecoverage;
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getPrimarydoctor() {
        return primarydoctor;
    }

    public void setPrimarydoctor(String primarydoctor) {
        this.primarydoctor = primarydoctor;
    }

    public String getDocdateoflastvisit() {
        return docdateoflastvisit;
    }

    public void setDocdateoflastvisit(String docdateoflastvisit) {
        this.docdateoflastvisit = docdateoflastvisit;
    }

    public String getDatenextappointment() {
        return datenextappointment;
    }

    public void setDatenextappointment(String datenextappointment) {
        this.datenextappointment = datenextappointment;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getOnmedication() {
        return onmedication;
    }

    public void setOnmedication(String onmedication) {
        this.onmedication = onmedication;
    }

    public String getInsurancecoverage() {
        return insurancecoverage;
    }

    public void setInsurancecoverage(String insurancecoverage) {
        this.insurancecoverage = insurancecoverage;
    }
    
    
}
