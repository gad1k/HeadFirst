package ch08_template_method.ex02_barista;

public abstract class CaffeineBeverage {
    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling Water");
    }

    public void pourInCup() {
        System.out.println("Pouring into Cup");
    }

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
}
