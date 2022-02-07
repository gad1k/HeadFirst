package ch03_decorator.ex01_starbuzz_no_sizes;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
