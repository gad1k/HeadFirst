package ch04_factory.ex03_abstract_factory;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        
        display.append(name + "\n");

        if (dough != null)
            display.append(dough + "\n");

        if (sauce != null)
            display.append(sauce + "\n");

        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                display.append(veggies[i]);
                if (i < veggies.length - 1)
                    display.append(", ");
            }
        }

        if (cheese != null)
            display.append(cheese);

        if (pepperoni != null)
            display.append(pepperoni);

        if (clams != null)
            display.append(clams);

        return display.toString();
    }
}
