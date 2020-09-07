import java.util.*;
public class DemoItemsAndPets
{
    public static void main(String[] args)
    {
        ItemSold item1 = new ItemSold();
        ItemSold item2 = new ItemSold();
        PetSold pet1 = new PetSold();
        PetSold pet2 = new PetSold();
        item1.setInvoiceNumber(1234);
        item1.setDescription("Fish Food 500gm");
        item1.setPrice(19.99);
        item2.setInvoiceNumber(2345);
        item2.setDescription("Dog Collar Belt");
        item2.setPrice(18.99);
        pet1.setInvoiceNumber(3456);
        pet1.setDescription("Labrador Puppy");
        pet1.setPrice(239.99);
        pet1.setIsVaccinated(true);
        pet1.setIsNeutered(true);
        pet1.setIsHousebroken(false);
        pet2.setInvoiceNumber(4567);
        pet2.setDescription("Golden Retriever Pup");
        pet2.setPrice(259.99);
        pet2.setIsVaccinated(true);
        pet2.setIsNeutered(false);
        pet2.setIsHousebroken(true);
        display(item1);
        display(item2);
        display(pet1);
        displayPetData(pet1);
        display(pet2);
        displayPetData(pet2);
    }
    public static void display(ItemSold item)
    {
        System.out.println("Invoice #" + item.getInvoiceNumber());
        System.out.println("     Description: " + item.getDescription());
        System.out.println("     Price: $" + item.getPrice());
    }
    public static void displayPetData(PetSold item)
    {
        System.out.println("     Vaccinated is " + item.getIsVaccinated());
        System.out.println("     Neutered is " + item.getIsNeutered());
        System.out.println("     Housebroken is " + item.getIsHousebroken());
    }
}