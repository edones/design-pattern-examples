package behavioral.observer;

public class MessengerApp extends Observer {
    private final int BATTERY_DRAIN = 40;

    public MessengerApp(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }
    public void runGame() {
        System.out.println("Messenger: runGame");

        State state = subject.getState();
        state.setBatterLevel(state.getBatterLevel() - BATTERY_DRAIN);
        subject.setState(state);
    }

    @Override
    void update() {
        System.out.println("Something has changed. Level at " + subject.getState().getBatterLevel() + "%");
    }
}
