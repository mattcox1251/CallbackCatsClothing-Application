package clothes;

public class ClothingInformation {
    private String name;
    private String color;
    private String sizes;
    private String price;

    public ClothingInformation(String name, String color, String sizes, String price) {
        this.name = name;
        this.color = color;
        this.sizes = sizes;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSizes() {
        return sizes;
    }

    public String getPrice() {
        return price;
    }
}
