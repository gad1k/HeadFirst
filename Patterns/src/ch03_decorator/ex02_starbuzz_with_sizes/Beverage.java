package ch03_decorator.ex02_starbuzz_with_sizes;

public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI};
    Size size = Size.TALL;

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();
}
