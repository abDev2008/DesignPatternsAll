package TemplatePattern.Solution;

public abstract class CaffeineBeverage {
    abstract void brew();
    abstract void addCondiments();
    final void prepareRecipe(){
        System.out.println("Step 1");
        boilWater();
        System.out.println("Step 2");
        brew();
        System.out.println("Step 3");
        pourInCup();
        System.out.println("Step 4");
        addCondiments();
    }

    private void pourInCup() {
        System.out.println("pouring in cup from super class");
    }

    private void boilWater() {
        System.out.println("boiling water froom super class");
    }
}
