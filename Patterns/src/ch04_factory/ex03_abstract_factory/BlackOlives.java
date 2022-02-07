package ch04_factory.ex03_abstract_factory;

public class BlackOlives implements Veggies {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return "Black Olives";
    }
}
