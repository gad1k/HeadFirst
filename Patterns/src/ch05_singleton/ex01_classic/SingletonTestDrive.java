package ch05_singleton.ex01_classic;

public class SingletonTestDrive {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
