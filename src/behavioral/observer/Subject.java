package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

//can be interface - abstract for now
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    //concrete subject contract
    abstract void setState(State state); //might be a different object
    abstract State getState();

    //subject contract
    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update();
        }
    }
}
