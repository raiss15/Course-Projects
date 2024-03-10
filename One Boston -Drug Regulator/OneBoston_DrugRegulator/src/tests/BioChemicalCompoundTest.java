package tests;

import com.github.javafaker.Faker;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;



public class BioChemicalCompoundTest {

    private Faker faker = new Faker();

    @Test
    public void testBioChemicalCompoundCreationWithFaker() {
        // Create a BioChemicalCompound with fake data
        BioChemicalCompound bioChemicalCompound = new BioChemicalCompound();
        bioChemicalCompound.setBioChemicalCompound(faker.food().ingredient());

        // Perform assertions
        assertNotNull(bioChemicalCompound);
        assertNotNull(bioChemicalCompound.getBioChemicalCompound());

        // Print details for verification
        System.out.println("BioChemicalCompound Name: " + bioChemicalCompound.getBioChemicalCompound());
    }

    @Test
    public void testMultipleBioChemicalCompoundCreationWithFaker() {
        // Create multiple BioChemicalCompounds with fake data
        BioChemicalCompound compound1 = new BioChemicalCompound();
        compound1.setBioChemicalCompound(faker.food().ingredient());

        BioChemicalCompound compound2 = new BioChemicalCompound();
        compound2.setBioChemicalCompound(faker.food().ingredient());

        // Perform assertions
        assertNotNull(compound1);
        assertNotNull(compound1.getBioChemicalCompound());

        assertNotNull(compound2);
        assertNotNull(compound2.getBioChemicalCompound());

        // Print details for verification
        System.out.println("BioChemicalCompound 1 Name: " + compound1.getBioChemicalCompound());
        System.out.println("BioChemicalCompound 2 Name: " + compound2.getBioChemicalCompound());
    }
}
