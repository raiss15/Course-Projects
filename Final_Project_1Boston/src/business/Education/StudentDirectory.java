/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Education;

import business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author sanatpopli
 */
public class StudentDirectory {
     ArrayList<Student> StudentList;
     
      public StudentDirectory (){
        StudentList = new ArrayList();
    }
      public Student newStudentProfile(Person person){
        Student StudentProfile = new Student(person);
        StudentList.add(StudentProfile);
        return StudentProfile;
    }
    
  
    public Student findStudent(String id){
        for(Student profile : StudentList){
            if(profile.isMatch(id)){
                return profile;
            }
        }
        return null;
    }

    public ArrayList<Student> getStudentList() {
        return StudentList;
    }

    public void StudentList(ArrayList<Student> StudentList) {
        this.StudentList = StudentList;
    }
    
}
