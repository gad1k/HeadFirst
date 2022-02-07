package ch02_observer.ex02_hand_made_observer;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
