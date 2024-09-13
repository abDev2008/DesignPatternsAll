package Iterator.Problem;

public class DinnerHouseMenuIterator implements Iterator{
    MenuItem[] menuItems;
    private int size = 0;
    public DinnerHouseMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;

    }

    @Override
    public boolean hasNext() {
        if(size<DinnerHouseMenu.getArraySize()){
            return true;
        }
        return false;
    }

    @Override
    public MenuItem next() {
        if(hasNext()){
            return menuItems[size++];
        }
        return null;
    }
}
