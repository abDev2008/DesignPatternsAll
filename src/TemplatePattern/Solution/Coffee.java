package TemplatePattern.Solution;

public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("brewing coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("adding coffee condiments");
    }
}
