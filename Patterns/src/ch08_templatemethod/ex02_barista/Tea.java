package ch08_templatemethod.ex02_barista;

public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Steeping the Tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
