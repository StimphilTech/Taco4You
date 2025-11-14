package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
            /* Accept only 1, 2, or 3.  Any text input is rejected. */
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter 0 to Exit the Order.");
                scanner.nextLine();        // discard the bad token
                continue;                  // restart the loop
            }
            choice = scanner.nextInt();
            scanner.nextLine();            // remove the newline that nextInt leaves

            switch (choice) {
                case 1 -> display();
                case 0 -> System.out.println("Thank you for shopping with Taco4You \uD83C\uDF2E❤\uFE0F!");
                default -> System.out.println("If you are finished with your order please select 0 to exit.  ");
            }
        }
        scanner.close();
    }


    private static void display() {

        System.out.println("\nTacos");
        System.out.println("--------");
//        for (Topping t : cart) {
//            System.out.printf("%s", t.getName());
        }


    }


//    private static void displayOrder() {
//
//    }

//    public static void display() {


//    }






    ////                    order.getChips().add(chips);
    //                    System.out.println("Added chips & salsa to order!");
    //                    break;
    //                case "4":
    //                    System.out.println(order.printOrder());
    //                    ordering = false;
    //                    break;
    //                case "0":
    //                    System.out.println("Order cancelled.");
    //                    ordering = false;
    //                    break;
    //                default:
    //                    System.out.println("Invalid choice. Try again.");
    //            }
    //        }

    //        orders.add(order);
    //    }

    //    private Taco buildTaco() {
    //        System.out.print("Choose taco size (Single / 3-Taco / Burrito): ");
    //        String size = scanner.nextLine();
    //
    //        System.out.print("Choose shell (corn / flour / hard shell / bowl): ");
    //        String shell = scanner.nextLine();
    //
    //        List<Topping> toppings = new ArrayList<>();
    //
    //
    //        System.out.print("Add regular topping (or 'done'): ");
    //        String topping;
    //        while (!(topping = scanner.nextLine()).equalsIgnoreCase("done")) {
    //            toppings.add(new RegularTopping(topping));
    //            System.out.print("Add another topping (or 'done'): ");
    //        }
    //
    //        System.out.print("Add premium topping (or 'done'): ");
    //        String premium;
    //        while (!(premium = scanner.nextLine()).equalsIgnoreCase("done")) {
    //            toppings.add(new PremiumTopping(premium, 1.00, false) {
    //                @Override
    //                public double getPrice(String size) {
    //                    return 0;
    //                }
    //            });
    //            System.out.print("Add another premium topping (or 'done'): ");
    //        }
    //
    //        System.out.print("Would you like it deep fried? (yes/no): ");
    //        boolean deepFried = scanner.nextLine().equalsIgnoreCase("yes");
    //
    //        Taco taco = new Taco(size, shell, List<topping> toppings, deepFried);
    //        return taco;
    //    }


//    public void start() {
//        boolean running = true;
//        System.out.println("🌮❤️ Welcome to Taco4You! 🌮❤️");
//
//        while (running) {
//            System.out.println("\n--- HOME MENU ---");
//            System.out.println("1) New Order");
//            System.out.println("0) Exit");
//            System.out.print("Choose an option: ");
//
//            String choice = scanner.nextLine();
//
//            switch (choice) {
//                case "1":
//                    new Order();
//                    break;
//                case "0":
//                    running = false;
//                    System.out.println("Goodbye! Thanks for visiting Taco4You!");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//    }

//    private void NewOrder() {
//        Order currentOrder = new Order(new ArrayList<Topping>());

//        boolean ordering = true;
//        while (ordering) {
//            System.out.println("\n--- ORDER MENU ---");
//            System.out.println("1) Add Taco");
//            System.out.println("2) Add Drink");
//            System.out.println("3) Add Chips & Salsa");
//            System.out.println("4) Checkout");
//            System.out.println("0) Cancel Order");
//            System.out.print("Choose an option: ");
//
//            String choice = scanner.nextLine();

//            switch (choice) {
//                case "1":
//                    Taco taco = buildTaco();
////                    order.getTacos().add(taco);
//                    System.out.println("Added taco to order!");
//                    break;
//                case "2":
//                    Drink drink = new Drink("Medium", 2.50); // placeholder
////                    order.getDrinks().add(drink);
//                    System.out.println("Added drink to order!");
//                    break;
//                case "3":
//                    Chips chips = new Chips("Salsa Roja", 1.50); // placeholder



