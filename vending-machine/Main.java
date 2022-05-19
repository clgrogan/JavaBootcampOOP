import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Item[][] items = new Item[][] {
                { new Item("Pepsi", 1.99, 3), new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
                { new Item("Fanta", 1.99, 2), new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
                { new Item("Crush", 1.99, 2), new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
        };
        Machine machine = new Machine(items);
        Scanner scanner = new Scanner(System.in);
        int scanRow;
        int scanSpot;
        boolean exit = false;

        System.out.println("\n\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");

        while (!exit) {
            System.out.println(machine);
            System.out.print("Pick a row: ");
            scanRow = scanner.nextInt();
            System.out.print("\nPick a spot in the row: ");
            scanSpot = scanner.nextInt();
            if (machine.dispense(scanRow, scanSpot)) {
                System.out.print("\nEnjoy your drink! Enter 1 to purchase another: ");
            } else {
                System.out.print("\nSorry, we are out of that item. Enter 1 to purchase another: ");
            }
            int scanExit = scanner.nextInt();
            System.out.println(scanExit);
            if (scanExit != 1) {
                System.out.println("\n\tBuh-Bye now\n");
                exit = true;
            }

        }

    }
}
