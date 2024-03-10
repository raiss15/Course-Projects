/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

/**
 *
 * @author bhagyatrivedi
 */
import Business.DrugCompounds.DrugCompounds;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import org.testng.annotations.Test;

public class DiseaseTest {

    private Faker faker = new Faker();


    @Test
    public void testDiseaseCreationWithFaker() {
        // Create a Disease with fake data
        Disease disease = new Disease();
        disease.setDiseaseId(faker.number().randomDigitNotZero());
        disease.setDisease(faker.medical().diseaseName());
        disease.setDiseaseDrug(generateFakeDrugCompoundsList());

        // Perform assertions
        assertNotNull(disease);
        assertEquals(1, disease.getDiseaseId()); // Since this is the first disease, the ID should be 1
        assertNotNull(disease.getDisease());
        assertNotNull(disease.getDiseaseDrug());
        assertEquals(3, disease.getDiseaseDrug().size()); // Assuming 3 fake DrugCompounds are generated

        // Print details for verification
        System.out.println("Disease ID: " + disease.getDiseaseId());
        System.out.println("Disease Name: " + disease.getDisease());
        System.out.println("Disease Drugs: " + disease.getDiseaseDrug());
    }

    private List<DrugCompounds> generateFakeDrugCompoundsList() {
        // Generate a list of fake DrugCompounds
        List<DrugCompounds> drugCompoundsList = new ArrayList<>();
        for (int i = 0; i < 3; i++) { // Generate 3 fake DrugCompounds for testing
            DrugCompounds drugCompounds = new DrugCompounds();
            drugCompounds.setDrugCompound(faker.food().ingredient());
            drugCompounds.setDrugCompound(faker.food().ingredient());
            drugCompoundsList.add(drugCompounds);
        }
        return drugCompoundsList;
    }
}