package clothes;

import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class ShopTrendingClothes {
    private static ClothingInformation[] menTrending;
    private static ClothingInformation[] womenTrending;
    static final String sizes = "S, M, L, XL";

    public static void setMenTrending() {
        Random rand = new Random();

        NumberFormat fmt = NumberFormat.getInstance();
        fmt.setMaximumFractionDigits(2);

        menTrending = new ClothingInformation[5];

        menTrending[0] = new ClothingInformation("Diagonal Crochet Pattern Short Sleeve Button Up Shirt", "White", sizes,
                fmt.format(rand.nextDouble(30) + 12));

        menTrending[1] = new ClothingInformation("Diagonal Crochet Pattern Shorts", "White", sizes,
                fmt.format(rand.nextDouble(32) + 12));

        menTrending[2] = new ClothingInformation("Our Planet Short Sleeve Tee", "Black", sizes,
                fmt.format(rand.nextDouble(35) + 12));

        menTrending[3] = new ClothingInformation("Drip Drip Nylon cargo Shorts", "Burgundy", sizes,
                fmt.format(rand.nextDouble(35) + 12));

        menTrending[4] = new ClothingInformation("Outkast So Clean Short Sleeve Tee", "Sand", sizes,
                fmt.format(rand.nextDouble(35) + 12));
    }

    public static ClothingInformation[] getMenTrending() {
        return menTrending;
    }

    public static void setWomenTrending() {
        Random rand = new Random();

        NumberFormat fmt = NumberFormat.getInstance();
        fmt.setMaximumFractionDigits(2);

        womenTrending = new ClothingInformation[5];

        womenTrending[0] = new ClothingInformation("Sunset Views Midi Dress", "Orange/combo", sizes,
                fmt.format(rand.nextDouble(35) + 12));

        womenTrending[1] = new ClothingInformation("Delia Earrings", "Gold", sizes,
                fmt.format(rand.nextDouble(7) + 12));

        womenTrending[2] = new ClothingInformation("Lana Distressed Top", "Lime", sizes,
                fmt.format(rand.nextDouble(35) + 12));

        womenTrending[3] = new ClothingInformation("Island Girl Crochet Skirt Set", "Aqua", sizes,
                fmt.format(rand.nextDouble(35) + 12));

        womenTrending[4] = new ClothingInformation("Sweet Ruffle Blouse", "Chartreuse", sizes,
                fmt.format(rand.nextDouble(35) + 12));
    }

    public static ClothingInformation[] getWomenTrending() {
        return womenTrending;
    }

    public static ClothingInformation[] getTrendingCategories() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nChoose a category: ");
        System.out.println("\t1. Men");
        System.out.println("\t2. Women");

        int category = input.nextInt();

        while (category != 1 && category != 2) {
            System.out.println("\nPlease enter a valid choice.\n");

            System.out.println("Choose a category: ");
            System.out.println("\t1. Men");
            System.out.println("\t2. Women");

            category = input.nextInt();
        }

        if (category == 1) {
            return getMenTrending();
        } else {
            return getWomenTrending();
        }
    }
}
