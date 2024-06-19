package main;

import java.util.Scanner;

public class Menu {
    public static int DisplayMenu() {
        // used to get input from user
        Scanner input = new Scanner(System.in);

        // print options
        System.out.println("What would you like to do? (1-7)");
        System.out.println("\t1. Shop For Men");
        System.out.println("\t2. Shop For Women");
        System.out.println("\t3. Shop For Trending Clothes");
        System.out.println("\t4. View And/Or Edit Shopping Cart");
        System.out.println("\t5. Checkout");
        System.out.println("\t6. Create And/Or View Profile");
        System.out.println("\t7. Leave Store");

        // return users input
        return input.nextInt();
    }
}
