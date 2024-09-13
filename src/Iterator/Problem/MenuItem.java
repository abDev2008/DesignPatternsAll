package Iterator.Problem;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private boolean isVegiterian;

    public MenuItem(String name, String description, boolean isVegiterian, double price) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.isVegiterian = isVegiterian;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegiterian() {
        return isVegiterian;
    }
}
