package ch03_decorator.ex02_starbuzz_with_sizes;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
