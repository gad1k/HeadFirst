package ch05_singleton.ex02_statically;

public class StaticallyTestDrive {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
