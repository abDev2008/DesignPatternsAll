package Iterator.Problem;

public class Application {
    public static void main(String[] args) {
        PancakeHouse pancakeHouse = new PancakeHouse();
        DinnerHouseMenu dinnerHouseMenu = new DinnerHouseMenu();
        Waitress waitress = new Waitress(dinnerHouseMenu,pancakeHouse);
        waitress.printMenu();
    }
}
