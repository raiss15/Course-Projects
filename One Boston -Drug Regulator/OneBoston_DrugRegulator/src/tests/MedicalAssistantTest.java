/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

/**
 *
 * @author bhagyatrivedi
 */
import com.github.javafaker.Faker;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import org.testng.annotations.Test;

public class MedicalAssistantTest {

    private Faker faker = new Faker();

 
    @Test
    public void testMedicalAssistantCreationWithFaker() {
        // Create a MedicalAssistant with fake data
        MedicalAssistant medicalAssistant = new MedicalAssistant();
        medicalAssistant.setName(faker.name().fullName());

        // Perform assertions
        assertNotNull(medicalAssistant);
        assertNotNull(medicalAssistant.getName());
        assertNotNull(medicalAssistant.getPrescriptionList());

        // Print details for verification
        System.out.println("Medical Assistant Name: " + medicalAssistant.getName());
        System.out.println("Prescription List: " + medicalAssistant.getPrescriptionList());
    }
}