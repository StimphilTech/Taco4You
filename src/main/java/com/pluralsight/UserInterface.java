package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private static Order currentOrder;
    private Scanner scanner = new Scanner(System.in);
    ;

    public static void main(String[] args) {
        ArrayList<Topping> cart = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 3) {
            System.out.println("\nWelcome to Taco4You \uD83C\uDF2E❤\uFE0F!");
            System.out.println("1. Make Your Order");
            System.out.println("0. Exit");
            System.out.print("If you are finished with your order, please select 0 to exit.  ");
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter 0 to Exit the Order.");
                scanner.nextLine();
                continue;
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> display();
                case 0 -> System.out.println("Thank you for shopping with Taco4You \uD83C\uDF2E❤\uFE0F!");
                default -> System.out.println("If you are finished with your order please select 0 to exit.  ");
            }
        }
        scanner.close();
    }


    private static void display() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("\nTaco4You \uD83C\uDF2E❤\uFE0F!");
        System.out.println("--------");

        boolean quit = false;
        while (!quit) {
            System.out.println("---------- Order Screen ----------");
            System.out.println("1) Add Taco");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips & Salsa");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Enter your choice: 0-4 ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addTaco(scanner);
                    break;
                case "2":
                    addDrink(scanner);
                    break;
                case "3":
                    addChips(scanner);
                    break;
                case "4":
                    checkout(scanner);
                    break;
                case "0":
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }


    }

    private static void addChips(Scanner scanner) {

        System.out.println("\n--- Add Chips & Salsa ---");
        System.out.print(" select Salsa Type ");
        String getSalsaType = (scanner.nextLine());

        String salsaType = "";
        Chips chips = new Chips(salsaType);
        currentOrder.addChips(chips);

        System.out.println("Chips & Salsa added! Price: $" + getSalsaType);
    }

    private static void checkout(Scanner scanner) {

        System.out.println("\n--- Checkout ---");
        System.out.println(currentOrder); // make sure Order has toString() to display items
        System.out.println("Total Price: $" + currentOrder.calculateTotal());
        System.out.println("Thank you for shopping with Taco4You \uD83C\uDF2E❤\uFE0F!");

        currentOrder = new Order();
    }

    private static void addDrink(Scanner scanner) {

        System.out.println("\n--- Add Drink ---");

        // 1. Get and Validate Size
        String size;
        while (true) { // Loop until a valid size is entered
            System.out.print("Enter size (small/medium/large): ");
            size = scanner.nextLine().toLowerCase();

            if (size.equals("small") || size.equals("medium") || size.equals("large")) {
                break; // Exit the loop if valid input is received
            } else {
                System.out.println("Invalid size. Please enter small, medium, or large.");

                String flavor = "";
                while (true) { // Loop until a valid flavor option is chosen
                    System.out.println("Select drink flavor:");
                    System.out.println("1) Cola");
                    System.out.println("2) Lemonade");
                    System.out.println("3) Root Beer");
                    System.out.print("Enter your choice (1-3): ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number (1-3).");
                        scanner.nextLine(); // Discard the bad input
                        continue; // Restart the flavor selection loop
                    }
                    int flavorChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume the leftover newline character

                    switch (flavorChoice) {
                        case 1:
                            flavor = "Cola";
                            break;
                        case 2:
                            flavor = "Lemonade";
                            break;
                        case 3:
                            flavor = "Root Beer";
                            break;
                        default:
                            System.out.println("Invalid choice. Please select 1, 2, or 3.");
                            continue; // Restart the loop if default is hit
                    }

                    // If we reach here, a valid flavor was selected, so break the flavor loop
                    break;
                }
            }

        System.out.print("Enter drink flavor: ");
        String flavor = scanner.nextLine();
        Drink drink = new Drink(size, flavor);


            if (currentOrder != null) {
                currentOrder.addDrink(size);
            currentOrder.addDrink(drink.toString());
            System.out.println(flavor + " " + size + " drink added! Price: $" );
            } else {
                System.out.println("Error: No active order to add drink to.");
            }
        }
    }


    public static void addTaco(Scanner scanner) {
        System.out.println("Choose Taco Size (Single/3-Taco/Burrito: ");
        String size = scanner.nextLine();

        System.out.println("Choose Shell Type (Soft/Hard: ");
        String shellType = scanner.nextLine();

        System.out.println("Do you want it deep fried? (yes/no)");
        boolean deepFried = scanner.nextLine().equalsIgnoreCase("yes");

        Taco taco = new Taco(size, shellType, deepFried);

        System.out.println("Add toppings");
        String toppingInput;

        do {
            System.out.println("Enter a topping (Cheese, Lettuce, Tomato");
            toppingInput = scanner.nextLine();
            if (!toppingInput.equalsIgnoreCase("finished")) {
                taco.addTopping(new Topping(toppingInput) {

                    public double getPrice(String size) {
                        return 0;
                    }
                });

            }


        } while (!toppingInput.equalsIgnoreCase("finished"));

            currentOrder.addTaco(taco);
        System.out.println("Taco added! Price: $" + taco.calculatePrice());
    }
}






