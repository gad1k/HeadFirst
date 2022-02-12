package ch08_templatemethod.ex01_simple_barista;

public class Coffee {
    public void boilWater() {
        System.out.println("Boiling Water");
    }

    public void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through Filter");
    }

    public void pourInCup() {
        System.out.println("Pouring into Cup");
    }

    public void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }

    public void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }
}
