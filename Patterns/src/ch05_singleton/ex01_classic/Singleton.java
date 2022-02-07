package ch05_singleton.ex01_classic;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new Singleton();
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a classical Singleton!";
    }
}
