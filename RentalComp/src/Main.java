import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWelcome to the Equipment Rental System");
            System.out.println("1. Add Construction Equipment");
            System.out.println("2. Add Motorcycle");
            System.out.println("3. Add Book");
            System.out.println("4. Rent Equipment");
            System.out.println("5. Display Rented Equipment");
            System.out.println("6. Display Available Equipment");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Construction Equipment name: ");
                    String constructionName = scanner.nextLine();
                    System.out.print("Enter Rent Value: ");
                    double constructionRent = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Condition: ");
                    String condition = scanner.nextLine();
                    ConstructionEquipment constructionEquipment = new ConstructionEquipment(constructionName, constructionRent, condition);
                    rentalSystem.addEquipment(constructionEquipment);
                    System.out.println("Construction Equipment added successfully!");
                    break;
                case 2:
                    System.out.print("Enter Motorcycle name: ");
                    String motorcycleName = scanner.nextLine();
                    System.out.print("Enter Rent Value: ");
                    double motorcycleRent = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Bike Type: ");
                    String bikeType = scanner.nextLine();
                    Motorcycle motorcycle = new Motorcycle(motorcycleName, motorcycleRent, bikeType);
                    rentalSystem.addEquipment(motorcycle);
                    System.out.println("Motorcycle added successfully!");
                    break;
                case 3:
                    System.out.print("Enter Book name: ");
                    String bookName = scanner.nextLine();
                    System.out.print("Enter Rent Value: ");
                    double bookRent = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Book genre: ");
                    String bookGenre = scanner.nextLine();
                    Book book = new Book(bookName, bookRent, bookGenre);
                    rentalSystem.addEquipment(book);
                    System.out.println("Book added successfully!");
                    break;
                case 4:
                    System.out.print("Enter the Equipment name to rent: ");
                    String rentEquipmentName = scanner.nextLine();
                    System.out.print("Enter the duration for rental (in days): ");
                    int rentalDuration = scanner.nextInt();
                    scanner.nextLine();
                try {
                    System.out.println(rentalSystem.rentEquipment(rentEquipmentName, rentalDuration));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                    break;
                case 5:
                    System.out.println("\nRented Equipment:");
                    rentalSystem.displayRentedEquipment();
                    break;
                case 6:
                    System.out.println("\nAvailable Equipment:");
                    rentalSystem.displayAvailableEquipment();
                    break;
                case 7:
                    System.out.println("Exiting the program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 7);

        scanner.close();
    }
}
