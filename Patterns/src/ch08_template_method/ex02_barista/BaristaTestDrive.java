package ch08_template_method.ex02_barista;

public class BaristaTestDrive {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        System.out.println("Making coffee...");
        coffee.prepareRecipe();

        System.out.println("");

        System.out.println("Making tea...");
        tea.prepareRecipe();
    }
}
