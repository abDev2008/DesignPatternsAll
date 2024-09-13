package TemplatePattern.Problem;

public class Tea {
    void prepareReciepe(){
        boilWater();
        steepTeaBug();
        pourInCup();
       addLemon();
    }

    private void boilWater() {
        System.out.println("Boil water");
    }

    private void steepTeaBug() {
        System.out.println("Steep tea bug");
    }

    private void pourInCup() {
        System.out.println("Pour in cup");
    }

    private void addLemon() {
        System.out.println("Add lemon");
    }
}
