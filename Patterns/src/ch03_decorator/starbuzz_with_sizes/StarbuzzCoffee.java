package ch03_decorator.starbuzz_with_sizes;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        beverage.setSize(Beverage.Size.VENTI);
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
