package behavioral.observer;

//client
public class BatterMeterApp extends Observer {

    private final int BATTERY_DRAIN = 10;

    public BatterMeterApp(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void doBatteryDrain() {
        System.out.println("BatterMeter: batteryDrain");

        State state = subject.getState();
        state.setBatterLevel(state.getBatterLevel() - BATTERY_DRAIN);
        subject.setState(state);
    }

    @Override
    void update() {
        System.out.println("BatteryMeter: Something has changed. Level at " + subject.getState().getBatterLevel() + "%");
    }
}
