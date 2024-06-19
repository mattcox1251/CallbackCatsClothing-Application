package clothes;

import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class ShopMen {
    private static ClothingInformation[] graphicTees;
    private static ClothingInformation[] jeans;
    private static ClothingInformation[] shorts;
    private static ClothingInformation[] hoodies;
    private static ClothingInformation[] swimwear;
    static final String sizes = "S, M, L, XL";

    public static void setMenGraphicTees() {
        Random rand = new Random();

        NumberFormat fmt = NumberFormat.getInstance();
        fmt.setMaximumFractionDigits(2);

        graphicTees = new ClothingInformation[5];

        graphicTees[0] = new ClothingInformation("Mercedes Graphic Tee", "Red Brown", sizes,
                fmt.format(rand.nextDouble(35) + 12));

        graphicTees[1] = new ClothingInformation("Blessed Graphic Tee", "Raspberry Red", sizes,
                fmt.format(rand.nextDouble(35) + 12));

        graphicTees[2] = new ClothingInformation("Selena Graphic Tee", "Gray", sizes,
                fmt.format(rand.nextDouble(35) + 12));

        graphicTees[3] = new ClothingInformation("Stranger Things Graphic Tee", "Dark Blue", sizes,
                fmt.format(rand.nextDouble(35) + 12));

        graphicTees[4] = new ClothingInformation("Friends Graphic Tee", "Blue Green", sizes,
                fmt.format(rand.nextDouble(35) + 12));
    }

    public static ClothingInformation[] getMenGraphicTees() {
        return graphicTees;
    }

    public static void setMenJeans() {
        Random rand = new Random();

        NumberFormat fmt = NumberFormat.getInstance();
        fmt.setMaximumFractionDigits(2);

        jeans = new ClothingInformation[5];

        jeans[0] = new ClothingInformation("Patched Skinny Jeans", "Black", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        jeans[1] = new ClothingInformation("Cornell Slim Jeans", "Khaki", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        jeans[2] = new ClothingInformation("Day and Night Flare Jeans", "Light Wash", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        jeans[3] = new ClothingInformation("Fray Vertical Panel Flared Jeans", "Chocolate", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        jeans[4] = new ClothingInformation("Basic Skinny Jeans", "Blue", sizes,
                fmt.format(rand.nextDouble(30) + 35));
    }

    public static ClothingInformation[] getMenJeans() {
        return jeans;
    }

    public static void setMenShorts() {
        Random rand = new Random();

        NumberFormat fmt = NumberFormat.getInstance();
        fmt.setMaximumFractionDigits(2);

        shorts = new ClothingInformation[5];

        shorts[0] = new ClothingInformation("Notorious 91 Sweatshort", "Heather Gray", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        shorts[1] = new ClothingInformation("Dean Textured Short", "Cream", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        shorts[2] = new ClothingInformation("Cargo Shorts", "Black", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        shorts[3] = new ClothingInformation("Regular Denim Shorts", "Medium Wash", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        shorts[4] = new ClothingInformation("Ripped Denim Shorts", "Black", sizes,
                fmt.format(rand.nextDouble(30) + 35));
    }

    public static ClothingInformation[] getMenShorts() {
        return shorts;
    }

    public static void setMenHoodies() {
        Random rand = new Random();

        NumberFormat fmt = NumberFormat.getInstance();
        fmt.setMaximumFractionDigits(2);

        hoodies = new ClothingInformation[5];

        hoodies[0] = new ClothingInformation("Original Essentials Hoodie", "Grey", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        hoodies[1] = new ClothingInformation("NLB Zip Up Hoodie", "Navy Blue", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        hoodies[2] = new ClothingInformation("Roses Hoodie", "Black", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        hoodies[3] = new ClothingInformation("Tyson Hoodie", "Tan", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        hoodies[4] = new ClothingInformation("Tyson Hoodie", "White", sizes,
                fmt.format(rand.nextDouble(30) + 35));
    }

    public static ClothingInformation[] getMenHoodies() {
        return hoodies;
    }

    public static void setMenSwimwear() {
        Random rand = new Random();

        NumberFormat fmt = NumberFormat.getInstance();
        fmt.setMaximumFractionDigits(2);

        swimwear = new ClothingInformation[5];

        swimwear[0] = new ClothingInformation("Goku Swim Trunks", "Orange", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        swimwear[1] = new ClothingInformation("Smiley Faces Swim Trunks", "Navy Blue", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        swimwear[2] = new ClothingInformation("Animal Kingdom Swim Trunks", "Brown", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        swimwear[3] = new ClothingInformation("Hustle Swim Trunks", "Tan", sizes,
                fmt.format(rand.nextDouble(30) + 35));

        swimwear[4] = new ClothingInformation("Trip Swim Trunks", "White", sizes,
                fmt.format(rand.nextDouble(30) + 35));
    }

    public static ClothingInformation[] getMenSwimwear() {
        return swimwear;
    }

    public static ClothingInformation[] getMenCategories() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nChoose a category: ");
        System.out.println("\t1. Graphic Tees");
        System.out.println("\t2. Jeans");
        System.out.println("\t3. Shorts");
        System.out.println("\t4. Hoodies");
        System.out.println("\t5. Swimwear");

        int category = input.nextInt();

        while (category > 5 || category < 1) {
            System.out.println("\nPlease enter a valid choice.\n");

            System.out.println("Choose a category: ");
            System.out.println("\t1. Graphic Tees");
            System.out.println("\t2. Jeans");
            System.out.println("\t3. Shorts");
            System.out.println("\t4. Hoodies");
            System.out.println("\t5. Swimwear");

            category = input.nextInt();
        }

        if (category == 1) {
            return getMenGraphicTees();

        } else if (category == 2) {
            return getMenJeans();

        } else if (category == 3) {
            return getMenShorts();

        } else if (category == 4) {
            return getMenHoodies();

        } else {
            return getMenSwimwear();
        }
    }
}
