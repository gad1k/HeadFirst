package ch04_factory.abstract_factory;

public class BlackOlives implements Veggies {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return "Black Olives";
    }
}
