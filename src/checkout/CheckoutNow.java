package checkout;

import clothes.ClothingInformation;

import java.text.NumberFormat;
import java.util.Scanner;

public class CheckoutNow {
    final double TAX = 0.0625;
    final double SHIPPING = 8.95;
    final String[] validCodes = {"CLMVBG", "callbackCat", "SP2023", "RQAEAD", "summerIsAlmostHere"};
    private double estimatedPrice;
    private double finalPrice;

    public CheckoutNow() {
        this.estimatedPrice = 0.0;
        this.finalPrice = 0.0;
    }

    public void calculateEstimatedPrice(ClothingInformation[] cart) {
        NumberFormat fmt = NumberFormat.getInstance();
        fmt.setMaximumFractionDigits(2);

        estimatedPrice = 0.0;

        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != null) {
                estimatedPrice += Double.parseDouble(cart[i].getPrice());
            }
        }

        System.out.println("Estimated Price: $" + fmt.format(estimatedPrice));
    }

    public void calculateFinalPrice(double estPrice) {
        NumberFormat fmt = NumberFormat.getInstance();
        fmt.setMaximumFractionDigits(2);

        this.finalPrice = estPrice + SHIPPING + (estPrice * TAX);

        System.out.println("\nFinal Price: $" + fmt.format(finalPrice));
    }

    public double getEstimatedPrice() {
        return this.estimatedPrice;
    }

    public String askIfHaveDiscountCode() {
        Scanner input = new Scanner(System.in);

        System.out.print("\nDo you have a discount code (yes/no)? ");
        String haveCode = input.nextLine();

        while (!haveCode.equals("yes") && !haveCode.equals("no")) {
            System.out.println("\nPlease enter a valid choice.");

            System.out.print("\nDo you have a discount code (yes/no)? ");
            haveCode = input.nextLine();
        }

        return haveCode;
    }

    public void checkDiscountCode() {
        NumberFormat fmt = NumberFormat.getInstance();
        fmt.setMaximumFractionDigits(2);

        Scanner input = new Scanner(System.in);

        int triesLeft = 3;

        while (triesLeft != 0) {
            System.out.print("Enter Code: ");
            String code = input.nextLine();

            boolean isIn = false;

            for (String validCode : this.validCodes) {
                if (validCode.equals(code)) {
                    isIn = true;
                    break;
                }
            }

            if (isIn) {
                System.out.println("Valid Code! Deducting 10% from price...");

                this.finalPrice -= this.finalPrice * 0.10;

                System.out.println("\nNew Final Price: $" + Double.parseDouble(fmt.format((this.finalPrice))));
                return;

            } else {
                triesLeft--;
                System.out.println("You didn't enter a valid code.");

                if (triesLeft == 0) {
                    System.out.println("Sorry, you have no more tries left.");
                } else {
                    System.out.println("You have " + triesLeft + " more tries");
                }
            }
        }
    }

    public String askIfReadyToCheckOut() {
        Scanner input = new Scanner(System.in);

        System.out.print("\nProceed to Checkout (yes/no)? ");
        String goCheckout = input.nextLine().toLowerCase();

        while (!goCheckout.equals("yes") && !goCheckout.equals("no")) {
            System.out.println("\nPlease enter a valid choice.\n");

            System.out.print("Proceed to Checkout (yes/no)? ");
            goCheckout = input.nextLine().toLowerCase();
        }

        return goCheckout;
    }
}
