package airlinecli.ui;

import airlinecli.service.QueryService;

import java.util.Scanner;

public class ConsoleUI {
    private final QueryService queryService = new QueryService();
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\n=== Airline CLI ===");
            System.out.println("1. What airports are there in each city?");
            System.out.println("2. What aircraft has each passenger flown on?");
            System.out.println("3. What airports do aircraft take off from and land at?");
            System.out.println("4. What airports have passengers used?");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> queryService.getAirportsByCity();
                case 2 -> queryService.getAircraftByPassenger();
                case 3 -> queryService.getAirportRoutes();
                case 4 -> queryService.getPassengerAirports();
                case 5 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}