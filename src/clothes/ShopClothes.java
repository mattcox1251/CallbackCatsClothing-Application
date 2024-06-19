package clothes;

import java.util.Scanner;

public class ShopClothes {
    public static void displayClothes(ClothingInformation[] currentCategory) {
        for (int i = 0; i < currentCategory.length; i++) {
            System.out.println(i + 1 + ". " + currentCategory[i].getName());
            System.out.println("\tColor: " + currentCategory[i].getColor());
            System.out.println("\tSize: " + currentCategory[i].getSizes());
            System.out.println("\tPrice: $" + currentCategory[i].getPrice());
        }
    }

    public static String getSize(ClothingInformation[] currentCategory, int choice) {
        Scanner input = new Scanner(System.in);

        System.out.print("Which size do you want? ");
        String size = input.nextLine().toUpperCase();

        int firstSize = currentCategory[choice - 1].getSizes().indexOf(',');
        int secondSize = currentCategory[choice - 1].getSizes().indexOf(',', firstSize + 1);
        int thirdSize = currentCategory[choice - 1].getSizes().indexOf(',', secondSize + 1);

        boolean isValid = currentCategory[choice - 1].getSizes().substring(0, firstSize).equals(size) ||
                currentCategory[choice - 1].getSizes().substring(firstSize + 2, secondSize).equals(size) ||
                currentCategory[choice - 1].getSizes().substring(secondSize + 2, thirdSize).equals(size) ||
                currentCategory[choice - 1].getSizes().substring(thirdSize + 2).equals(size);

        while (!isValid) {
            System.out.println("\nPlease enter a valid size.\n");

            System.out.print("Which size do you want? ");
            size = input.nextLine().toUpperCase();

            firstSize = currentCategory[choice - 1].getSizes().indexOf(',');
            secondSize = currentCategory[choice - 1].getSizes().indexOf(',', firstSize + 1);
            thirdSize = currentCategory[choice - 1].getSizes().indexOf(',', secondSize + 1);

            isValid = currentCategory[choice - 1].getSizes().substring(0, firstSize).equals(size) ||
                    currentCategory[choice - 1].getSizes().substring(firstSize + 2, secondSize).equals(size) ||
                    currentCategory[choice - 1].getSizes().substring(secondSize + 2, thirdSize).equals(size) ||
                    currentCategory[choice - 1].getSizes().substring(thirdSize + 2).equals(size);
        }

        return size;
    }

    public ClothingInformation getItemBuying(ClothingInformation[] currentCategory) {
        Scanner input = new Scanner(System.in);

        System.out.println();

        displayClothes(currentCategory);

        System.out.print("Which one would you like to buy? ");
        int clothChoice = input.nextInt();

        while (clothChoice > 5 || clothChoice < 1) {
            System.out.println("\nPlease enter a valid choice.\n");

            System.out.print("Which one would you like to buy? ");
            clothChoice = input.nextInt();
        }

        String size = getSize(currentCategory, clothChoice);

        return new ClothingInformation(currentCategory[clothChoice - 1].getName(),
                currentCategory[clothChoice - 1].getColor(), size, currentCategory[clothChoice - 1].getPrice());
    }
}