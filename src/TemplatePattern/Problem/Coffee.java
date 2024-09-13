package TemplatePattern.Problem;

public class Coffee {
    void prepareReciepe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        AddSugurAndMilk();
    }



    private void AddSugurAndMilk() {
        System.out.println("AddSugurAndMilk");
    }

    private void pourInCup() {
        System.out.println("pourInCup");
    }

    private void brewCoffeeGrinds() {
        System.out.println("brewCoffeeGrinds");
    }

    private void boilWater() {
        System.out.println("boilWater");
    }
}
