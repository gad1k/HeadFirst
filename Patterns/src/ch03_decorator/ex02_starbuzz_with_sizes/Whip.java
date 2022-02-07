package ch03_decorator.ex02_starbuzz_with_sizes;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        double cost = 0.10 + beverage.cost();

        if (beverage.getSize() == Size.TALL)
            cost += 0.10;
        else if (beverage.getSize() == Size.GRANDE)
            cost += 0.15;
        else if (beverage.getSize() == Size.VENTI)
            cost += 0.20;

        return cost;
    }
}
