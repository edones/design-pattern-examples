package behavioral.observer;

public class State {
    private int batterLevel;

    public State(int batterLevel) {
        this.batterLevel = batterLevel;
    }

    public int getBatterLevel() {
        return batterLevel;
    }

    public void setBatterLevel(int batterLevel) {
        this.batterLevel = batterLevel;
    }
}
