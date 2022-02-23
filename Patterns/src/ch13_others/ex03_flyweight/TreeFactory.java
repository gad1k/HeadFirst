package ch13_others.ex03_flyweight;

public class TreeFactory {
    Tree c;
    Tree d;

    public TreeFactory() {
        c = new ConiferTree();
        d = new DeciduousTree();
    }

    public Tree getTree(String type) throws Exception {
        if (type.equals("Conifer"))
            return c;
        else if (type.equals("Deciduous"))
            return d;
        else
            throw new Exception("Invalid Kind of Tree");
    }
}
