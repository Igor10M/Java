import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    private List<Equipment> inventory;

    public RentalSystem() {
        this.inventory = new ArrayList<>();
    }

    public void addEquipment(Equipment equipment) {
        inventory.add(equipment);
    }

    public String rentEquipment(String equipmentName, int duration) {
        for (Equipment equipment : inventory) {
            if (equipment.getName().equalsIgnoreCase(equipmentName) && !equipment.isRented()) {
                LocalDate returnDate = LocalDate.now().plusDays(duration);
                if (equipment instanceof Book && returnDate.isBefore(LocalDate.now())) {
                    return "Return date cannot be in the past for books.";
                }
                equipment.setRented(true);
                return "Rent successful. Please return by: " + returnDate;
            }
        }
        return "Equipment not available for rent or already rented.";
    }

    public void displayRentedEquipment() {
        System.out.println("Rented Equipment:");
        for (Equipment equipment : inventory) {
            if (equipment.isRented()) {
                System.out.println("Name: " + equipment.getName() + ", Rent Value: $" + equipment.getRentValue());
            }
        }
    }

    public void displayAvailableEquipment() {
        System.out.println("Available Equipment:");
        for (Equipment equipment : inventory) {
            if (!equipment.isRented()) {
                System.out.println("Name: " + equipment.getName() + ", Rent Value: $" + equipment.getRentValue());
            }
        }
    }
}