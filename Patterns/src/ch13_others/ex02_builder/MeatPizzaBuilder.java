package ch13_others.ex02_builder;

public class MeatPizzaBuilder extends PizzaBuilder {
    public MeatPizzaBuilder() {
        name = "Meat Pizza";
    }

    @Override
    public PizzaBuilder addCheese() {
        toppings.add("Mozzarella");
        return this;
    }

    @Override
    public PizzaBuilder addSauce() {
        toppings.add("NY Style Sauce");
        return this;
    }

    @Override
    public PizzaBuilder addTomatoes() {
        toppings.add("Sliced Tomatoes");
        return this;
    }

    @Override
    public PizzaBuilder addGarlic() {
        toppings.add("Garlic");
        return this;
    }

    @Override
    public PizzaBuilder addOlives() {
        return this;
    }

    @Override
    public PizzaBuilder addSpinach() {
        return this;
    }

    @Override
    public PizzaBuilder addPepperoni() {
        toppings.add("Pepperoni");
        return this;
    }

    @Override
    public PizzaBuilder addSausage() {
        toppings.add("Sausage");
        return this;
    }
}
