package ch12_combining.ex06_observer;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
