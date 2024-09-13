package TemplatePattern.Solution;

public class Application {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
