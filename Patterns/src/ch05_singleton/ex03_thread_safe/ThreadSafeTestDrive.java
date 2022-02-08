package ch05_singleton.ex03_thread_safe;

public class ThreadSafeTestDrive {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
