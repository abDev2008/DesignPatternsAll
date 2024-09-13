package Iterator.Problem;

import java.util.ArrayList;
import java.util.List;

public class Waitress {
    private DinnerHouseMenu dinnerHouseMenu;
    private PancakeHouse pancakeHouseMenu;

    public Waitress(DinnerHouseMenu dinnerHouseMenu, PancakeHouse pancakeHouseMenu) {
        this.dinnerHouseMenu = dinnerHouseMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }
    public void printMenu() {
        MenuItem[] menuItems = dinnerHouseMenu.getMenuItems();
        List<MenuItem> menuItemList = pancakeHouseMenu.getMenuItems();
        System.out.println("List for breakfast");
        for(MenuItem menuItem : menuItemList) {
            System.out.print(menuItem.getName()+" ");
            System.out.print(menuItem.getDescription()+" ");
            System.out.print(menuItem.isVegiterian()+" ");
            System.out.println(menuItem.getPrice()+" ");


        }
        System.out.println("list for lunch");
        System.out.println();
        for ( int i = 0; i<DinnerHouseMenu.getArraySize();i++) {
            System.out.print(menuItems[i].getName()+" ");
            System.out.print(menuItems[i].getDescription()+" ");
            System.out.print(menuItems[i].isVegiterian()+" ");
            System.out.println(menuItems[i].getPrice());


        }


    }
}
