package main;

import checkout.CheckoutNow;
import clothes.*;
import profile.UserProfile;

import java.text.NumberFormat;

public class RunApp {
    public static void main(String[] args) {
        // print welcome message
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome to the Callback Cat’s Clothing Store!");

        // call display menu function in menu class and store return value in userChoice
        int userChoice = Menu.DisplayMenu();

        // create objects
        ShopClothes shopClothes = new ShopClothes();
        UserProfile profile = new UserProfile();
        CheckoutNow checkout = new CheckoutNow();

        // set lists of men clothing options
        ShopMen.setMenGraphicTees();
        ShopMen.setMenJeans();
        ShopMen.setMenShorts();
        ShopMen.setMenHoodies();
        ShopMen.setMenSwimwear();

        // set lists of women clothing options
        ShopWomen.setWomenTops();
        ShopWomen.setWomenMatchingSets();
        ShopWomen.setWomenDresses();
        ShopWomen.setWomenJeans();
        ShopWomen.setWomenSwimwear();

        // set lists of trending clothing options
        ShopTrendingClothes.setMenTrending();
        ShopTrendingClothes.setWomenTrending();

        // create fmt that format numbers to 2 decimal places
        NumberFormat fmt = NumberFormat.getInstance();
        fmt.setMaximumFractionDigits(2);

        // initialize variables
        ClothingInformation[] clothingCategory;
        ClothingInformation clothInfoAdding;
        int count = 0;
        boolean alreadyCheckedOut = false;

        // loop until user wants to leave store
        while (userChoice != 7) {

            // compare with user choice
            switch (userChoice) {

                // shop for men
                case 1:
                    // display men categories and return list of clothing options from category user chose
                    clothingCategory = ShopMen.getMenCategories();

                    // display clothing options and return clothing information from what user chose
                    clothInfoAdding = shopClothes.getItemBuying(clothingCategory);

                    // add item to shopping cart and increment count (number of items in shopping cart)
                    profile.addToShoppingCart(count, clothInfoAdding);
                    count++;

                    break;

                // shop for women
                case 2:
                    // display women categories and return list of clothing options from category user chose
                    clothingCategory = ShopWomen.getWomenCategories();

                    // display clothing options and return clothing information from what user chose
                    clothInfoAdding = shopClothes.getItemBuying(clothingCategory);

                    // add item to shopping cart and increment count (number of items in shopping cart)
                    profile.addToShoppingCart(count, clothInfoAdding);
                    count++;

                    break;

                // shop for trending clothes
                case 3:
                    // display women categories and return list of clothing options from category user chose
                    clothingCategory = ShopTrendingClothes.getTrendingCategories();

                    // display clothing options and return clothing information from what user chose
                    clothInfoAdding = shopClothes.getItemBuying(clothingCategory);

                    // add item to shopping cart and increment count (number of items in shopping cart)
                    profile.addToShoppingCart(count, clothInfoAdding);
                    count++;

                    break;

                // view and/or edit shopping cart
                case 4:
                    // shopping cart is not empty
                    if (count != 0) {
                        System.out.println();

                        // display shopping cart
                        profile.displayShoppingCart();

                        // call itemDeleting function and set count to count returned from function
                        count = profile.itemDeleting(count);

                        System.out.println();

                    // shopping cart is empty, print statement
                    } else {
                        System.out.println("\nYou're shopping cart is empty!\n");
                    }

                    break;

                // checkout
                case 5:
                    // shopping cart is not empty
                    if (count != 0) {
                        System.out.println();

                        // display shopping cart and calculate estimated price
                        profile.displayShoppingCart();
                        checkout.calculateEstimatedPrice(UserProfile.getShoppingCart());

                        // ask user if they are ready to checkout and return response in goCheckout
                        String goCheckout = checkout.askIfReadyToCheckOut();

                        // user wants to checkout
                        if (goCheckout.equals("yes")) {

                            // calculate final price
                            checkout.calculateFinalPrice(checkout.getEstimatedPrice());

                            // address not already set, print question
                            if (profile.getAddress() == null) {
                                System.out.println("\nYou haven't entered your address yet. Where you would like your " +
                                        "package and bill to be shipped to?");
                            }

                            // set address if not already set
                            profile.checkIfAddressAlreadySet();

                            // ask user if they have discount code
                            String haveCode = checkout.askIfHaveDiscountCode();

                            // user has code, call checkDiscountCode function
                            if (haveCode.equals("yes")) {
                                checkout.checkDiscountCode();
                            }

                            // print statements
                            System.out.println("\nCheckout successful.");
                            System.out.println("\nYour package and bill will be shipped to:");
                            System.out.println("\t" + profile.getAddress());

                            // set already checked out to true so loop stops
                            alreadyCheckedOut = true;
                        }

                        System.out.println();

                    // shopping cart is empty, print statement
                    } else {
                        System.out.println("\nYou're shopping cart is empty!\n");
                    }

                    break;

                // create and/or view profile
                case 6:
                    // user hasn't set their profile yet, print statement and call buildProfile function
                    if (profile.getFirstName() == null) {
                        System.out.println("\nYou haven't built your profile yet.");
                        profile.buildProfile();
                    }

                    // display profile
                    profile.displayProfile();

                    // shopping cart not empty, display what is in cart
                    if (count != 0) {
                        profile.displayShoppingCart();
                        System.out.println();

                    // shopping cart empty
                    } else {
                        System.out.println("You're shopping cart is empty!\n");
                    }

                    break;

                // if valid option not chosen, print statement
                default:
                    System.out.println("\nPlease enter a valid choice.\n");
                    break;
            }

            // if already checked out, keep loop going
            if (!alreadyCheckedOut) {
                userChoice = Menu.DisplayMenu();

            // already checked out, stop looping
            } else {
                break;
            }

        }

        // print statement
        System.out.println("Thanks for shopping at the Callback Cat’s Clothing Store!");
    }
}
