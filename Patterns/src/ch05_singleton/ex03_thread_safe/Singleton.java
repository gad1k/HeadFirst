package ch05_singleton.ex03_thread_safe;

public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null)
            synchronized (Singleton.class) {
                if (uniqueInstance == null)
                    uniqueInstance = new Singleton();
            }

        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }
}
