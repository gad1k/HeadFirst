package ch08_template_method.ex02_barista;

public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through Filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
