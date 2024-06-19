package profile;

import clothes.ClothingInformation;

import java.util.Scanner;

public class UserProfile {
    // data fields
    final int[] SMEASUREMENTS = new int[] {34, 35, 27, 28, 37, 38};
    final int[] MMEASUREMENTS = new int[] {36, 38, 29, 30, 39, 40};
    final int[] LMEASUREMENTS = new int[] {39, 40, 31, 32, 42, 43};
    final int[] XLMEASUREMENTS = new int[] {41, 43, 34, 35, 44, 45};
    private String firstName;
    private String lastName;
    private String address;
    private double bust;
    private double waist;
    private double hips;
    private static ClothingInformation[] shoppingCart;
    private final java.util.Date dateCreated;

    // no arguments constructor
    public UserProfile() {
        // initialize shopping cart and when profile was created
        shoppingCart = new ClothingInformation[20];
        dateCreated = new java.util.Date();
    }

    // first name setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // address setter
    public void setAddress(String address) {
        this.address = address;
    }

    // last name setter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // bust setter
    public void setBust(double bust) {
        this.bust = bust;
    }

    // waist setter
    public void setWaist(double waist) {
        this.waist = waist;
    }

    // hips setter
    public void setHips(double hips) {
        this.hips = hips;
    }

    // first name getter
    public String getFirstName() {
        return this.firstName;
    }

    // last name getter
    public String getLastName() {
        return this.lastName;
    }

    // address getter
    public String getAddress() {
        return this.address;
    }

    // bust getter
    public double getBust() {
        return this.bust;
    }

    // waist getter
    public double getWaist() {
        return this.waist;
    }

    // hips getter
    public double getHips() {
        return this.hips;
    }

    // date created getter
    public java.util.Date getWhenCreated() {
        return this.dateCreated;
    }

    public String suggestSize() {
        // if bust is between small bust range, waist range, and hips range they are small
        if (bust < SMEASUREMENTS[1] && bust > SMEASUREMENTS[0]) {
            if (waist < SMEASUREMENTS[3] && waist > SMEASUREMENTS[2]) {
                if (hips < SMEASUREMENTS[5] && hips > SMEASUREMENTS[4]) {
                    return "Suggested Size: You are a perfect fit for SMALL";

                // if bust is between small bust range and waist range, they are small
                } else {
                    return "Suggested Size: SMALL";
                }

            // if bust is between small bust range, they are small
            } else {
                return "Suggested Size: SMALL";
            }

        // if bust is less than small max, they are small
        } else if (bust < SMEASUREMENTS[1]) {
            return "Suggested Size: SMALL";
        }

        // if bust is between medium bust range, waist range, and hips range they are medium
        if (bust < MMEASUREMENTS[1] && bust > MMEASUREMENTS[0]) {
            if (waist < MMEASUREMENTS[3] && waist > MMEASUREMENTS[2]) {
                if (hips < MMEASUREMENTS[5] && hips > MMEASUREMENTS[4]) {
                    return "Suggested Size: You are a perfect fit for MEDIUM";

                // if bust is between medium bust range and waist range, they are medium
                } else {
                    return "Suggested Size: MEDIUM";
                }

            // if bust is between medium bust range, they are medium
            } else {
                return "Suggested Size: MEDIUM";
            }

        // if bust is less than medium max, they are medium
        } else if (bust < MMEASUREMENTS[1]) {
            return "Suggested Size: MEDIUM";
        }

        // if bust is between large bust range, waist range, and hips range they are large
        if (bust < LMEASUREMENTS[1] && bust > LMEASUREMENTS[0]) {
            if (waist < LMEASUREMENTS[3] && waist > LMEASUREMENTS[2]) {
                if (hips < LMEASUREMENTS[5] && hips > LMEASUREMENTS[4]) {
                    return "Suggested Size: You are a perfect fit for LARGE";

                // if bust is between large bust range and waist range, they are large
                } else {
                    return "Suggested Size: LARGE";
                }

            // if bust is between large bust range, they are large
            } else {
                return "Suggested Size: LARGE";
            }

        //  if bust is less than large max, they are large
        } else if (bust < LMEASUREMENTS[1]) {
            return "Suggested Size: LARGE";
        }

        // if bust is between xlarge bust range, waist range, and hips range they are xlarge
        if (bust < XLMEASUREMENTS[1] && bust > XLMEASUREMENTS[0]) {
            if (waist < XLMEASUREMENTS[3] && waist > XLMEASUREMENTS[2]) {
                if (hips < XLMEASUREMENTS[5] && hips > XLMEASUREMENTS[4]) {
                    return "Suggested Size: You are a perfect fit for XLARGE";

                // if bust is between xlarge bust range and waist range, they are xlarge
                } else {
                    return "Suggested Size: XLARGE";
                }

            // if bust is between xlarge bust range, they are xlarge
            } else {
                return "Suggested Size: XLARGE";
            }

        //  if bust is less than xlarge max, they are xlarge
        } else if (bust < XLMEASUREMENTS[1]) {
            return "Suggested Size: XLARGE";
        }

        // if users size does not fit in range, print message and return size min and max
        String noSuggestedSizeMsg = "Sorry, we couldn't give you a suggested size because your measurements were too " +
                "off. However you can make guess. Here are the measurements:\n";
        String smallSizes = "\tSmall:\n\t\t" + "Bust: " + SMEASUREMENTS[0] + "-" + SMEASUREMENTS[1] + "\n\t\tWaist: " +
                SMEASUREMENTS[2] + "-" + SMEASUREMENTS[3] + "\n\t\tHips: " + SMEASUREMENTS[4] + "-" + SMEASUREMENTS[5] + "\n";

        String mediumSizes = "\tMedium:\n\t\t" + "Bust: " + MMEASUREMENTS[0] + "-" + MMEASUREMENTS[1] + "\n\t\tWaist: " +
                MMEASUREMENTS[2] + "-" + MMEASUREMENTS[3] + "\n\t\tHips: " + MMEASUREMENTS[4] + "-" + MMEASUREMENTS[5] + "\n";

        String largeSizes = "\tLarge:\n\t\t" + "Bust: " + LMEASUREMENTS[0] + "-" + LMEASUREMENTS[1] + "\n\t\tWaist: " +
                LMEASUREMENTS[2] + "-" + LMEASUREMENTS[3] + "\n\t\tHips: " + LMEASUREMENTS[4] + "-" + LMEASUREMENTS[5] + "\n";

        String xlargeSizes = "\tXLarge:\n\t\t" + "Bust: " + XLMEASUREMENTS[0] + "-" + XLMEASUREMENTS[1] + "\n\t\tWaist: " +
                XLMEASUREMENTS[2] + "-" + XLMEASUREMENTS[3] + "\n\t\tHips: " + XLMEASUREMENTS[4] + "-" + XLMEASUREMENTS[5] + "\n";

        return noSuggestedSizeMsg + smallSizes + mediumSizes + largeSizes + xlargeSizes;
    }

    public void addToShoppingCart(int count, ClothingInformation clothInfoAdding) {
        // add item to shopping cart and print message
        shoppingCart[count] = clothInfoAdding;
        System.out.println("\nAdding '" + clothInfoAdding.getName() + "' to shopping cart...\n");
    }

    public void displayShoppingCart() {
        System.out.println("Shopping Cart: ");

        // if item in shopping cart not null, print information
        for (int i = 0; i < shoppingCart.length; i++) {
            if (shoppingCart[i] != null) {
                System.out.println("\t" + (i + 1) + ". " + shoppingCart[i].getName());
                System.out.println("\t\tColor: " + shoppingCart[i].getColor());
                System.out.println("\t\tSize: " + shoppingCart[i].getSizes());
                System.out.println("\t\tPrice: $" + shoppingCart[i].getPrice());
            }
        }
    }

    public static ClothingInformation[] getShoppingCart() {
        return shoppingCart;
    }

    public void deleteItem(int index, int count) {
        // print statement
        System.out.print("\nDeleting '" + shoppingCart[index].getName() + "' from shopping cart...\n");

        // set current index to null
        shoppingCart[index] = null;

        // restructure shopping cart so all items after are next
        restructureCart(index, count);
    }

    public void restructureCart(int indexNull, int count) {
        // base case (don't need to fix shopping cart if only 1 item in cart or last item is being deleting)
        if (count == 1 || indexNull == count - 1) {
            return;
        }

        // make temp cart of shopping cart
        ClothingInformation[] tempCart = shoppingCart;

        // loop through cart starting at indexNull and make everything after go up one index in cart
        for (int i = indexNull; i < count; i++) {
            for (int j = 0; j < 4; j++) {
                shoppingCart[i] = tempCart[i + 1];
            }

        }
    }

    public int itemDeleting(int count) {
        // used to get input from user
        Scanner input = new Scanner(System.in);

        // ask user if they want to take item out, store in takeItemOut
        System.out.print("\nWould you like to take out an item (yes/no)? ");
        String takeItemOut = input.nextLine().toLowerCase();

        // check if entered valid choice
        while (!takeItemOut.equals("yes") && !takeItemOut.equals("no")) {
            System.out.println("\nPlease enter a valid choice.\n");

            // ask user if they want to take item out, store in takeItemOut
            System.out.print("Would you like to take out an item (yes/no)? ");
            takeItemOut = input.nextLine().toLowerCase();
        }

        // user wants to check out
        if (takeItemOut.equals("yes")) {

            // if only one item in cart
            if (count == 1) {
                // delete item and decrement count
                deleteItem(0, count);
                count--;

                System.out.println("\nYou're shopping cart is now empty!");

            // more than one item in cart
            } else {

                // ask user which item they want to delete
                System.out.print("Which item (1-" + count + ")? ");
                int item = input.nextInt();
                input.nextLine();

                // check if entered valid choice
                while (item > count || item < 1) {
                    System.out.println("\nPlease enter a valid choice.\n");

                    // ask user which item they want to delete
                    System.out.print("Which item (1-" + count + ")? ");
                    item = input.nextInt();
                    input.nextLine();
                }

                // delete item and decrement count
                deleteItem(item - 1, count);
                count--;
            }

        }

        return count;
    }

    public void checkIfAddressAlreadySet() {
        // used to get input from user
        Scanner input = new Scanner(System.in);

        // user hasn't entered address yet
        if (getAddress() == null) {
            // get address from user and store in address
            System.out.print("Address: ");
            String address = input.nextLine();

            // make sure address isn't empty
            if (address.isEmpty()) {
                System.out.println("Please enter an address.");

                // get address from user and store in address
                System.out.print("Address: ");
                address = input.nextLine();
            }

            // set address
            setAddress(address);
        }
    }

    public void buildProfile() {
        // used to get input from user
        Scanner input = new Scanner(System.in);

        // get first name from user and set first name
        System.out.print("\nWhat's your first name: ");
        String firstName = input.nextLine();
        setFirstName(firstName);

        // get last name from user and set last name
        System.out.print("What's your last name: ");
        String lastName = input.nextLine();
        setLastName(lastName);

        // set address
        checkIfAddressAlreadySet();

        // get bust from user and set bust
        System.out.print("Bust Size (inches): ");
        double bust = input.nextDouble();
        input.nextLine();
        setBust(bust);

        // get waist from user and set waist
        System.out.print("Waist Size (inches): ");
        double waist = input.nextDouble();
        input.nextLine();
        setWaist(waist);

        // get hips from user and set hips
        System.out.print("Hip Size (inches): ");
        double hips = input.nextDouble();
        input.nextLine();
        setHips(hips);
    }

    public void displayProfile() {
        System.out.println("\n" + getWhenCreated());
        System.out.println(getFirstName() + " " + getLastName());
        System.out.println(getAddress());
        System.out.println("Bust: " + getBust() + " Waist: " + getWaist() + " Hips: " + getHips());
        System.out.println(suggestSize());
    }
}