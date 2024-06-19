package clothes;

import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class ShopWomen {
    private static ClothingInformation[] tops;
    private static ClothingInformation[] matchingSets;
    private static ClothingInformation[] dresses;
    private static ClothingInformation[] jeans;
    private static ClothingInformation[] swimwear;
    static final String sizes = "S, M, L, XL";

    public static void setWomenTops() {
        Random rand = new Random();

        NumberFormat fmt = NumberFormat.getInstance();
        fmt.setMaximumFractionDigits(2);

        tops = new ClothingInformation[5];

        tops[0] = new ClothingInformation("Skyla Floral Bodysuit", "Pink", sizes,
                fmt.format(rand.nextDouble(35) + 12));

        tops[1] = new ClothingInformation("Freedom Tour One shoulder Top", "White", sizes,
                fmt.format(rand.nextDouble(35) + 12));

        tops[2] = new ClothingInformation("Divine Feminine Ruffle Top", "Lavender", sizes,
                fmt.format(rand.nextDouble(35) + 12));

        tops[3] = new ClothingInformation("Kacee Halter Top", "Turquoise", sizes,
                fmt.format(rand.nextDouble(35) + 12));

        tops[4] = new ClothingInformation("Chantelle Ribbed Top", "Teal", sizes,
                fmt.format(rand.nextDouble(35) + 12));
    }

    public static ClothingInformation[] getWomenTops() {
        return tops;
    }

    public static void setWomenMatchingSets() {
        Random rand = new Random();

        NumberFormat fmt = NumberFormat.getInstance();
        fmt.setMaximumFractionDigits(2);

        matchingSets = new ClothingInformation[5];

        matchingSets[0] = new ClothingInformation("Next Level Bubble Skirt Set", "Red/combo", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        matchingSets[1] = new ClothingInformation("She's Limited Edition Biker Short Set", "Baby Blue", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        matchingSets[2] = new ClothingInformation("Leslie Satin Short Set", "Orange", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        matchingSets[3] = new ClothingInformation("Always On My mind Pant Set", "Brown/combo", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        matchingSets[4] = new ClothingInformation("Totally Ribbed Biker Short Set", "Black", sizes,
                fmt.format(rand.nextDouble(30) + 35));
    }

    public static ClothingInformation[] getWomenMatchingSets() {
        return matchingSets;
    }

    public static void setWomenDresses() {
        Random rand = new Random();

        NumberFormat fmt = NumberFormat.getInstance();
        fmt.setMaximumFractionDigits(2);

        dresses = new ClothingInformation[5];

        dresses[0] = new ClothingInformation("Kimberly Mini dress", "Blue", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        dresses[1] = new ClothingInformation("Palm Springs Mesh Mini Dress", "Multi Color", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        dresses[2] = new ClothingInformation("Mesmerized Metallic Mini Dress", "Green", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        dresses[3] = new ClothingInformation("Elina Sequin Feather Mini Dress", "Silver", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        dresses[4] = new ClothingInformation("Sugar Free Dress", "White", sizes,
                fmt.format(rand.nextDouble(30) + 35));
    }

    public static ClothingInformation[] getWomenDresses() {
        return dresses;
    }

    public static void setWomenJeans() {
        Random rand = new Random();

        NumberFormat fmt = NumberFormat.getInstance();
        fmt.setMaximumFractionDigits(2);

        jeans = new ClothingInformation[5];

        jeans[0] = new ClothingInformation("Lily High Rise Cargo Jeans", "Green", sizes,
                fmt.format(rand.nextDouble(30) + 20));

        jeans[1] = new ClothingInformation("Mad For You Cargo Jeans", "Acid Wash Black", sizes,
                fmt.format(rand.nextDouble(30) + 20));

        jeans[2] = new ClothingInformation("Nila 90's Cargo Jeans", "Light Wash", sizes,
                fmt.format(rand.nextDouble(30) + 20));

        jeans[3] = new ClothingInformation("Classic High Waist Skinny Jeans", "Dark Denim", sizes,
                fmt.format(rand.nextDouble(30) + 20));

        jeans[4] = new ClothingInformation("Flying High Low Stretch Cargo Jeans", "White", sizes,
                fmt.format(rand.nextDouble(30) + 20));
    }

    public static ClothingInformation[] getWomenJeans() {
        return jeans;
    }

    public static void setWomenSwimwear() {
        Random rand = new Random();

        NumberFormat fmt = NumberFormat.getInstance();
        fmt.setMaximumFractionDigits(2);

        swimwear = new ClothingInformation[5];

        swimwear[0] = new ClothingInformation("Beach House 1 Piece Swimsuit", "Olive", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        swimwear[1] = new ClothingInformation("Make My Summer Long Sleeve 2 Piece Bikini", "Pink/combo", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        swimwear[2] = new ClothingInformation("Any Way You Want 2 Piece Bikini", "Yellow", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        swimwear[3] = new ClothingInformation("Sunkissed Nose 1 Piece Swimsuit", "Multi Color", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        swimwear[4] = new ClothingInformation("Sunkissed Nose 1 Piece Swimsuit", "Black", sizes,
                fmt.format(rand.nextDouble(30) + 35));
    }

    public static ClothingInformation[] getWomenSwimwear() {
        return swimwear;
    }

    public static ClothingInformation[] getWomenCategories() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nChoose a category: ");
        System.out.println("\t1. Tops");
        System.out.println("\t2. Matching Sets");
        System.out.println("\t3. Dresses");
        System.out.println("\t4. Jeans");
        System.out.println("\t5. Swimwear");

        int category = input.nextInt();

        while (category > 5 || category < 1) {
            System.out.println("\nPlease enter a valid choice.\n");

            System.out.println("Choose a category: ");
            System.out.println("\t1. Tops");
            System.out.println("\t2. Matching Sets");
            System.out.println("\t3. Dresses");
            System.out.println("\t4. Jeans");
            System.out.println("\t5. Swimwear");

            category = input.nextInt();
        }

        if (category == 1) {
            return getWomenTops();

        } else if (category == 2) {
            return getWomenMatchingSets();

        } else if (category == 3) {
            return getWomenDresses();

        } else if (category == 4) {
            return getWomenJeans();

        } else {
            return getWomenSwimwear();
        }
    }
}
