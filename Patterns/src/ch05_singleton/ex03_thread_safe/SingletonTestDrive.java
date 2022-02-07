package ch05_singleton.ex03_thread_safe;

public class SingletonTestDrive {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
