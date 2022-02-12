package ch08_templatemethod.ex01_simple_barista;

public class Tea {
    public void boilWater() {
        System.out.println("Boiling Water");
    }

    public void steepTeaBag() {
        System.out.println("Steeping the Tea");
    }

    public void pourInCup() {
        System.out.println("Pouring into Cup");
    }

    public void addLemon() {
        System.out.println("Adding Lemon");
    }

    public void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }
}
