package machine;
import java.util.Scanner;
//import java.lang.Math;

public class CoffeeMachine {

    public static int amountWaterOnStock = 400; // in ml
    public static int amountMilkOnStock = 540; // in ml
    public static int amountCoffeeBeansOnStock = 120; // in g
    public static int amountCups = 9;
    public static int amountMoneyInCashBox = 550; // in $

    public static void main(String[] args) {
        /*
        // Stage 1/6
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");

        // Stage 2/6
        final int amountWaterPerCup = 200; // in ml
        final int amountMilkPerCup = 50; // in ml
        final int amountCoffeeBeansPerCup = 15; // in g
        int pricePerCup;
         */
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("Write how many cups of coffee you will need: ");
        int amountCups = scanner.nextInt();

        System.out.println("For " + amountCups + " cups of coffee you will need:\n" +
                            (amountCups * amountWaterPerCup) + " ml of water\n" +
                            (amountCups * amountMilkPerCup) + " ml of milk\n" +
                            (amountCups * amountCoffeeBeansPerCup) + " g of coffee beans");

        // Stage 3/6
        int amountWaterOnStock; // in ml
        int amountMilkOnStock; // in ml
        int amountCoffeeBeansOnStock; // in g
        int amountCups;

        System.out.println("Write how many ml of water the coffee machine has: ");
        amountWaterOnStock = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        amountMilkOnStock = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        amountCoffeeBeansOnStock = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        amountCups = scanner.nextInt();

        int maxAmountCupsFromStock = 0;

        int tempAmountWaterUsed = amountWaterPerCup;
        int tempAmountMilkUsed = amountMilkPerCup;
        int tempAmountCoffeeBeansUsed = amountCoffeeBeansPerCup;

        while (tempAmountWaterUsed <= amountWaterOnStock
                && tempAmountMilkUsed <= amountMilkOnStock
                && tempAmountCoffeeBeansUsed <= amountCoffeeBeansOnStock) {

            tempAmountWaterUsed += amountWaterPerCup;
            tempAmountMilkUsed += amountMilkPerCup;
            tempAmountCoffeeBeansUsed += amountCoffeeBeansPerCup;
            maxAmountCupsFromStock++;
        }

        if (maxAmountCupsFromStock == amountCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (maxAmountCupsFromStock > amountCups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + Math.abs(amountCups - maxAmountCupsFromStock) +" more than that)");
        } else {
            System.out.println("No, I can make only " + maxAmountCupsFromStock + " cup(s) of coffee");
        }

        // Stage 4/6
        int amountWaterOnStock = 400; // in ml
        int amountMilkOnStock = 540; // in ml
        int amountCoffeeBeansOnStock = 120; // in g
        int amountCups = 9;
        int amountMoneyInCashBox = 550; // in $
         */
        String action = "";
        /*
        status(amountWaterOnStock, amountMilkOnStock, amountCoffeeBeansOnStock, amountCups, amountMoneyInCashBox);
         */

        while (!action.equals("exit")) {         // added at Stage 5/6

            System.out.println("Write action (buy, fill, take, remaining, exit): ");         // remaining & exit added at Stage 5/6
            action = scanner.next().toLowerCase();

            switch (action) {
                case "buy":
                    String drink;         // became a string at Stage 5/6

                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                    drink = scanner.next().toLowerCase();

                    switch (drink) {
                        case "1":
                            // espresso
                            drink(250, 0, 16, 4);
                            break;

                        case "2":
                            // latte
                            drink(350, 75, 20, 7);
                            break;

                        case "3":
                            // cappuccino
                            drink(200, 100, 12, 6);
                            break;

                        // Stage 5/6
                        case "back":
                            break;
                    }
                    break;

                case "fill":
                    System.out.println("Write how many ml of water do you want to add: ");
                    amountWaterOnStock += scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add: ");
                    amountMilkOnStock += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    amountCoffeeBeansOnStock += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    amountCups += scanner.nextInt();
                    /*
                    status(amountWaterOnStock, amountMilkOnStock, amountCoffeeBeansOnStock, amountCups, amountMoneyInCashBox);
                     */
                    break;

                case "take":
                    System.out.println("I gave you $" + amountMoneyInCashBox);
                    amountMoneyInCashBox = 0;
                    /*
                    status(amountWaterOnStock, amountMilkOnStock, amountCoffeeBeansOnStock, amountCups, amountMoneyInCashBox);
                     */
                    break;

                // Stage 5/6
                case "remaining":
                    status(amountWaterOnStock, amountMilkOnStock, amountCoffeeBeansOnStock, amountCups, amountMoneyInCashBox);
                    break;

                case "exit":
                    System.exit(0);
            }
        }
    }

    public static void drink (int amountWaterPerCup, int amountMilkPerCup, int amountCoffeeBeansPerCup, int pricePerCup) {
        // changed at Stage 5/6
        if (amountWaterOnStock > amountWaterPerCup && amountMilkOnStock > amountMilkPerCup && amountCoffeeBeansOnStock > amountCoffeeBeansPerCup && amountCups > 0) {
            System.out.print("I have enough resources, making you a coffee!");

            amountWaterOnStock -= amountWaterPerCup;
            amountMilkOnStock -= amountMilkPerCup;
            amountCoffeeBeansOnStock -= amountCoffeeBeansPerCup;
            amountCups--;
            amountMoneyInCashBox += pricePerCup;

        } else {

            if (amountWaterOnStock > amountWaterPerCup) {
                System.out.println("Sorry, not enough water!");
            } else if (amountMilkOnStock > amountMilkPerCup) {
                System.out.println("Sorry, not enough milk!");
            } else if (amountCoffeeBeansOnStock > amountCoffeeBeansPerCup) {
                System.out.println("Sorry, not enough coffee beans!");
            } else {
                System.out.println("Sorry, not enough cups!");
            }
        }
        /*
        status(amountWaterOnStock, amountMilkOnStock, amountCoffeeBeansOnStock, amountCups, amountMoneyInCashBox);
         */
    }

    public static void status (int amountWaterOnStock, int amountMilkOnStock, int amountCoffeeBeansOnStock, int amountCups, int amountMoneyInCashBox) {

        System.out.println("The coffee machine has:\n"
                + amountWaterOnStock + " of water\n"
                + amountMilkOnStock + " of milk\n"
                + amountCoffeeBeansOnStock + " of coffee beans\n"
                + amountCups + " of disposable cups\n"
                + amountMoneyInCashBox + " of money");
    }
}