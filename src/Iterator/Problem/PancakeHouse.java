package Iterator.Problem;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouse {
    List<MenuItem> menuItems;
    public PancakeHouse() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs and toast",
                true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles with your choice of blueberries or strawberries",
                true,
                3.59);
    }
    public void addItem(String name,String description, boolean isVegiterian,double price) {
        MenuItem item = new MenuItem(name,description,isVegiterian,price);
        menuItems.add(item);
    }
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
