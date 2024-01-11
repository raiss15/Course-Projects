/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import Business.UserAccount.UserAccountDirectory;
import business.Education.LibrarianDirectory;
import business.Education.ProfessorDirectory;
import business.Education.StudentDirectory;
import business.GovtBody.AmbulanceDirectory;
import business.GovtBody.FireBrigadeDirectory;
import business.GovtBody.PoliceDirectory;
import business.Maintainence.ElectricianDirectory;
import business.Maintainence.PlumberDirectory;
import business.Maintainence.TrashJobDirectory;
import business.Person.PersonDirectory;
import business.RealEstate.CommercialDirectory;
import business.RealEstate.OwnerDirectory;
import business.RealEstate.TenantDirectory;
import business.hospital.DoctorDirectory;
import business.hospital.NursesDirectory;
import business.hospital.RehabSuperDirectory;

/**
 *
 * @author sanatpopli
 */
public class Business {
    
    String name;
    DoctorDirectory doctorDirectory;
    NursesDirectory nursesDirectory;
    RehabSuperDirectory rehabSuperDirectory;
    CommercialDirectory commercialDirectory;
    OwnerDirectory ownerDirectory;
    TenantDirectory tenantDirectory;
    LibrarianDirectory librarianDirectory;
    ProfessorDirectory professorDirectory;
    StudentDirectory studentDirectory;
    AmbulanceDirectory ambulanceDirectory;
    FireBrigadeDirectory firebrigadeDirectory;
    PoliceDirectory policeDirectory;
    ElectricianDirectory electricianDirectory;
    PlumberDirectory plumberDirectory;
    TrashJobDirectory trashjobDirectory;
    PersonDirectory personDirectory;
    UserAccountDirectory userAccountDirectory;
    public Business(String name){
        this.name = name;
        doctorDirectory = new DoctorDirectory();
        nursesDirectory = new NursesDirectory();
        rehabSuperDirectory = new RehabSuperDirectory();
        commercialDirectory = new CommercialDirectory();
        ownerDirectory = new OwnerDirectory();
        tenantDirectory = new TenantDirectory();
        librarianDirectory = new LibrarianDirectory();
        professorDirectory = new ProfessorDirectory();
        studentDirectory = new StudentDirectory();
        ambulanceDirectory = new AmbulanceDirectory();
        firebrigadeDirectory = new FireBrigadeDirectory();
        policeDirectory = new PoliceDirectory();
        electricianDirectory = new ElectricianDirectory();
        plumberDirectory = new PlumberDirectory();
        trashjobDirectory = new TrashJobDirectory();
        userAccountDirectory = new UserAccountDirectory();
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public NursesDirectory getNursesDirectory() {
        return nursesDirectory;
    }

    public void setNursesDirectory(NursesDirectory nursesDirectory) {
        this.nursesDirectory = nursesDirectory;
    }

    public RehabSuperDirectory getRehabSuperDirectory() {
        return rehabSuperDirectory;
    }

    public void setRehabSuperDirectory(RehabSuperDirectory rehabSuperDirectory) {
        this.rehabSuperDirectory = rehabSuperDirectory;
    }
    public CommercialDirectory getCommercialDirectory() {
        return commercialDirectory;
    }

    public void setCommercialDirectory(CommercialDirectory commercialDirectory) {
        this.commercialDirectory = commercialDirectory;
    }

    public OwnerDirectory getOwnerDirectory() {
        return ownerDirectory;
    }

    public void setOwnerDirectory(OwnerDirectory ownerDirectory) {
        this.ownerDirectory = ownerDirectory;
    }

    public TenantDirectory getTenantDirectory() {
        return tenantDirectory;
    }

    public void setTenantDirectory(TenantDirectory tenantDirectory) {
        this.tenantDirectory = tenantDirectory;
    }

    public LibrarianDirectory getLibrarianDirectory() {
        return librarianDirectory;
    }

    public void setLibrarianDirectory(LibrarianDirectory librarianDirectory) {
        this.librarianDirectory = librarianDirectory;
    }

    public ProfessorDirectory getProfessorDirectory() {
        return professorDirectory;
    }

    public void setProfessorDirectory(ProfessorDirectory professorDirectory) {
        this.professorDirectory = professorDirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public AmbulanceDirectory getAmbulanceDirectory() {
        return ambulanceDirectory;
    }

    public void setAmbulanceDirectory(AmbulanceDirectory ambulanceDirectory) {
        this.ambulanceDirectory = ambulanceDirectory;
    }

    public FireBrigadeDirectory getFirebrigadeDirectory() {
        return firebrigadeDirectory;
    }

    public void setFirebrigadeDirectory(FireBrigadeDirectory firebrigadeDirectory) {
        this.firebrigadeDirectory = firebrigadeDirectory;
    }

    public PoliceDirectory getPoliceDirectory() {
        return policeDirectory;
    }

    public void setPoliceDirectory(PoliceDirectory policeDirectory) {
        this.policeDirectory = policeDirectory;
    }

    public ElectricianDirectory getElectricianDirectory() {
        return electricianDirectory;
    }

    public void setElectricianDirectory(ElectricianDirectory electricianDirectory) {
        this.electricianDirectory = electricianDirectory;
    }

    public PlumberDirectory getPlumberDirectory() {
        return plumberDirectory;
    }

    public void setPlumberDirectory(PlumberDirectory plumberDirectory) {
        this.plumberDirectory = plumberDirectory;
    }

    public TrashJobDirectory getTrashjobDirectory() {
        return trashjobDirectory;
    }

    public void setTrashjobDirectory(TrashJobDirectory trashjobDirectory) {
        this.trashjobDirectory = trashjobDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
}
