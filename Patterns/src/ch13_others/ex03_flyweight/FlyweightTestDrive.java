package ch13_others.ex03_flyweight;

public class FlyweightTestDrive {
    public static void main(String[] args) {
        int[][] coniferLocations = {{10, 87}, {24, 76}, {2, 64}};
        int[][] deciduousLocations = {{1, 1}, {33, 50}, {100, 90}};

        TreeFactory treeFactory = new TreeFactory();
        Tree c, d;

        try {
            c = treeFactory.getTree("Conifer");
            for (int[] location :coniferLocations)
                c.display(location[0], location[1]);

            d = treeFactory.getTree("Deciduous");
            for (int[] location : deciduousLocations)
                d.display(location[0], location[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
