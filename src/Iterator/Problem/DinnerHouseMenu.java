package Iterator.Problem;

public class DinnerHouseMenu {
    private MenuItem[] menuItems = new MenuItem[10]; ;
    private static int size = 0;
    public DinnerHouseMenu() {
        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog",
                "A hot dog, with sauerkraut, relish, onions, topped with cheese",
                false, 3.05);
    }
    public void addItem(String name, String description , boolean isVegitarian, double price) {
        MenuItem menuItem = new MenuItem(name,description,isVegitarian,price);
        if(size < menuItems.length) {
            menuItems[size++] = menuItem;
        }
        else {
            throw new IllegalStateException("The menu array is full");
        }
    }
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    public static int getArraySize(){
        return size;
    }
}
