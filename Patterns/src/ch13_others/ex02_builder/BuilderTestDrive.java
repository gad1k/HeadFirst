package ch13_others.ex02_builder;

public class BuilderTestDrive {
    public static void main(String[] args) {
        PizzaBuilder veggieBuilder = new VeggiePizzaBuilder();
        Pizza veggie = veggieBuilder.addSauce().addCheese().addOlives().addTomatoes().addSauce().build();
        veggie.prepare();
        veggie.bake();
        veggie.cut();
        veggie.box();
        System.out.println(veggie);

        PizzaBuilder meatBuilder = new MeatPizzaBuilder();
        Pizza meat = meatBuilder.addSauce().addTomatoes().addCheese().addPepperoni().build();
        meat.prepare();
        meat.bake();
        meat.cut();
        meat.box();
        System.out.println(meat);
    }
}
