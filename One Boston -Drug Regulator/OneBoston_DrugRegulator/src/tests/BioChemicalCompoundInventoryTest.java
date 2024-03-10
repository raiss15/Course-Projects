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
public class BioChemicalCompoundInventoryTest {

    private Faker faker  = new Faker();

    @Test
    public void testBioChemicalCompoundInventoryCreationWithFaker() {
        // Create a BioChemicalCompoundInventory with fake data
        BioChemicalCompoundInventory inventory = new BioChemicalCompoundInventory();
        inventory.setBioChemCompound(faker.food().ingredient());
        inventory.setReordering(faker.number().numberBetween(1, 10));
        inventory.setMinQuantity(faker.number().numberBetween(10, 50));
        inventory.setMaxQuantity(faker.number().numberBetween(51, 100));
        inventory.setDateOfExpiry(faker.date().future(365, java.util.concurrent.TimeUnit.DAYS));
        inventory.setPharma(faker.company().name());
        inventory.setTotalAvailableQuantity(faker.number().numberBetween(1, 100));
        inventory.setPriceOfPurchase(faker.number().randomDouble(2, 1, 100));
        inventory.setPriceAtSell(faker.number().randomDouble(2, 1, 200));
        inventory.setProductId(faker.number().randomDigitNotZero());
        inventory.setSerialNumber(faker.number().randomDigitNotZero());
        inventory.setTotalRequirement(faker.number().numberBetween(1, 50));
        inventory.setReorderingProgress(faker.options().option("Y", "N"));

        // Perform assertions
        assertNotNull(inventory);
        assertNotNull(inventory.getBioChemCompound());
        assertNotNull(inventory.getDateOfExpiry());

        // Print details for verification
        System.out.println("BioChemCompound: " + inventory.getBioChemCompound());
        System.out.println("Reordering: " + inventory.getReordering());
        System.out.println("Min Quantity: " + inventory.getMinQuantity());
        System.out.println("Max Quantity: " + inventory.getMaxQuantity());
        System.out.println("Date Of Expiry: " + inventory.getDateOfExpiry());
        System.out.println("Pharma: " + inventory.getPharma());
        System.out.println("Total Available Quantity: " + inventory.getTotalAvailableQuantity());
        System.out.println("Price Of Purchase: " + inventory.getPriceOfPurchase());
        System.out.println("Price At Sell: " + inventory.getPriceAtSell());
        System.out.println("Product ID: " + inventory.getProductId());
        System.out.println("Serial Number: " + inventory.getSerialNumber());
        System.out.println("Total Requirement: " + inventory.getTotalRequirement());
        System.out.println("Reordering Progress: " + inventory.getReorderingProgress());
    }
}

