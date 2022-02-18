package ch12_combining.ex06_observer;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " Just Quacked");
    }
}
