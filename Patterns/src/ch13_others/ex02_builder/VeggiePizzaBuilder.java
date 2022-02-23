package ch13_others.ex02_builder;

public class VeggiePizzaBuilder extends PizzaBuilder {
    public VeggiePizzaBuilder() {
        name = "Veggie Pizza";
    }

    @Override
    public PizzaBuilder addCheese() {
        toppings.add("Parmesan");
        return this;
    }

    @Override
    public PizzaBuilder addSauce() {
        toppings.add("Sauce");
        return this;
    }

    @Override
    public PizzaBuilder addTomatoes() {
        toppings.add("Chopped Tomatoes");
        return this;
    }

    @Override
    public PizzaBuilder addGarlic() {
        toppings.add("Garlic");
        return this;
    }

    @Override
    public PizzaBuilder addOlives() {
        toppings.add("Green Olives");
        return this;
    }

    @Override
    public PizzaBuilder addSpinach() {
        toppings.add("Spinach");
        return this;
    }

    @Override
    public PizzaBuilder addPepperoni() {
        return this;
    }

    @Override
    public PizzaBuilder addSausage() {
        return this;
    }
}
