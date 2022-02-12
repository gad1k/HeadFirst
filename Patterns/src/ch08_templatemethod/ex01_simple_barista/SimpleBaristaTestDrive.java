package ch08_templatemethod.ex01_simple_barista;

public class SimpleBaristaTestDrive {
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
