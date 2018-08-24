package behavioral.observer;

public class Phone extends Subject {

    private State state;

    public Phone(State state) {
        this.state = state;
    }

    @Override
    void setState(State state) {
        this.state = state;
        this.notifyObservers();
    }

    @Override
    State getState() {
        return state;
    }
}
