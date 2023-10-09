package Change;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input cost of the item
        System.out.print("Enter the cost of the item (in dollars and cents): ");
        float cost = scanner.nextFloat();

        // Input amount tendered
        System.out.print("Enter the amount tendered (in dollars and cents): ");
        float amountTendered = scanner.nextFloat();

        // Calculate the change (in cents)
        int changeInCents = Math.round((amountTendered - cost) * 100);

        if (changeInCents < 0) {
            System.out.println("Insufficient funds. Please provide more money.");
        } else if (changeInCents == 0) {
            System.out.println("Exact change provided. No change is needed.");
        } else {
            float changeInDollars = (float) changeInCents / 100.0f;
            System.out.println("Change to be given: $" + changeInDollars);

            // Calculate and display the number of each denomination to be given
            int twenties = changeInCents / (20 * 100);
            changeInCents %= (20 * 100);
            int tens = changeInCents / (10 * 100);
            changeInCents %= (10 * 100);
            int fives = changeInCents / (5 * 100);
            changeInCents %= (5 * 100);
            int ones = changeInCents / 100;
            changeInCents %= 100;

            int quarters = changeInCents / 25;
            changeInCents %= 25;
            int dimes = changeInCents / 10;
            changeInCents %= 10;
            int nickels = changeInCents / 5;
            changeInCents %= 5;
            int pennies = changeInCents;

            if (twenties > 0) System.out.println("Twenties: " + twenties);
            if (tens > 0) System.out.println("Tens: " + tens);
            if (fives > 0) System.out.println("Fives: " + fives);
            if (ones > 0) System.out.println("Ones: " + ones);
            if (quarters > 0) System.out.println("Quarters: " + quarters);
            if (dimes > 0) System.out.println("Dimes: " + dimes);
            if (nickels > 0) System.out.println("Nickels: " + nickels);
            if (pennies > 0) System.out.println("Pennies: " + pennies);
        }
        
	}
}
