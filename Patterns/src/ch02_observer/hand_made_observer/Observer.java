package ch02_observer.hand_made_observer;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
